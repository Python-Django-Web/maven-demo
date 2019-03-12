package com.admin.manage.controller;

import com.admin.manage.entity.SysRoleBean;
import com.admin.manage.service.SysRoleService;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 权限管理
 * @Tools: Eclipse IDE
 * @Author: cheungn
 * @Date: 16:37 2019/03/09
 */
@RestController
@RequestMapping(value = "/sysRole")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;


    /**
     * save administrative permissions
     * 
     * @param sysRoleBean
     * @return
     */
    @RequestMapping(value = "save.do")
    public R save(SysRoleBean sysRoleBean){
        if(sysRoleBean == null){
            return R.error("null param");
        }
        boolean flag = sysRoleService.save(sysRoleBean);
        if(flag){
            return R.ok("success");
        }else {
            return R.error("fail");
        }
    }

}
