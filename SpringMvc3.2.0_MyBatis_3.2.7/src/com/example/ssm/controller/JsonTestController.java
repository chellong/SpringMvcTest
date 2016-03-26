package com.example.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ssm.po.ItemsCustom;

@Controller
public class JsonTestController {
	
	/**
	 * 
	 * @param itemsCustom
	 * 
	 * @RequestBody  将请求的数据转换成java对象
	 * @ResponseBody 将结果转换成json串输出
	 * 
	 * @return
	 */
	@RequestMapping("/requsetJson")
	public @ResponseBody ItemsCustom requsetJson(@RequestBody ItemsCustom itemsCustom){
		
		return itemsCustom;
	}
	
	
	/**
	 * 
	 * @param itemsCustom
	 * @return
	 */
	@RequestMapping("/responseJson")
	public @ResponseBody ItemsCustom responseJson(ItemsCustom itemsCustom){
		
		return itemsCustom;
	}

}
