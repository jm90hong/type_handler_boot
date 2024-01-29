package com.my.type_handler_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.type_handler_boot.service.UserService;
import com.my.type_handler_boot.vo.User;




@RestController
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("health")
	public String health() {
		
		return "ok";
	}
	
	@GetMapping("findOne")
	public User findOne(
				@RequestParam(value="user_idx") int user_idx
			) {
		
		return userService.findOne(user_idx);
	}
	
	
	@GetMapping("findById")
	public User findById(
				@RequestParam(value="id") String id
			) {
		
		return userService.findById(id);
	}
	
	@GetMapping("findAll")
	public List<User> findAll() {
		
		return userService.findAll();
	}
	
	
	@GetMapping("save")
	public String save(
				@RequestParam(value="id") String id,
				@RequestParam(value="pw") String pw
			) {
	
		
		User user = new User();
		user.setId(id);
		user.setPw(pw);
		
		userService.save(user);
		
		
		return "ok";
	}
	
}
