package com.example.models;

import java.time.LocalDateTime;

public class Category {
    private int id;
    private int parentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private int sort;
    private String title;
    private String icon;
    private int levels;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private int userId;
    private String color;
    private char status;
    private String url;

    // getter and setter methods

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", sort=" + sort +
                ", title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", levels=" + levels +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", userId=" + userId +
                ", color='" + color + '\'' +
                ", status=" + status +
                ", url='" + url + '\'' +
                '}';
    }
}
