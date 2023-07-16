package com.example.models;

import java.time.LocalDateTime;

public class SysCate {
    private long cateId;
    private long parentId;

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

    public String getAncestors() {
        return ancestors;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public char getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(char delFlag) {
        this.delFlag = delFlag;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public char getHots() {
        return hots;
    }

    public void setHots(char hots) {
        this.hots = hots;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    private String ancestors;
    private String cateName;
    private int orderNum;
    private char status;
    private char delFlag;
    private String createBy;
    private LocalDateTime createTime;
    private String updateBy;
    private LocalDateTime updateTime;
    private Integer userId;
    private char hots;
    private String icon;

    // getter and setter methods

    @Override
    public String toString() {
        return "SysCate{" +
                "cateId=" + cateId +
                ", parentId=" + parentId +
                ", ancestors='" + ancestors + '\'' +
                ", cateName='" + cateName + '\'' +
                ", orderNum=" + orderNum +
                ", status=" + status +
                ", delFlag=" + delFlag +
                ", createBy='" + createBy + '\'' +
                ", createTime=" + createTime +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime=" + updateTime +
                ", userId=" + userId +
                ", hots=" + hots +
                ", icon='" + icon + '\'' +
                '}';
    }
}

