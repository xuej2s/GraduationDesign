package sdu.lpy.entity;

import java.util.Date;

public class News {
    private String newId;

    private String newsName;

    private String newsConfig;

    private Date newsTime;

    public String getNewId() {
        return newId;
    }

    public void setNewId(String newId) {
        this.newId = newId == null ? null : newId.trim();
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName == null ? null : newsName.trim();
    }

    public String getNewsConfig() {
        return newsConfig;
    }

    public void setNewsConfig(String newsConfig) {
        this.newsConfig = newsConfig == null ? null : newsConfig.trim();
    }

    public Date getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(Date newsTime) {
        this.newsTime = newsTime;
    }
}