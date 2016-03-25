package com.example.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.ssm.mapper.ItemsMapper;
import com.example.ssm.mapper.ItemsMapperCustom;
import com.example.ssm.po.Items;
import com.example.ssm.po.ItemsCustom;
import com.example.ssm.po.ItemsQueryVo;
import com.example.ssm.service.ItemsService;

public class ItemsServiceImpl implements ItemsService{

	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Autowired
	private ItemsMapper itemsMapper;
	
	@Override
	public List<ItemsCustom> findItemList(ItemsQueryVo itemsQueryVo) throws Exception {
		return itemsMapperCustom.findItemList(itemsQueryVo);
	}

	@Override
	public ItemsCustom findItemById(Integer id) throws Exception {

		Items items =  itemsMapper.selectByPrimaryKey(id);
		/*
		 * 中间业务，用包装类
		 */
		ItemsCustom itemsCustom = new ItemsCustom();
		
		/*
		 * 拷贝
		 */
		BeanUtils.copyProperties(items, itemsCustom);
		return itemsCustom;
	}

	@Override
	public void updataItems(Integer id, ItemsCustom itemsCustom) throws Exception {
		
		/*
		 * 业务校验,id是否为空，如果为空抛出异常
		 */
		
		//TODO
		
		/*
		 * 根据id跟新数据，包括大数据类型，必须传入id；
		 */
		itemsCustom.setId(id);
		itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);
		
	}

}
