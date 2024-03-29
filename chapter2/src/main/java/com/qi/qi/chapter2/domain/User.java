package com.qi.qi.chapter2.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "用户实体")
public class User {

	@ApiModelProperty(value = "用户编号")
	private Long id;
	@ApiModelProperty(value = "用户姓名")
	private String name;
	@ApiModelProperty(value = "用户实体")
	private Integer age;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
