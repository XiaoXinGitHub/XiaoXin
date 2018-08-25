package edu.hunau.love.service;

import java.util.List;

import edu.hunau.love.pojo.Team;

public interface TeamBiz {
	Team findByTeamName(String teamName);
	
	List<Team> showAllTeam();
	
	void modifyTeam(Team team);
	
	List<Team> showAllTeamNotChecked();
	
	void checkedTeam(String teamName);
	void update(Team team);
}
