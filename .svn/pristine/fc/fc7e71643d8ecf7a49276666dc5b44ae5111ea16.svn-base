package com.admin.manage.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.admin.manage.entity.SysMenuBean;
import com.admin.manage.entity.SysUserBean;
import com.admin.manage.service.SysMenuService;
import com.utils.R;

/**
 * @Description: 管理权限&菜单
 * @Tools: Eclipse IDE
 * @Author: cheungn
 * @Date: 16:37 2019/03/09
 */
@RestController
@RequestMapping(value = "/sysMenu")
public class SysMenuController {

	@Autowired
	private SysMenuService sysMenuService;
	
	
	/**
	 * user and administrative permissions
	 *
	 * @param map
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "queryUserMenuList.do")
	public R queryUserMenuList(Map<String, Object> map, HttpServletRequest request) {
		SysUserBean sysUserBean = (SysUserBean) request.getSession().getAttribute("sysUser");
		if(sysUserBean != null) {
			map.put("user_id", sysUserBean.getUser_id());
		}
		List<SysMenuBean> sysMenuBeans = sysMenuService.queryUserMenuList(map);
		return R.ok().put("data", sysMenuBeans);
	}
}
