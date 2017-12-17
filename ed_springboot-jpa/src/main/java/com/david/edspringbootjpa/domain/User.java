package com.david.edspringbootjpa.domain;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 一个用户的javabean
 * 
 * @Author ：David
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
// 和数据库表对应user,如果数据库表不存在，则会根据application.yml配置的进行操作，新建等
/**
 * 
 创建表：
 * CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
插入数据：
INSERT into user VALUES (1,22,'david');

 */
@Entity
public class User {
	
	// PRIMARY KEY
	@Id
	// 自增
	@GeneratedValue
	private Integer uid;
	// 用户名
	@NotBlank(message="缺少username字段，必填字段")
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

	public User(String username, Integer age) {
			super();
			this.username = username;
			this.age = age;
		}

	public User() {
			super();
		}

	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + "]";
	}
}
