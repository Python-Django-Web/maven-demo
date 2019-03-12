package com.admin.manage.dao;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.admin.manage.entity.SysMenuBean;
import com.utils.base.BaseDao;

@Repository
public interface SysMenuDao extends BaseDao<SysMenuBean>{

	List<SysMenuBean> queryUserMenuList(Map<String, Object> map);
	
	List<SysMenuBean> queryPubList(int pub_id);
}
