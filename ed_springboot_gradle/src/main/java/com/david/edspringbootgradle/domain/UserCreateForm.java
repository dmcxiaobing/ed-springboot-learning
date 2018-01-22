package com.david.edspringbootgradle.domain;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 创建用户字段的model
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class UserCreateForm implements Serializable{

	@NotEmpty
	private String username;
	@NotEmpty
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserCreateForm [username=" + username + ", password=" + password + "]";
	}
	
	
}
