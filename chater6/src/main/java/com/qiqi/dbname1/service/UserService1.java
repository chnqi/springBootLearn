package com.qiqi.dbname1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiqi.dbname1.mapper.UserMapper1;
import com.qiqi.domain.User;

@Service
public class UserService1 {

	@Autowired
	UserMapper1 userMapper;
	
	public User getUserByName(String name) {
		
		return userMapper.getUserByName(name);
	}
	
	public int insertUser(int id, String name, int age) {
		
		return userMapper.insertUser(id, name, age);
	}
}
