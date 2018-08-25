package edu.hunau.love.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hunau.love.mapper.TeamMapper;
import edu.hunau.love.pojo.Team;
import edu.hunau.love.service.TeamBiz;
@Service
public class TeamBizImpl implements TeamBiz{
	@Autowired
	private TeamMapper teamMapper;
	@Override
	public Team findByTeamName(String teamName) {
		Team team = teamMapper.selectByTeamName(teamName);
		if(team==null) {
			throw new RuntimeException("团队名字有误!");
		}
		return team;
	}
	@Override
	public List<Team> showAllTeam() {
		List<Team> list = teamMapper.selectAllTeam();
		return list;
	}
	@Override
	public void modifyTeam(Team team) {
		teamMapper.updateByTeamName(team);
	}
	@Override
	public List<Team> showAllTeamNotChecked() {
		List<Team> allNotChecked = teamMapper.selectAllNotChecked();
		return allNotChecked;
	}
	@Override
	public void checkedTeam(String teamName) {
		teamMapper.updateTeamChecked(teamName);
	}
	@Override
	public void update(Team team) {
		teamMapper.updateTeam(team);	
	}
}
