package edu.hunau.love.pojo;

import java.util.Date;

public class Activity {
    private String id;

    private String aActivity;

    private Date aDotime;

    private String aAddress;

    private String aManager;

    private String aAtypes;

    private String aTeamname;

    private Integer aCounts;

    private String aOn;

    private String aChecked;

    private String aContent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getaActivity() {
        return aActivity;
    }

    public void setaActivity(String aActivity) {
        this.aActivity = aActivity == null ? null : aActivity.trim();
    }

    public Date getaDotime() {
        return aDotime;
    }

    public void setaDotime(Date aDotime) {
        this.aDotime = aDotime;
    }

    public String getaAddress() {
        return aAddress;
    }

    public void setaAddress(String aAddress) {
        this.aAddress = aAddress == null ? null : aAddress.trim();
    }

    public String getaManager() {
        return aManager;
    }

    public void setaManager(String aManager) {
        this.aManager = aManager == null ? null : aManager.trim();
    }

    public String getaAtypes() {
        return aAtypes;
    }

    public void setaAtypes(String aAtypes) {
        this.aAtypes = aAtypes == null ? null : aAtypes.trim();
    }

    public String getaTeamname() {
        return aTeamname;
    }

    public void setaTeamname(String aTeamname) {
        this.aTeamname = aTeamname == null ? null : aTeamname.trim();
    }

    public Integer getaCounts() {
        return aCounts;
    }

    public void setaCounts(Integer aCounts) {
        this.aCounts = aCounts;
    }

    public String getaOn() {
        return aOn;
    }

    public void setaOn(String aOn) {
        this.aOn = aOn == null ? null : aOn.trim();
    }

    public String getaChecked() {
        return aChecked;
    }

    public void setaChecked(String aChecked) {
        this.aChecked = aChecked == null ? null : aChecked.trim();
    }

    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent == null ? null : aContent.trim();
    }
}