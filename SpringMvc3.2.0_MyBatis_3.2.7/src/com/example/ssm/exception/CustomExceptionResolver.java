package com.example.ssm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author 北飞的候鸟
 *
 */
public class CustomExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handle,
			Exception ex) {
		
		/*
		 * handle是要执行的对象
		 */
		
		/**
		 * 解析出要执行的异常类型
		 */
		
		CustomException customException = null;
		if(ex instanceof CustomException){
			customException = (CustomException)ex;
		}else{
			/*
			 * 如果未知错误
			 */
			customException = new CustomException("未知错误");
		}
		String message = "";
		message = customException.getMessage();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", message);
		modelAndView.setViewName("error");
		
		return modelAndView;
	}

}
