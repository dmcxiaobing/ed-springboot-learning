package com.david.edspringbootjpa.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 将配置文件的内容，直接读取到javabean中
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
@Component
// 将application.properties中的配置映射
@ConfigurationProperties(prefix="user")
public class UserProperties {

	// 用户名
	private String username;
	// 年龄
	private Integer age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public UserProperties(String username, Integer age) {
		super();
		this.username = username;
		this.age = age;
	}
	public UserProperties() {
		super();
	}
	@Override
	public String toString() {
		return "UserProperties [username=" + username + ", age=" + age + "]";
	}


	
}
