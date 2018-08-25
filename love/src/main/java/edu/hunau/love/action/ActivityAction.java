package edu.hunau.love.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import edu.hunau.love.service.ActivityBiz;
import edu.hunau.love.service.TeamBiz;
import edu.hunau.love.utils.UUIDUtils;

@Controller
public class ActivityAction {
	@Autowired
	private ActivityBiz activityBiz;
	@Autowired
	private TeamBiz teamBiz;
	@RequestMapping("showAllActivity.action")
	public ModelAndView Fenye(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,ModelAndView mv) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		PageHelper.startPage(pn, 5);
		List<Activity> list = activityBiz.findAllActivity();
		List<Team> teams=new ArrayList<>();
		List<String> times=new ArrayList<>();
		for (Activity activity : list) {
			String teamname = activity.getaTeamname();
			Team team = teamBiz.findByTeamName(teamname);
			teams.add(team);
			String format2 = format.format(activity.getaDotime());
			times.add(format2);
		}
		PageInfo pageInfo = new PageInfo<>(list,5);
		mv.addObject("pageInfo",pageInfo);
		mv.addObject("teams", teams);
		mv.addObject("times", times);
		mv.setViewName("activitylist");
		return mv;
	}
	
	@RequestMapping("showActivity.action")
	public ModelAndView showActivity(String activityid) {
		System.out.println(activityid);
		Activity activity = activityBiz.findById(activityid);
		Team team = teamBiz.findByTeamName(activity.getaTeamname());
		Date date = activity.getaDotime();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String activitytime = format.format(date);
		ModelAndView mv=new ModelAndView();
		mv.addObject("activitytime",activitytime);
		mv.addObject("activity", activity);
		mv.addObject("email", team.getTeamEmail());
		mv.setViewName("activity");
		return mv;
	}
	@RequestMapping("showfourActivity.action")
	public void showFourActivity( HttpServletResponse response) {
		System.out.println("jinlai ");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<Activity> list = activityBiz.findAllActivity();
		List<Activity> activitys = new ArrayList<>();
		int count=0;
		for (Activity activity : list) {
			activitys.add(activity);
			count++;
			if(count==4) {
				break;
			}
		}	
		out.print(activitys);
	}
	@RequestMapping("post.action")
	public ModelAndView faActivity(ModelAndView mv,HttpServletRequest request,HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Activity activity=new Activity();
			activity.setaActivity(new String(request.getParameter("aActivity").getBytes("ISO-8859-1"),"UTF-8"));
			activity.setaAddress(new String(request.getParameter("aAddress").getBytes("ISO-8859-1"),"UTF-8"));
			activity.setaAtypes(new String(request.getParameter("aAtypes").getBytes("ISO-8859-1"),"UTF-8"));
			activity.setaContent(new String(request.getParameter("aContent").getBytes("ISO-8859-1"),"UTF-8"));
			activity.setaDotime(format.parse(new String(request.getParameter("aDotime").getBytes("ISO-8859-1"),"UTF-8")));
			activity.setaManager(new String(request.getParameter("aManager").getBytes("ISO-8859-1"),"UTF-8"));
			activity.setaTeamname(new String(request.getParameter("aTeamname").getBytes("ISO-8859-1"),"UTF-8"));
			activity.setId(UUIDUtils.uuid());
			activityBiz.insertActivity(activity);
			mv.addObject("teamName", new String(request.getParameter("aTeamname").getBytes("ISO-8859-1"),"UTF-8"));
			mv.setViewName("redirect:showAllActivityOnTime.action");
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return mv;	
	}
	@RequestMapping("showAllActivityOnTime.action")
	public ModelAndView showAllActivityOnTime(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,ModelAndView mv,String teamName) {
		PageHelper.startPage(pn, 5);
		System.out.println(teamName);
		List<Activity> activityRunning = activityBiz.findMyTeamActivityRunning(teamName);
		List<Team> teams=new ArrayList<>();
		for (Activity activity : activityRunning) {
			String teamname = activity.getaTeamname();
			Team team = teamBiz.findByTeamName(teamname);
			teams.add(team);
		}
		PageInfo pageInfo = new PageInfo<>(activityRunning,5);
		mv.addObject("pageInfo",pageInfo);
		mv.addObject("teamName", teamName);
		mv.addObject("teams", teams);
		mv.setViewName("gactivitylist");
		return mv;	
	}
	@RequestMapping("showAllActivityFinished.action")
	public ModelAndView showAllActivityFinished(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,ModelAndView mv,String teamName) {
		PageHelper.startPage(pn, 5);
		List<Activity> activityFinished = activityBiz.findMyTeamActivityFinished(teamName);
		List<Team> teams=new ArrayList<>();
		for (Activity activity : activityFinished) {
			String teamname = activity.getaTeamname();
			Team team = teamBiz.findByTeamName(teamname);
			teams.add(team);
		}
		PageInfo pageInfo = new PageInfo<>(activityFinished,5);
		mv.addObject("pageInfo",pageInfo);
		mv.addObject("teamName", teamName);
		mv.addObject("teams", teams);
		mv.setViewName("gactivitylistfinished");
		return mv;	
	}
	@RequestMapping("showThisTeamActivity.action")
	public ModelAndView showThisTeamActivity(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,ModelAndView mv,String teamName) {
		PageHelper.startPage(pn, 5);
		System.out.println(teamName);
		List<Activity> activityRunning = activityBiz.findAllActivityThisTeam(teamName);
		List<Team> teams=new ArrayList<>();
		for (Activity activity : activityRunning) {
			String teamname = activity.getaTeamname();
			Team team = teamBiz.findByTeamName(teamname);
			teams.add(team);
		}
		PageInfo pageInfo = new PageInfo<>(activityRunning,5);
		mv.addObject("pageInfo",pageInfo);
		mv.addObject("teamName", teamName);
		mv.addObject("teams", teams);
		mv.setViewName("activitylist");
		return mv;
	}
	@RequestMapping("showActivityNotChecked.action")
	public ModelAndView showActivityNotChecked(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,ModelAndView mv) {
		PageHelper.startPage(pn, 10);
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		List<Activity> list = activityBiz.findAllActivitysNotChecked();
		List<Team> teams=new ArrayList<>();
		List<String> times=new ArrayList<>();
		for (Activity activity : list) {
			String teamname = activity.getaTeamname();
			Team team = teamBiz.findByTeamName(teamname);
			teams.add(team);
			times.add(format.format(activity.getaDotime()));
		}
		PageInfo pageInfo = new PageInfo<>(list,5);
		mv.addObject("pageInfo",pageInfo);
		mv.addObject("times", times);
		mv.addObject("teams", teams);
		mv.setViewName("adminActivityCheck");
		return mv;
	}
	@RequestMapping("activitycheck.action")
	public ModelAndView activityCheck(ModelAndView mv,String activityid) {
		Activity activity = activityBiz.findById(activityid);
		activity.setaChecked("已审核");
		activityBiz.checkActivity(activity);
		mv.setViewName("redirect:showActivityNotChecked.action");
		return mv;
		
	}
}
