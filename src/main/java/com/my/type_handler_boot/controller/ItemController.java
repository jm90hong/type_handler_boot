package com.my.type_handler_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.type_handler_boot.service.ItemService;
import com.my.type_handler_boot.vo.Item;


@RestController
@RequestMapping(value="item")
public class ItemController {
	
	
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("findOne")
	public Item findOne(
				@RequestParam(value="item_idx") int item_idx
			) {
		
		return itemService.findOne(item_idx);
	}
	
	
}
