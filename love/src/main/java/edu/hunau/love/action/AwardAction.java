package edu.hunau.love.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.hunau.love.pojo.Award;
import edu.hunau.love.service.AwardBiz;

@Controller
public class AwardAction {
	@Autowired
	private AwardBiz awardBiz;
	@RequestMapping("member.action")
	public ModelAndView showAward(String uUsername,ModelAndView mv) {
		List<Award> list = awardBiz.findByHost(uUsername);
		List<String> time = new ArrayList<>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		for (Award award : list) {
			Date time2 = award.getAwTime();
			time.add(format.format(time2));
		}
		mv.addObject("awards", list);
		mv.addObject("awardtime", time);
		mv.setViewName("member");
		return mv;
		
	}
}
