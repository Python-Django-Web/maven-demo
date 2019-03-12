package com.webapp.login.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.login.dao.UserDao;
import com.webapp.login.entity.User;
import com.webapp.login.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao UserDao;
	
	public List<User> selectList() {
		// TODO Auto-generated method stub
		return UserDao.selectList();
	}

}
