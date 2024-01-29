package com.my.type_handler_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.type_handler_boot.dao.ItemDao;
import com.my.type_handler_boot.vo.Item;

@Service
public class ItemService {

	@Autowired
	ItemDao itemDao;
	
	
	
	public Item findOne(int item_idx) {
		return itemDao.findOne(item_idx);
	}
	
}


