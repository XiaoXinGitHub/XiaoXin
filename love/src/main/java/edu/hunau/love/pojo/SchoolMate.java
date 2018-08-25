package edu.hunau.love.pojo;

import java.util.Date;

public class SchoolMate {
    private String id;

    private Date schoolmateDotime;

    private String schoolmateImg;

    private String schoolmateChecked;

    private String schoolmateUsername;

    private String schoolmateInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getSchoolmateDotime() {
        return schoolmateDotime;
    }

    public void setSchoolmateDotime(Date schoolmateDotime) {
        this.schoolmateDotime = schoolmateDotime;
    }

    public String getSchoolmateImg() {
        return schoolmateImg;
    }

    public void setSchoolmateImg(String schoolmateImg) {
        this.schoolmateImg = schoolmateImg == null ? null : schoolmateImg.trim();
    }

    public String getSchoolmateChecked() {
        return schoolmateChecked;
    }

    public void setSchoolmateChecked(String schoolmateChecked) {
        this.schoolmateChecked = schoolmateChecked == null ? null : schoolmateChecked.trim();
    }

    public String getSchoolmateUsername() {
        return schoolmateUsername;
    }

    public void setSchoolmateUsername(String schoolmateUsername) {
        this.schoolmateUsername = schoolmateUsername == null ? null : schoolmateUsername.trim();
    }

    public String getSchoolmateInfo() {
        return schoolmateInfo;
    }

    public void setSchoolmateInfo(String schoolmateInfo) {
        this.schoolmateInfo = schoolmateInfo == null ? null : schoolmateInfo.trim();
    }
}