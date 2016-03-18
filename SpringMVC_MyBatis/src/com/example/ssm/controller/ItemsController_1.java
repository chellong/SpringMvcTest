package com.example.ssm.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.example.ssm.po.Items;

public class ItemsController_1 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		// 调用service查找数据库。这里使用静态数据模拟

		List<Items> itemsList = new ArrayList<>();

		Items items_1 = new Items();
		items_1.setId(1);
		items_1.setName("渣想电脑");
		items_1.setPic("渣想电脑");
		items_1.setCreatetime(new Date());
		items_1.setDetail("渣想电脑");
		items_1.setPrice(1);
		itemsList.add(items_1);
		
		Items items_2 = new Items();
		items_2.setId(2);
		items_2.setName("渣想电脑");
		items_2.setPic("渣想电脑");
		items_2.setCreatetime(new Date());
		items_2.setDetail("渣想电脑");
		items_2.setPrice(2);
		itemsList.add(items_2);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("items/itemsList");

		return modelAndView;
	}

}
