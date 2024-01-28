package com.my.type_handler_boot.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.type_handler_boot.vo.User;

@Repository
public class UserDao {

	
	@Autowired
	SqlSession s;
	
	
	public int save(User user) {
		return s.insert("user.save",user);
	}
	
	
	
}
