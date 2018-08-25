package edu.hunau.love.action;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import edu.hunau.love.pojo.TeamMember;
import edu.hunau.love.pojo.User;
import edu.hunau.love.service.TeamMemberBiz;
import edu.hunau.love.service.UserBiz;

@Controller
public class TeamMemberAction {
	@Autowired
	private TeamMemberBiz teamMemberBiz;
	@Autowired
	private UserBiz userBiz;
	@RequestMapping("checkmember.action")
	public ModelAndView showmember(String teamName,@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,ModelAndView mv) {
		PageHelper.startPage(pn, 20);
		List<TeamMember> members = teamMemberBiz.queryByTeamNames(teamName);
		List<User> list = new ArrayList<>();
		for (TeamMember teamMember : members) {
			System.out.println(teamMember.getuName());
			User user = userBiz.findByUserNames(teamMember.getuName());
			list.add(user);
		}
		PageInfo pageInfo = new PageInfo<>(list,5);
		mv.addObject("pageInfo",pageInfo);
		mv.addObject("teamName",teamName);
		mv.setViewName("gteammember");
		return mv;	
	}
	@RequestMapping("deletecheck.action")
	public ModelAndView deletecheckingMember(String username,HttpSession session,HttpServletRequest request,ModelAndView mv) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		User user = (User)session.getAttribute("user");
		teamMemberBiz.deleteTeamCheckingMember(username);
		System.out.println(user.getuTeamName());
		mv.addObject("teamName", user.getuTeamName());
		mv.setViewName("redirect:checkmember.action");
		return mv;
	}
	@RequestMapping("passcheck.action")
	public ModelAndView passcheckingMember(String username,HttpSession session,HttpServletRequest request,ModelAndView mv) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		User user = userBiz.findByUserNames(username);
		User u=(User)session.getAttribute("user");
		TeamMember member = teamMemberBiz.findByUname(username);
		member.setChecked("已审核");
		teamMemberBiz.modifyTeamMember(member);
		user.setuTeamName(u.getuTeamName());
		userBiz.modifyByUsername(user);
		mv.addObject("teamName", u.getuTeamName());
		mv.setViewName("redirect:checkmember.action");
		return mv;
	}
	@RequestMapping("showAllMember.action")
	public ModelAndView showAllMember(String teamName,@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,ModelAndView mv) {
		PageHelper.startPage(pn, 20);
		List<TeamMember> members = teamMemberBiz.queryByCheckedTeamNames(teamName);
		List<User> list = new ArrayList<>();
		for (TeamMember teamMember : members) {
			System.out.println(teamMember.getuName());
			User user = userBiz.findByUserNames(teamMember.getuName());
			list.add(user);
		}
		PageInfo pageInfo = new PageInfo<>(list,5);
		mv.addObject("pageInfo",pageInfo);
		mv.addObject("teamName",teamName);
		mv.setViewName("gteamallmember");
		return mv;
	}
	@RequestMapping("deleteTeamMember.action")
	public ModelAndView deleteByUsername(String username,HttpServletRequest request,ModelAndView mv) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		teamMemberBiz.deleteTeamCheckingMember(username);
		User user = userBiz.findByUserNames(username);
		mv.addObject("teamName", user.getuTeamName());
		user.setuTeamName("");
		userBiz.modifyByUsername(user);
		mv.setViewName("redirect:showAllMember.action");
		return mv;
		
	}
}
