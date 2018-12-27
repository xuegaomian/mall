package com.mall.service;
import com.mall.common.EasyUIDataGridResult;
import com.mall.pojo.TbItem;

public interface ItemService {

	public EasyUIDataGridResult getItemList(Integer page, Integer rows);
}
