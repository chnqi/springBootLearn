package com.qiqi.dbname1.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.qiqi.domain.User;

public interface UserMapper1 {

	@Select("SELECT * FROM USER WHERE NAME = #{name}")
	User getUserByName(@Param("name") String name);
	
	@Insert("INSERT INTO USER(ID, NAME, AGE) VALUES(#{id}, #{name}, #{age})")
	int insertUser(@Param("id") int id, @Param("name") String name, @Param("age") int age);
}
