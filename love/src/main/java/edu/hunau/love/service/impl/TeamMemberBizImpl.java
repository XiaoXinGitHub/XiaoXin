package edu.hunau.love.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hunau.love.mapper.TeamMemberMapper;
import edu.hunau.love.pojo.TeamMember;
import edu.hunau.love.service.TeamMemberBiz;
@Service
public class TeamMemberBizImpl implements TeamMemberBiz{
	@Autowired
	private TeamMemberMapper teamMemberMapper;
	@Override
	public List<TeamMember> queryByTeamNames(String teamNames) {
		List<TeamMember> queryByTeamNames = teamMemberMapper.selectByTeamNames(teamNames);
		return queryByTeamNames;
	}
	@Override
	public void deleteTeamCheckingMember(String uName) {
		teamMemberMapper.deleteByPrimaryKey(uName);
	}
	@Override
	public void modifyTeamMember(TeamMember teamMember) {
		teamMemberMapper.updateByPrimaryKey(teamMember);
		
	}
	@Override
	public TeamMember findByUname(String uName) {
	TeamMember teamMember = teamMemberMapper.selectByPrimaryKey(uName);
		return teamMember;
	}
	@Override
	public List<TeamMember> queryByCheckedTeamNames(String teamNames) {
		List<TeamMember> list = teamMemberMapper.selectByCheckedTeamNames(teamNames);
		return list;
	}
	@Override
	public void insertMember(TeamMember teamMember) {
		teamMemberMapper.insertSelective(teamMember);
	}
}
