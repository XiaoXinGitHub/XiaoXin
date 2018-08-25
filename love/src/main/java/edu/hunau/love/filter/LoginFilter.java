package edu.hunau.love.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.hunau.love.pojo.User;


public class LoginFilter implements Filter {

	@Override
	public void destroy() {

	}

	/***
	 * 实现过滤器的核心逻辑
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		HttpSession session = request.getSession();
		// if
		// (!request.getRequestURI().contains("login.jsp")&&!request.getRequestURI().contains("login.user")&&!request.getRequestURI().contains("*.css")&&!request.getRequestURI().contains("*.js"))
		// {
		if (request.getRequestURI().contains(".action")&&(!request.getRequestURI().contains("login.jsp")&&!request.getRequestURI().contains("index.action")&&!request.getRequestURI().contains("login.action")&&!request.getRequestURI().contains("checkname.action")&&!request.getRequestURI().contains("checkemail.action")&&!request.getRequestURI().contains("checksid.action"))) {
			User u = (User) session.getAttribute("user");
			if (u != null) {
				chain.doFilter(req, resp);
			} else {
				// 如果未登录,跳转到登录页面先登录
				session.setAttribute("err_info", "请先登录");
				response.sendRedirect("http://localhost:8080/love/login.jsp");
			}
		} else {
			chain.doFilter(req, resp);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("-----过滤器初始化------");
	}

}