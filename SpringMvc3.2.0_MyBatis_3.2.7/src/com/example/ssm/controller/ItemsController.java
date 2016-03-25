package com.example.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.ssm.controller.validation.ValidationGroup_1;
import com.example.ssm.po.ItemsCustom;
import com.example.ssm.po.ItemsQueryVo;
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
	public ModelAndView queryItems(ItemsQueryVo itemsQueryVo) throws Exception {

		List<ItemsCustom> itemsList = itemsService.findItemList(itemsQueryVo);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("items/itemsList");

		return modelAndView;
	}

	/**
	 * 商品修改
	 * 参数绑定
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
	
	/**
	 * 修改提交
	 * @param model
	 * @param id
	 * @param itemsCustom
	 * @param bindingResult
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping(value="/editItemsSumbit",method={RequestMethod.POST})
	public String editItemsSumbit(Model model,Integer id,@Validated(value={ValidationGroup_1.class}) ItemsCustom itemsCustom,BindingResult bindingResult) throws Exception {
		
		if(bindingResult.hasErrors()){
			/*
			 * 输出错误信息
			 */
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			
			/*
			 * 返回到页面 
			 */
			model.addAttribute("allErrors", allErrors);
			
			return "items/editItems";
		}
		
		itemsService.updataItems(id, itemsCustom);
		
		/*
		 * 重定向
		 */
		//return "redirect:queryItems.action";
		
		/*
		 * 页面转发，
		 */
		//return "foward:queryItems.action";
		
		return "success";
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
	
	@RequestMapping("deleteItems")
	public String deleteItems(Integer[] itemsId) throws Exception {
			
		//调用service
		
		/*
		 * 测试 显示数据
		 */
		for(Integer i : itemsId){
			System.out.println(i);
		}
	
		return "redirect:queryItems.action";
	}
	
	@RequestMapping("/editItemsQuery")
	public ModelAndView editItemsQuery(ItemsQueryVo itemsQueryVo) throws Exception {

		List<ItemsCustom> itemsList = itemsService.findItemList(itemsQueryVo);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("items/itemsListQuery");

		return modelAndView;
		
	}
	
	@RequestMapping("/editItemsAllSubmit")
	public String editItemsAllSubmit(ItemsQueryVo itemsQueryVo) throws Exception {

		for(ItemsCustom itemsCustom : itemsQueryVo.getItemsList() ){
			itemsService.updataItems(itemsCustom.getId(),itemsCustom);
		}

		return "success";
		
	}

	
}
