package com.my.type_handler_boot.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.type_handler_boot.vo.User;

@Repository
public class UserDao {

	
	@Autowired
	SqlSession s;
	
	
	
	public List<User> findAll() {
		return s.selectList("user.findAll");
	}
	
	
	public User findById(String id) {
		return s.selectOne("user.findById",id);
	}
	
	
	public User findOne(int user_idx) {
		return s.selectOne("user.findOne",user_idx);
	}
	
	public int save(User user) {
		return s.insert("user.save",user);
	}
	
	
	
}
