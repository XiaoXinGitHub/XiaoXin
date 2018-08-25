package edu.hunau.love.pojo;

public class TeamMember {
    private String uName;

    private String teamNames;

    private String checked;

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getTeamNames() {
        return teamNames;
    }

    public void setTeamNames(String teamNames) {
        this.teamNames = teamNames == null ? null : teamNames.trim();
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked == null ? null : checked.trim();
    }
}