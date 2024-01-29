package com.my.type_handler_boot.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.type_handler_boot.vo.Item;

@Repository
public class ItemDao {

	
	@Autowired
	SqlSession s;
	
	
	public Item findOne(int item_idx) {
		return s.selectOne("item.findOne",item_idx);
	}
}
