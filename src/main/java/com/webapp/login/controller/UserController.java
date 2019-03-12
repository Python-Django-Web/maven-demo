package com.webapp.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.login.entity.User;
import com.webapp.login.service.UserService;

@RestController
@RequestMapping("/admin/User/")
public class UserController {

	@Autowired
	private UserService UserService;
	
	@RequestMapping("selectList")
	public List<User> selectList(){
		return UserService.selectList();
	}
}
