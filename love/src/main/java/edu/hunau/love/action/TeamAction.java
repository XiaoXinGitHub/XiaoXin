package edu.hunau.love.action;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.hunau.love.pojo.Activity;
import edu.hunau.love.pojo.Team;
import edu.hunau.love.pojo.TeamMember;
import edu.hunau.love.pojo.User;
import edu.hunau.love.service.ActivityBiz;
import edu.hunau.love.service.TeamBiz;
import edu.hunau.love.service.TeamMemberBiz;
import edu.hunau.love.service.UserBiz;

@Controller
public class TeamAction {
	@Autowired
	private TeamBiz teamBiz;
	@Autowired
	private ActivityBiz activityBiz;
	@Autowired
	private UserBiz userBiz;
	@Autowired
	private TeamMemberBiz teamMemberBiz;
	
	ModelAndView mv = null;
	@RequestMapping("team.action")
	public ModelAndView showTeam(String teamName) {
		mv=new ModelAndView();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Team team = teamBiz.findByTeamName(teamName);
		List<Activity> allActivity = activityBiz.findAllActivityMyTeam(teamName);
		List<String> times=new ArrayList<>();
		for (Activity activity : allActivity) {
			times.add(format.format(activity.getaDotime()));
		}
		String time = format.format(team.getTeamTime());
		mv.addObject("teamtime",time);
		mv.addObject("team",team);
		mv.addObject("activitytime", times);
		mv.addObject("allActivity", allActivity);
		mv.setViewName("team");
		return mv;
	}
	@RequestMapping("showAllTeam.action")
	public ModelAndView showAllTeam(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,ModelAndView mv) {
		PageHelper.startPage(pn, 5);
		List<Team> allTeam = teamBiz.showAllTeam();
		PageInfo pageInfo = new PageInfo<>(allTeam,5);
		mv.addObject("pageInfo",pageInfo);
		mv.setViewName("teamlist");
		return mv;
	}
	@RequestMapping("leader.action")
	public ModelAndView leader(String teamName,ModelAndView mv) {
		Team team = teamBiz.findByTeamName(teamName);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String time = format.format(team.getTeamTime());
		List<Activity> allActivity = activityBiz.findAllActivityMyTeam(teamName);
		List<String> times=new ArrayList<>();
		for (Activity activity : allActivity) {
			times.add(format.format(activity.getaDotime()));
		}
		mv.addObject("activitytime", times);
		mv.addObject("allActivity", allActivity);
		mv.addObject("teamtime",time);
		mv.addObject("team", team);
		mv.setViewName("gteam");
		return mv;
	}
	@RequestMapping("modifyTeam.action")
	public ModelAndView changeTeam(Team team,ModelAndView mv) {
		Team team1=null;
		try {
			team1=new Team();
			team1.setTeamName(new String(team.getTeamName().getBytes("ISO-8859-1"),"UTF-8"));
			team1.setFoundName(new String(team.getFoundName().getBytes("ISO-8859-1"),"UTF-8"));
			team1.setTeacher(new String(team.getTeacher().getBytes("ISO-8859-1"),"UTF-8"));
			team1.setTeamEmail(new String(team.getTeamEmail().getBytes("ISO-8859-1"),"UTF-8"));
			team1.setTeamIntroduce(new String(team.getTeamIntroduce().getBytes("ISO-8859-1"),"UTF-8"));
			team1.setTeamLeader(new String(team.getTeamLeader().getBytes("ISO-8859-1"),"UTF-8"));
			teamBiz.update(team1);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return leader(team1.getTeamName(),mv);
	}
	@RequestMapping("teamcheck.action")
	public ModelAndView showAllNotChecked(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,ModelAndView mv) {
		PageHelper.startPage(pn, 5);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		List<Team> list = teamBiz.showAllTeamNotChecked();
		List<String> times = new ArrayList<>();
		for (Team team : list) {
			times.add(format.format(team.getTeamTime()));
		}
		PageInfo pageInfo = new PageInfo<>(list,5);
		mv.addObject("pageInfo",pageInfo);
		mv.addObject("times", times);
		mv.setViewName("adminTeamCheck");
		return mv;
	}
	@RequestMapping("checkTeam.action")
	public ModelAndView showAreadtychecked(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,String teamName,ModelAndView mv) {
		teamBiz.checkedTeam(teamName);
		mv.setViewName("adminTeamCheck");
		return mv;	
	}
	@RequestMapping("showTeamAlreadychecked.action")
	public ModelAndView showAllAlreadychecked(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,ModelAndView mv) {
		PageHelper.startPage(pn, 10);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		List<Team> list = teamBiz.showAllTeam();
		List<String> times = new ArrayList<>();
		for (Team team : list) {
			times.add(format.format(team.getTeamTime()));
		}
		PageInfo pageInfo = new PageInfo<>(list,5);
		mv.addObject("pageInfo",pageInfo);
		mv.addObject("times", times);
		mv.setViewName("adminTeamexist");
		return mv;
		
	}
	@RequestMapping("jointeam.action")
	public ModelAndView joinTeam(ModelAndView mv,String uUsername,String teamName,HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		TeamMember teamMember=new TeamMember();
		teamMember.setTeamNames(teamName);
		teamMember.setuName(uUsername);
		teamMemberBiz.insertMember(teamMember);
		mv.setViewName("success");
		return mv;
	}
}
