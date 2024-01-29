package com.my.type_handler_boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.type_handler_boot.dao.UserDao;
import com.my.type_handler_boot.vo.User;

@Service
public class UserService {

	
	@Autowired
	UserDao userDao;
	
	
	public User findById(String id) {
		return userDao.findById(id);
	}
	
	public List<User> findAll() {
		return userDao.findAll();
	}
	
	
	public User findOne(int user_idx) {
		return userDao.findOne(user_idx);
	}
	
	public int save(User user) {
		return userDao.save(user);
	}
	
}
