package com.qi.qi.chapter2.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qi.qi.chapter2.domain.User;

@Api(tags = "用户管理")
@RestController
@RequestMapping(value = "/users")
public class UserController {

	static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());
	
	@PostMapping("/")
	@ApiOperation(value = "新增用户", notes = "根据user对象创建用户")
	public String postUser(@RequestBody User user){
		users.put(user.getId(), user);
		
		return "sucess";
	}
	
	@GetMapping(value="/")
	@ApiOperation(value = "获取用户列表")
	public List<User> getUserList(){
		List<User> result = new ArrayList<User>(users.values());
		return result;
	}
	
	@GetMapping(value="/{id}")
	@ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
	public User getUser(@PathVariable Long id){
		return users.get(id);
	}
	
	@PutMapping(value="/{id}")
	@ApiOperation(value = "更新用户详细信息", notes = "根据url id来指定更细你对象，并根据传过来的user信息来更新用户详细信息")
	@ApiImplicitParam(paramType = "path", name = "id", value = "用户id", dataType = "Long", required = true, example = "1")
	public String putUser(@PathVariable Long id, @RequestBody User user){
		User u = users.get(id);
		u.setAge(user.getAge());
		u.setName(user.getName());
		
		return "success";
	}
	
	@DeleteMapping(value="/{id}")
	@ApiOperation(value = "删除用户", notes = "根据url的id指定删除对象")
	public String deleteUser(@PathVariable Long id){
		users.remove(id);
		
		return "success";
	}
	
}
