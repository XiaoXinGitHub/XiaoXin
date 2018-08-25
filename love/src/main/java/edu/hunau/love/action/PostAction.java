package edu.hunau.love.action;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import edu.hunau.love.pojo.Activity;
import edu.hunau.love.pojo.Discusss;
import edu.hunau.love.pojo.Post;
import edu.hunau.love.pojo.User;
import edu.hunau.love.service.DiscusssBiz;
import edu.hunau.love.service.PostBiz;
import edu.hunau.love.utils.UUIDUtils;

@Controller
public class PostAction {
	@Autowired
	private PostBiz postBiz;
	@Autowired
	private DiscusssBiz discussBiz;
	
	@RequestMapping("showAllPost.action")
	public ModelAndView showPost(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,ModelAndView mv) {
		PageHelper.startPage(pn, 5);
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		List<Post> showAll = postBiz.showAll();
		List<String> times=new ArrayList<>();
		for (Post p : showAll) {
			String format2 = format.format(p.getPostTime());
			times.add(format2);
		}
		PageInfo pageInfo = new PageInfo<>(showAll,5);
		mv.addObject("pageInfo",pageInfo);
		mv.addObject("times", times);
		mv.setViewName("post");	
		return mv;
	}
	@RequestMapping("fatie.action")
	public ModelAndView faPost(ModelAndView mv,String postTitle,String postContent,HttpSession session) {
		try {
			System.out.println(new String(postTitle.getBytes("ISO-8859-1"),"utf-8"));
			System.out.println(new String(postContent.getBytes("ISO-8859-1"),"utf-8"));
			Post post=new Post();
			post.setId(UUIDUtils.uuid());
			post.setPostContent(new String(postContent.getBytes("ISO-8859-1"),"utf-8"));
			post.setPostTitle(new String(postTitle.getBytes("ISO-8859-1"),"utf-8"));
			post.setPostName(((User)session.getAttribute("user")).getuUsername());
			postBiz.insertPost(post);
			mv.setViewName("fatiesuccess");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return mv;
	}
	@RequestMapping("postInfo.action")
	public ModelAndView postInfo(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,ModelAndView mv,String id) {
		PageHelper.startPage(pn, 5);
		Post post = postBiz.findById(id);
		List<Discusss> discuss = discussBiz.showDiscuss(id);
		PageInfo pageInfo = new PageInfo<>(discuss,5);
		List<String> times=new ArrayList<>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		for (Discusss discusss : discuss) {
			times.add(format.format(discusss.getDiscusssTime()));
		}
		String time = format.format(post.getPostTime());
		mv.addObject("post", post);
		mv.addObject("time", time);
		mv.addObject("times", times);
		mv.addObject("pageInfo",pageInfo);
		mv.setViewName("postInfo");
		return mv;
		
	}
}
