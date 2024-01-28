package com.my.type_handler_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.type_handler_boot.dao.UserDao;
import com.my.type_handler_boot.vo.User;

@Service
public class UserService {

	
	@Autowired
	UserDao userDao;
	
	public int save(User user) {
		return userDao.save(user);
	}
	
}
