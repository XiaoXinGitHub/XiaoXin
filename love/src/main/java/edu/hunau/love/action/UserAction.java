package edu.hunau.love.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import edu.hunau.love.pojo.User;
import edu.hunau.love.service.UserBiz;
import edu.hunau.love.utils.MD5Utils;
import edu.hunau.love.utils.UUIDUtils;

@Controller
public class UserAction {
	@Autowired
	private UserBiz userBiz;
	ModelAndView mv = null;
	@RequestMapping("login.action")
	public ModelAndView login(User u, HttpServletResponse response, HttpSession session) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println("login");
		mv = new ModelAndView();
		PrintWriter out = null;
		try {
			out = response.getWriter();
			System.out.println(u.getuUsername());
			User user = userBiz.findByUsernamePwd(new String(u.getuUsername().getBytes("ISO-8859-1"),"UTF-8"), MD5Utils.md5(u.getuPwd()));
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String time = format.format(user.getuDotime());
			session.setMaxInactiveInterval(300);
			session.setAttribute("formattime", time);
			session.setAttribute("user", user);
			if("管理员".equals(user.getuPeopletypes())) {
				return new ModelAndView("redirect:adminUser.action");
			}else {
				return new ModelAndView("redirect:/index.jsp");
			}
		} catch (Exception e) {
			mv.addObject("err", e.getMessage());
			return mv;
		}
	}
	@RequestMapping("checkname.action")
	public void checkName(User u, HttpServletResponse response, HttpSession session) {
		System.out.println("checkname");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
			User user = userBiz.findByUsername(u.getuUsername());
			out.print(true);
		} catch (Exception e) {
			out.print(false);
		}
	}

	@RequestMapping("checkemail.action")
	public void checkEmail(User u, HttpServletResponse response, HttpSession session) {
		System.out.println("checkemail");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
			User user = userBiz.findByEmail(u.getuEmail());
			out.print(true);
		} catch (Exception e) {
			out.print(false);
		}
	}

	@RequestMapping("checksid.action")
	public void checkSId(User u, HttpServletResponse response, HttpSession session) {
		System.out.println("checksid");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
			User user = userBiz.findBySId(u.getuSId());
			out.print(true);
		} catch (Exception e) {
			out.print(false);
		}
	}

	@RequestMapping("regist.action")
	public void regist(String datas,HttpServletResponse response) {
		ObjectMapper mapper = new ObjectMapper();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = null;
		try {
			out= response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		User user = null;
		try {
			user = mapper.readValue(datas, User.class);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		user.setId(UUIDUtils.uuid());
		user.setuPwd(MD5Utils.md5(user.getuPwd()));
		userBiz.insertUser(user);
		out.print(true);
	}
	@RequestMapping("modifyUser.action")
	public ModelAndView modifyUser(User u,ModelAndView mv,HttpSession session) {
		User user_1=new User();
		try {
			user_1.setuUsername(new String(u.getuUsername().getBytes("ISO-8859-1"),"UTF-8"));
			user_1.setuTruename(new String(u.getuTruename().getBytes("ISO-8859-1"),"UTF-8"));
			user_1.setuEmail(new String(u.getuEmail().getBytes("ISO-8859-1"),"UTF-8"));
			user_1.setuSex(new String(u.getuSex().getBytes("ISO-8859-1"),"UTF-8"));
			user_1.setuSId(new String(u.getuSId().getBytes("ISO-8859-1"),"UTF-8"));
			userBiz.modifyByUsername(user_1);
			User user = userBiz.findByUserNames(new String(u.getuUsername().getBytes("ISO-8859-1"),"UTF-8"));
			session.setAttribute("user", user);
			mv.addObject("uUsername", user_1.getuUsername());
			mv.setViewName("redirect:member.action");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;	
	}
	@RequestMapping("adminUser.action")
	public ModelAndView showAllNotAdmin(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,ModelAndView mv) {
		PageHelper.startPage(pn, 20);
		List<User> list = userBiz.showAllNotAdmin();
		List<String> times=new ArrayList<>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		for (User user : list) {
			times.add(format.format(user.getuDotime()));
		}
		PageInfo pageInfo = new PageInfo<>(list,5);
		mv.addObject("pageInfo",pageInfo);	
		mv.addObject("times", times);
		mv.setViewName("adminFirst");
		return mv;		
	}
	@RequestMapping("deleteUser.action")
	public ModelAndView deleteUser(String uUsername,ModelAndView mv) {
		userBiz.removuUser(uUsername);
		mv.setViewName("redirect:adminUser.action");
		return mv;
	}
}
