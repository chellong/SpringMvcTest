package com.example.ssm.mapper.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.ssm.mapper.ItemsMapperCustom;
import com.example.ssm.po.ItemsCustom;
import com.example.ssm.po.ItemsQueryVo;


public class ItemsMapperCustomTest {
	
	private ApplicationContext applicationContext;
	
	@Before
	public void testBefore(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
	}
	
	@Test
	public void testFindUserById() {
	
		ItemsMapperCustom itemsMapperCustom = applicationContext.getBean(ItemsMapperCustom.class);
		ItemsQueryVo itemsQueryVo = new ItemsQueryVo(); 
		ItemsCustom itemsCustom = new ItemsCustom();
		itemsCustom.setName("5");
		itemsQueryVo.setItemsCustom(itemsCustom);
		
		try {
			List<ItemsCustom> list = itemsMapperCustom.findItemList(itemsQueryVo);
		
			for(ItemsCustom ic : list){
				System.out.println(ic.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
