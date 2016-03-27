package com.example.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	/**
	 * 登录
	 */
	@RequestMapping("/login")
	public String login(HttpSession session,String username,String userpassword) throws Exception {

		/*
		 * service
		 */
		
		/*
		 * 将用户信息设置到
		 */
		session.setAttribute("username", username);
		session.setMaxInactiveInterval(1800);
		
		return "redirect:items/queryItems.action";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {

		/**
		 * 清除session
		 */
		
		session.invalidate();
		
		return "redirect:items/queryItems.action";
	}
}