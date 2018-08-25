package edu.hunau.love.pojo;

import java.util.Date;

public class Team {
    private String teamId;

    private String teamName;

    private String foundName;

    private Date teamTime;

    private String teacher;

    private String teamEmail;

    private String teamImage;

    private String teamColleage;

    private String teamLeader;

    private String teamGrade;

    private String reamChecked;

    private String teamIntroduce;

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public String getFoundName() {
        return foundName;
    }

    public void setFoundName(String foundName) {
        this.foundName = foundName == null ? null : foundName.trim();
    }

    public Date getTeamTime() {
        return teamTime;
    }

    public void setTeamTime(Date teamTime) {
        this.teamTime = teamTime;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public String getTeamEmail() {
        return teamEmail;
    }

    public void setTeamEmail(String teamEmail) {
        this.teamEmail = teamEmail == null ? null : teamEmail.trim();
    }

    public String getTeamImage() {
        return teamImage;
    }

    public void setTeamImage(String teamImage) {
        this.teamImage = teamImage == null ? null : teamImage.trim();
    }

    public String getTeamColleage() {
        return teamColleage;
    }

    public void setTeamColleage(String teamColleage) {
        this.teamColleage = teamColleage == null ? null : teamColleage.trim();
    }

    public String getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(String teamLeader) {
        this.teamLeader = teamLeader == null ? null : teamLeader.trim();
    }

    public String getTeamGrade() {
        return teamGrade;
    }

    public void setTeamGrade(String teamGrade) {
        this.teamGrade = teamGrade == null ? null : teamGrade.trim();
    }

    public String getReamChecked() {
        return reamChecked;
    }

    public void setReamChecked(String reamChecked) {
        this.reamChecked = reamChecked == null ? null : reamChecked.trim();
    }

    public String getTeamIntroduce() {
        return teamIntroduce;
    }

    public void setTeamIntroduce(String teamIntroduce) {
        this.teamIntroduce = teamIntroduce == null ? null : teamIntroduce.trim();
    }
}