package com.example.controllers;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class JSONProcessingController {

    @GetMapping("/categories")
    public String getCategories() {
        // 连接数据库
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name", "username", "password");

            // 查询分类数据
            List<SysCate> sysCateList = querySysCateData(connection);

            // 构建 JSON 数据
            JSONArray jsonArray = buildJSON(sysCateList);

            // 转换为 JSON 字符串
            String json = jsonArray.toJSONString();
            return json;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭数据库连接
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    // 查询分类数据
    private List<SysCate> querySysCateData(Connection connection) throws SQLException {
        List<SysCate> sysCateList = new ArrayList<>();
        String sql = "SELECT * FROM sys_cate";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            SysCate sysCate = new SysCate();
            sysCate.setCateId(resultSet.getLong("cate_id"));
            sysCate.setParentId(resultSet.getLong("parent_id"));
            sysCate.setCateName(resultSet.getString("cate_name"));
            sysCateList.add(sysCate);
        }

        resultSet.close();
        statement.close();
        return sysCateList;
    }

    // 构建 JSON 数据
    private JSONArray buildJSON(List<SysCate> sysCateList) {
        JSONArray jsonArray = new JSONArray();

        for (SysCate sysCate : sysCateList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", sysCate.getCateName());
            jsonObject.put("en_name", "");
            jsonObject.put("icon", "");

            // 递归构建子分类
            List<SysCate> children = findChildrenByParentId(sysCate.getCateId());
            if (!children.isEmpty()) {
                JSONArray childrenArray = buildJSON(children);
                jsonObject.put("children", childrenArray);
            }

            jsonArray.add(jsonObject);
        }

        return jsonArray;
    }

    // 根据父分类 ID 查询子分类
    private List<SysCate> findChildrenByParentId(long parentId) {
        // 根据实际情况，这里可以使用数据库查询或其他方式获取相应的对象数据
        // 这里为了演示，只使用了一个固定的对象作为示例
        List<SysCate> children = new ArrayList<>();
        if (parentId == 1) {
            SysCate child = new SysCate();
            child.setCateId(2);
            child.setParentId(1);
            child.setCateName("Child Category");
            children.add(child);
        }
        return children;
    }

    static class SysCate {
        private long cateId;
        private long parentId;
        private String cateName;

        public long getCateId() {
            return cateId;
        }

        public void setCateId(long cateId) {
            this.cateId = cateId;
        }

        public long getParentId() {
            return parentId;
        }

        public void setParentId(long parentId) {
            this.parentId = parentId;
        }

        public String getCateName() {
            return cateName;
        }

        public void setCateName(String cateName) {
            this.cateName = cateName;
        }
    }
}

