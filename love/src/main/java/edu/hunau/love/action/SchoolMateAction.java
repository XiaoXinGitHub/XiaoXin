package edu.hunau.love.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import edu.hunau.love.pojo.SchoolMate;
import edu.hunau.love.pojo.User;
import edu.hunau.love.service.SchoolMateBiz;
import edu.hunau.love.utils.FileUpUtils;
import edu.hunau.love.utils.UUIDUtils;

@Controller
public class SchoolMateAction {
	@Autowired
	private SchoolMateBiz schoolMateBiz;
	@RequestMapping("gallery.action")
	public ModelAndView gallery(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,ModelAndView mv) {
		PageHelper.startPage(pn, 12);
		List<SchoolMate> list = schoolMateBiz.findAllAlreadyChecked();
		PageInfo pageInfo = new PageInfo<>(list,5);
		mv.addObject("pageInfo", pageInfo);
		mv.setViewName("gallery");
		return mv;	
	}
	@RequestMapping("upschoolmate.action")
	public ModelAndView upSchoolMate(HttpServletRequest request,HttpServletResponse response,ModelAndView mv,HttpSession session,String schoolmateInfo) {
		String file="D:\\java\\service\\apache-tomcat-8.0.45\\webapps\\images\\gallery\\";
		 SchoolMate schoolMate = FileUpUtils.upFile2(request, response,file);
		 schoolMate.setId(UUIDUtils.uuid());
		User u = (User)session.getAttribute("user");
		schoolMate.setSchoolmateUsername(u.getuUsername());
		schoolMateBiz.insertImg(schoolMate);
		mv.setViewName("upschoolmatesuccess");
		return mv;
		
	}
	
}
