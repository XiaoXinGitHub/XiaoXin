package edu.hunau.love.pojo;

import java.util.Date;

public class Award {
    private String id;

    private String awAward;

    private Date awTime;

    private String awHost;

    private String awDescribe;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAwAward() {
        return awAward;
    }

    public void setAwAward(String awAward) {
        this.awAward = awAward == null ? null : awAward.trim();
    }

    public Date getAwTime() {
        return awTime;
    }

    public void setAwTime(Date awTime) {
        this.awTime = awTime;
    }

    public String getAwHost() {
        return awHost;
    }

    public void setAwHost(String awHost) {
        this.awHost = awHost == null ? null : awHost.trim();
    }

    public String getAwDescribe() {
        return awDescribe;
    }

    public void setAwDescribe(String awDescribe) {
        this.awDescribe = awDescribe == null ? null : awDescribe.trim();
    }
}