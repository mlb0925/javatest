package com.example.models;

public class Web {
    private String url;
    private String logo;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String title;
    private String desc;

    // getter and setter methods

    @Override
    public String toString() {
        return "Web{" +
                "url='" + url + '\'' +
                ", logo='" + logo + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
