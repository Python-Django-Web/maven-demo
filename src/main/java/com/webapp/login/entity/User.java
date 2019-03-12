package com.webapp.login.entity;

public class User {
	private String id;
	private String userName_s;
	private String userpassword_s;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String id, String userName_s, String userpassword_s) {
		super();
		this.id = id;
		this.userName_s = userName_s;
		this.userpassword_s = userpassword_s;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName_s() {
		return userName_s;
	}

	public void setUserName_s(String userName_s) {
		this.userName_s = userName_s;
	}

	public String getUserpassword_s() {
		return userpassword_s;
	}

	public void setUserpassword_s(String userpassword_s) {
		this.userpassword_s = userpassword_s;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName_s=" + userName_s
				+ ", userpassword_s=" + userpassword_s + "]";
	}
	
	
}
