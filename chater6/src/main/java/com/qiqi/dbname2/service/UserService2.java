package com.qiqi.dbname2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiqi.dbname2.mapper.UserMapper2;
import com.qiqi.domain.User;

@Service
public class UserService2 {

	@Autowired
	UserMapper2 userMapper;
	
	public User getUserByName(String name) {
		
		return userMapper.getUserByName(name);
	}
	
	public int insertUser(int id, String name, int age) {
		
		return userMapper.insertUser(id, name, age);
	}
}
