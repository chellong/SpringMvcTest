package com.example.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ssm.mapper.ItemsMapperCustom;
import com.example.ssm.po.ItemsCustom;
import com.example.ssm.po.ItemsQueryVo;
import com.example.ssm.service.ItemsService;

public class ItemsServiceImpl implements ItemsService{

	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Override
	public List<ItemsCustom> findItemList(ItemsQueryVo itemsQueryVo) throws Exception {
		return itemsMapperCustom.findItemList(itemsQueryVo);
	}

}
