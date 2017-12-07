package com.david.edspringbootlearning.introduce.spring.demo1.model;
/**
 * 
 * @author ：david  
 * @新浪微博 ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class User {

	private String username;
	private String password;
	private Integer age;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public User(String username, String password, Integer age) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
	}
	public User() {
		super();
	}
	
}
