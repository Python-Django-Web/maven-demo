package com.admin.manage.entity;

import java.io.Serializable;

/**
 * Description：管理员
 * Aauthor：Ning
 * Date：11:27 2019/3/7
 */
public class SysUserBean implements Serializable{
    private static final long serialVersionUID = 2019332169506500201L;

    private int user_id;
    private String nickname;
    private String principal;
    private String credential;
    private boolean status;
    private String create_time;
    private int role_id;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
    
}
