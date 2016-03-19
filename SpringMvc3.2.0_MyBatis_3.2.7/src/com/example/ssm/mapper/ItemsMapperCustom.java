package com.example.ssm.mapper;

import java.util.List;

import com.example.ssm.po.ItemsCustom;
import com.example.ssm.po.ItemsQueryVo;

public interface ItemsMapperCustom {

	public List<ItemsCustom> findItemList(ItemsQueryVo itemsQueryVo) throws Exception; 
}
