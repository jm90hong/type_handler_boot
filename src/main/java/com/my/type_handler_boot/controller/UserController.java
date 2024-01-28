package com.my.type_handler_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.type_handler_boot.service.UserService;
import com.my.type_handler_boot.vo.User;




@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("health")
	public String health() {
		
		return "ok";
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
