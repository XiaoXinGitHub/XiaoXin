package edu.hunau.love.service;

import java.util.List;

import edu.hunau.love.pojo.TeamMember;

public interface TeamMemberBiz {
	List<TeamMember> queryByTeamNames(String teamNames);
	
	List<TeamMember> queryByCheckedTeamNames(String teamNames);
	
	void deleteTeamCheckingMember(String uName);
	
	void modifyTeamMember(TeamMember teamMember);
	
	TeamMember findByUname(String uName);
	
	void insertMember(TeamMember teamMember);
	
}
