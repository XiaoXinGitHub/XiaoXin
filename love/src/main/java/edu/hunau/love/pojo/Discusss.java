package edu.hunau.love.pojo;

import java.util.Date;

public class Discusss {
    private String id;

    private Date discusssTime;

    private String discusssUsername;

    private String oDiscusssUsername;

    private String discussPid;

    private String discussContent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getDiscusssTime() {
        return discusssTime;
    }

    public void setDiscusssTime(Date discusssTime) {
        this.discusssTime = discusssTime;
    }

    public String getDiscusssUsername() {
        return discusssUsername;
    }

    public void setDiscusssUsername(String discusssUsername) {
        this.discusssUsername = discusssUsername == null ? null : discusssUsername.trim();
    }

    public String getoDiscusssUsername() {
        return oDiscusssUsername;
    }

    public void setoDiscusssUsername(String oDiscusssUsername) {
        this.oDiscusssUsername = oDiscusssUsername == null ? null : oDiscusssUsername.trim();
    }

    public String getDiscussPid() {
        return discussPid;
    }

    public void setDiscussPid(String discussPid) {
        this.discussPid = discussPid == null ? null : discussPid.trim();
    }

    public String getDiscussContent() {
        return discussContent;
    }

    public void setDiscussContent(String discussContent) {
        this.discussContent = discussContent == null ? null : discussContent.trim();
    }
}