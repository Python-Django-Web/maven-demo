package com.admin.manage.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.admin.manage.entity.SysUserBean;
import com.admin.manage.service.SysUserService;
import com.alibaba.fastjson.JSON;
import com.utils.Query;
import com.utils.R;

/**
 * @Description: 管理员
 * @Tools: Eclipse IDE
 * @Author: cheungn
 * @Date: 16:36 2019/03/09
 */
@RestController
@RequestMapping(value = "/sysUser")
public class SysUserController {
	
	@Autowired
	private SysUserService sysUserService;
	
	
	/**
	 * save administrator
	 * 
	 * @param sysUserBean
	 * @return
	 */
	@RequestMapping(value = "save.do")
	public R save(SysUserBean sysUserBean){
		if(sysUserBean == null){
			return R.error("null param");
		}
		boolean flag = sysUserService.save(sysUserBean);
		if(flag){
			return R.ok("success");
		}else {
			return R.error("fail");
		}
	}
	
	
	/**
	 * administrator login
	 * 
	 * @param sysUserBean
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "login.do")
	public R login(SysUserBean sysUserBean, HttpServletRequest request) {
		if(StringUtils.isEmpty(sysUserBean.getPrincipal()) && StringUtils.isEmpty(sysUserBean.getCredential())) {
			return R.error("null param");
		}
		SysUserBean sysUser = sysUserService.queryObject(sysUserBean);
		if(sysUser != null) {
			request.getSession().setAttribute("sysUser", sysUser);
			return R.ok("success").put("data", sysUser);
		}else {
			return R.error("fail");
		}
	}
	
	
	/**
	 * administrator exit
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "logout.do")
	public R logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session == null){
            return R.error("fail");
        }
        session.removeAttribute("sysUser");
        session.invalidate();
        return R.ok("success");
	}
	
	
	/**
	 * current login administrator
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "currentUser.do")
	public R currentUser(HttpServletRequest request) {
		SysUserBean sysUserBean = (SysUserBean) request.getSession().getAttribute("sysUser");
		if(sysUserBean != null && sysUserBean.getUser_id() != 0) {
			return R.ok().put("data", sysUserBean);
		}else {
			return R.error("null data");
		}
	}
	
	
	
	/**
	 * update change password
	 * 
	 * @param sysUserBean
	 * @return
	 */
	@RequestMapping(value = "edit.do")
	public R edit(SysUserBean sysUserBean){
		if(sysUserBean.getUser_id() == 0) {
			return R.error("null param");
		}
		boolean flag = sysUserService.update(sysUserBean);
		if(flag){
			return R.ok("success");
		}else {
			return R.error("fail");
		}
	}
	
	
	/**
	 * administrator details
	 * 
	 * @param sysUserBean
	 * @return
	 */
	@RequestMapping(value = "details.do")
	public R details(SysUserBean sysUserBean) {
		if(sysUserBean == null) {
			return R.error("null param");
		}
		SysUserBean sysUser = sysUserService.queryObject(sysUserBean);
		if(sysUser != null) {
			return R.ok().put("data", sysUser);
		}else {
			return R.error("null data");
		}
	}
	
	
	/**
	 * all administrator details
	 * 
	 * @param jsonStr
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "queryList.do")
	public R queryList(String jsonStr, Map<String, Object> map) {
		if(StringUtils.isEmpty(jsonStr)) {
			return R.error("null param");
		}
		map = JSON.parseObject(jsonStr);
		Query query = new Query(map);
		List<SysUserBean> sysUserBeans = sysUserService.queryList(query);
		int total = sysUserService.queryTotal(query);
		return R.ok().put("data", sysUserBeans).put("count", total);
	}

}
