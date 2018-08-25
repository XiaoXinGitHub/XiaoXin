package edu.hunau.love.action;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.hunau.love.pojo.Team;
import edu.hunau.love.pojo.User;
import edu.hunau.love.service.TeamBiz;
import edu.hunau.love.service.UserBiz;
import edu.hunau.love.utils.FileUpUtils;

@Controller
public class ImageAction {
	@Autowired
	private UserBiz userBiz;
	@Autowired
	private TeamBiz teamBiz;
	@RequestMapping("upimage.action")
	public ModelAndView modifyImage(HttpServletRequest request,HttpServletResponse response,ModelAndView mv,HttpSession session) {
			/*
			 * 上传路径
			 */
			String file="D:\\java\\service\\apache-tomcat-8.0.45\\webapps\\images\\user\\";//D:\\java\\service\\apache-tomcat-8.0.45\\webapps\\images
			String string = FileUpUtils.upFile(request, response,file);
			System.out.println(request.getParameter("uUsername"));
			User u=new User();
			u.setuUsername(request.getParameter("uUsername"));
			u.setuImage("..//images/user/"+string);
			userBiz.modifyByUsername(u);
			User user = userBiz.findByUserNames(request.getParameter("uUsername"));
			session.setAttribute("user", user);
			mv.addObject("uUsername",request.getParameter("uUsername"));
			mv.setViewName("redirect:member.action");
			return mv;
	}
	
	@RequestMapping("upteamimage.action")
	public ModelAndView modifyTeamImage(HttpServletRequest request,HttpServletResponse response,ModelAndView mv,HttpSession session) {
			/*
			 * 上传路径
			 */
			String file="D:\\java\\service\\apache-tomcat-8.0.45\\webapps\\images\\team\\";
			String string = FileUpUtils.upFile(request, response,file);
			System.out.println(request.getParameter("teamName"));
			Team team=new Team();
			team.setTeamName(request.getParameter("teamName"));
			team.setTeamImage("..//images/team/"+string);
			teamBiz.update(team);
			mv.addObject("teamName",request.getParameter("teamName"));
			mv.setViewName("redirect:leader.action");
			return mv;
	}
}
