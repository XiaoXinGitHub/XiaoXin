package edu.hunau.love.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.hunau.love.pojo.Activity;
import edu.hunau.love.pojo.SchoolMate;
import edu.hunau.love.pojo.Team;
import edu.hunau.love.service.ActivityBiz;
import edu.hunau.love.service.SchoolMateBiz;
import edu.hunau.love.service.TeamBiz;

@Controller
public class IndexAction {
	@Autowired
	private ActivityBiz activityBiz;
	@Autowired
	private SchoolMateBiz schoolMateBiz;
	@Autowired
	private TeamBiz teamBiz;
	@RequestMapping("index.action")
	public ModelAndView index(ModelAndView mv) {
		List<Activity> list = activityBiz.findAllActivity();
		List<Team> teams=new ArrayList<>();
		List<String> times=new ArrayList<>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		for (Activity activity : list) {
			Team team = teamBiz.findByTeamName(activity.getaTeamname());
			teams.add(team);
			String time = format.format(activity.getaDotime());
			times.add(time);
		}
		List<SchoolMate> list2 = schoolMateBiz.findAllAlreadyChecked();
		mv.addObject("activitys", list);
		mv.addObject("teams", teams);
		mv.addObject("times", times);
		mv.addObject("schoolmates", list2);
		mv.setViewName("index");
		return mv;
		
	}
}
