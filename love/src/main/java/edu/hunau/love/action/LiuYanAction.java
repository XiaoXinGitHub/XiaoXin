package edu.hunau.love.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.hunau.love.pojo.Discusss;
import edu.hunau.love.pojo.User;
import edu.hunau.love.service.DiscusssBiz;
import edu.hunau.love.utils.UUIDUtils;

@Controller
public class LiuYanAction {
	@Autowired
	private DiscusssBiz discussBiz;
	
	@RequestMapping("liuyan.action")
	public ModelAndView liuYan(String postid,String discussContent,ModelAndView mv,HttpSession session) {
		try {
			Discusss discuss=new Discusss();
			discuss.setId(UUIDUtils.uuid());
			discuss.setDiscussPid(postid);
			discuss.setDiscussContent(new String(discussContent.getBytes("ISO-8859-1"),"utf-8"));
			User u = (User)session.getAttribute("user");
			discuss.setDiscusssUsername(u.getuUsername());
			discussBiz.insertDiscuss(discuss);
			mv.addObject("id", postid);
			mv.setViewName("redirect:postInfo.action");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return mv;
		
	}
}
