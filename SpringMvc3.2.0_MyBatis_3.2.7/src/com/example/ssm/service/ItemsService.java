package com.example.ssm.service;

import java.util.List;

import com.example.ssm.po.ItemsCustom;
import com.example.ssm.po.ItemsQueryVo;

public interface ItemsService {
	
	public List<ItemsCustom> findItemList(ItemsQueryVo itemsQueryVo) throws Exception;
}
