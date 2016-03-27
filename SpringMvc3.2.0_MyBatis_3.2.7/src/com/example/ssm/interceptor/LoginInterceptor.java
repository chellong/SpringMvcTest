package com.example.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器
 * 
 * @author 北飞的候鸟
 *
 */
public class LoginInterceptor implements HandlerInterceptor{

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(
			HttpServletRequest request, 
			HttpServletResponse Response, 
			Object arg2) throws Exception {
	
		String url = request.getRequestURI();
		/*
		 * 实际使用时候将地址配置在配置文件中
		 */
		if(url.indexOf("login.action") >= 0){
			return true;
		}
		/*
		 * 判断session
		 */
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		
		if(username != null){
			return true;
		}
		/*
		 * 前边的没有放行
		 */
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, Response);
		
		return false;
	}
	
	/**
	 * 进入之后
	 * 公用数据
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
	}
	
	/**
	 * 执行完成之后
	 * 日志处理
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		
		
	}
}