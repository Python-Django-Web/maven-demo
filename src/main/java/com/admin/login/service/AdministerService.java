package com.admin.login.service;

import java.util.List;

import com.admin.login.entity.Administer;

/**
 * @since AdministerService interface
 * @author HuWang
 *
 */
public interface AdministerService {
	
	List<Administer> selectList();
	
	Administer selectId(Integer id);
}
