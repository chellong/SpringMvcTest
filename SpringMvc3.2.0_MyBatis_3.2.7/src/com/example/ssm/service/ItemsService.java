package com.example.ssm.service;

import java.util.List;

import com.example.ssm.po.ItemsCustom;
import com.example.ssm.po.ItemsQueryVo;

public interface ItemsService {
	
	public List<ItemsCustom> findItemList(ItemsQueryVo itemsQueryVo) throws Exception;
	
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ItemsCustom findItemById(Integer id) throws Exception;
	
	/**
	 * 修改商品的信息
	 * @param id
	 * @param itemsCustom
	 * @throws Exception
	 */
	public void updataItems(Integer id,ItemsCustom itemsCustom) throws Exception;
}
