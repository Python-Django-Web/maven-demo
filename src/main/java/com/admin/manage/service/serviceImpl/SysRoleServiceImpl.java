package com.admin.manage.service.serviceImpl;

import com.admin.manage.dao.SysRoleDao;
import com.admin.manage.dao.SysRoleMenuDao;
import com.admin.manage.entity.SysRoleBean;
import com.admin.manage.service.SysRoleService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	private SysRoleDao sysRoleDao;

	@Autowired
	private SysRoleMenuDao sysRoleMenuDao;

	public boolean save(SysRoleBean sysRoleBean) {
		SysRoleBean sysRole = sysRoleDao.queryObject(sysRoleBean);
		if (sysRole != null) {
			return false;
		}
		int i = sysRoleDao.save(sysRoleBean);
		if(i > 0) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("role_id", sysRoleBean.getRole_id());
			map.put("menuIds", sysRoleBean.getMenuIds());
			sysRoleMenuDao.save(map);
		}else {
			return false;
		}
		return true;
	}
}
