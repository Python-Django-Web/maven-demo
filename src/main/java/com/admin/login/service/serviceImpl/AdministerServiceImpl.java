package com.admin.login.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.login.dao.AdministerDao;
import com.admin.login.entity.Administer;
import com.admin.login.service.AdministerService;

/**
 * @since AdministerServiceImpl implements class
 * @author HuWang
 *
 */
@Service
public class AdministerServiceImpl implements AdministerService{

	@Autowired
	private  AdministerDao AdministerDao;
	
	public List<Administer> selectList() {
		// TODO Auto-generated method stub
		return AdministerDao.selectList();
	}

	public Administer selectId(Integer id) {
		// TODO Auto-generated method stub
		return AdministerDao.selectId(id);
	}

}
