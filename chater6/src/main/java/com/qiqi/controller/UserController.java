package com.qiqi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.qiqi.dbname1.service.UserService1;
import com.qiqi.dbname2.service.UserService2;
import com.qiqi.domain.User;

@RestController
public class UserController {

	@Autowired
	UserService1 userService1;
	
	@GetMapping(value = "/user1/{name}")
	public User getUserByName(@PathVariable(value = "name") String name) {
		
		User user = userService1.getUserByName(name);
		return user;
	}
	
	@PostMapping(value = "/insertuser1")
	public int insertUser(@RequestBody User user) {
		
		return userService1.insertUser(user.getId(), user.getName(), user.getAge());
	}
	
	@Autowired
	UserService2 userService2;
	
	@GetMapping(value = "/user2/{name}")
	public User getUserByName2(@PathVariable(value = "name") String name) {
		
		User user = userService2.getUserByName(name);
		return user;
	}
	
	@PostMapping(value = "/insertuser2")
	public int insertUser2(@RequestBody User user) {
		
		return userService2.insertUser(user.getId(), user.getName(), user.getAge());
	}
}
