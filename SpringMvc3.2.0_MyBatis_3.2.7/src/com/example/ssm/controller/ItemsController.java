package com.example.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.example.ssm.po.ItemsCustom;
import com.example.ssm.service.ItemsService;

public class ItemsController implements Controller {

	private ItemsService itemsService;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		List<ItemsCustom>  itemsList = itemsService.findItemList(null);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("items/itemsList");

		return modelAndView;
	}

}
