package com.admin.manage.service.serviceImpl;

import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.admin.manage.dao.SysUserDao;
import com.admin.manage.entity.SysUserBean;
import com.admin.manage.service.SysUserService;
import com.utils.ConcurrentDateUtils;
import com.utils.Query;

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService{

	@Autowired
	private SysUserDao sysUserDao;
	
	public boolean save(SysUserBean sysUserBean) {
		SysUserBean sysUser = sysUserDao.queryObject(sysUserBean);
		if(sysUser != null) {
			return false;
		}
		sysUserBean.setCreate_time(ConcurrentDateUtils.format(new Date()));
		int i = sysUserDao.save(sysUserBean);
		return i > 0 ? true : false;
	}

	public boolean update(SysUserBean sysUserBean) {
		sysUserBean.setCreate_time(ConcurrentDateUtils.format(new Date()));
		int i = sysUserDao.update(sysUserBean);
		return i > 0 ? true : false;
	}

	public SysUserBean queryObject(SysUserBean sysUserBean) {
		return sysUserDao.queryObject(sysUserBean);
	}

	public List<SysUserBean> queryList(Query query) {
		return sysUserDao.queryList(query);
	}

	public int queryTotal(Query query) {
		return sysUserDao.queryTotal(query);
	}
	
	

}
