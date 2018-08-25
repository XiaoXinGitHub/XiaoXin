package edu.hunau.love.pojo;

import java.util.Date;

public class User {
    private String id;

    private String uUsername;

    private String uPwd;

    private String uSex;

    private String uTruename;

    private String uSId;

    private String uEmail;

    private String uImage;

    private String uTeamName;

    private String uPeopletypes;

    private Date uDotime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public String getuTruename() {
        return uTruename;
    }

    public void setuTruename(String uTruename) {
        this.uTruename = uTruename == null ? null : uTruename.trim();
    }

    public String getuSId() {
        return uSId;
    }

    public void setuSId(String uSId) {
        this.uSId = uSId == null ? null : uSId.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuImage() {
        return uImage;
    }

    public void setuImage(String uImage) {
        this.uImage = uImage == null ? null : uImage.trim();
    }

    public String getuTeamName() {
        return uTeamName;
    }

    public void setuTeamName(String uTeamName) {
        this.uTeamName = uTeamName == null ? null : uTeamName.trim();
    }

    public String getuPeopletypes() {
        return uPeopletypes;
    }

    public void setuPeopletypes(String uPeopletypes) {
        this.uPeopletypes = uPeopletypes == null ? null : uPeopletypes.trim();
    }

    public Date getuDotime() {
        return uDotime;
    }

    public void setuDotime(Date uDotime) {
        this.uDotime = uDotime;
    }
}