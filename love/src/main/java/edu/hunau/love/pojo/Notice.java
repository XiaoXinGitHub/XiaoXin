package edu.hunau.love.pojo;

import java.util.Date;

public class Notice {
    private String id;

    private Date noticeDotime;

    private String noticeUsername;

    private String noticeContent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getNoticeDotime() {
        return noticeDotime;
    }

    public void setNoticeDotime(Date noticeDotime) {
        this.noticeDotime = noticeDotime;
    }

    public String getNoticeUsername() {
        return noticeUsername;
    }

    public void setNoticeUsername(String noticeUsername) {
        this.noticeUsername = noticeUsername == null ? null : noticeUsername.trim();
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }
}