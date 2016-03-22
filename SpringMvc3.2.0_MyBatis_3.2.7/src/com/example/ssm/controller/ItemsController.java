package com.example.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.ssm.po.ItemsCustom;
import com.example.ssm.service.ItemsService;

@Controller
/**
 * 对url进行分类管理，
 * 	 最终的为根路径加子路径
 * 
 * @RequestMapping :特性
 * * 窄化请求路径
 * @author 北飞的候鸟
 */
@RequestMapping("/items")
public class ItemsController {

	@Autowired
	private ItemsService itemsService;

	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception {

		List<ItemsCustom> itemsList = itemsService.findItemList(null);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("items/itemsList");

		return modelAndView;
	}

	/**
	 * 商品修改
	 * 		参数绑定
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/editItems",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView editItems(@RequestParam(value = "id",required = true/*,defaultValue=""*/) Integer items_id) throws Exception {

		ItemsCustom itemsCustom = itemsService.findItemById(items_id);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsCustom", itemsCustom);
		modelAndView.setViewName("items/editItems");

		return modelAndView;
	}
	
	@RequestMapping("/editItemsSumbit")
	public String editItemsSumbit(Integer id,ItemsCustom itemsCustom) throws Exception {
		
		itemsService.updataItems(id, itemsCustom);
		
		/*
		 * 重定向
		 */
		
		return "redirect:queryItems.action";
		
		/*
		 * 页面转发，
		 */
		
		//return "foward:queryItems.action";
	}

	/**
	 * 无返回值
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void testVoid(HttpServletRequest request,HttpServletResponse response) throws Exception {
	
		/**
		 * 响应json
		 */
	
	}
	
}
