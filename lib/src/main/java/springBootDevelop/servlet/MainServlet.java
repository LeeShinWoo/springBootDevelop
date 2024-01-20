package springBootDevelop.servlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Spring 의 dispatcherServlet 역할을 하는 Servlet
 * @author A
 *
 */
public class MainServlet implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init");
		/*
		 * 초기 Bean 로딩 (Lazy 로딩)
		 */
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("getServletConfig");
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service");
		res.setContentType("text/html; charset=utf-8");
		res.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		
		/*
		 * interceptor 전처리
		 */
		/*
		 * 각 Contorller 별 분기처리
		 */
		/*
		 * interceptor 후처리
		 */
		res.getWriter().append("이신우 123123123");
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("getServletInfo");
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}
}
