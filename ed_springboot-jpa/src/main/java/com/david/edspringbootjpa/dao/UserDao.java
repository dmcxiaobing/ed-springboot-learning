package com.david.edspringbootjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.edspringbootjpa.domain.User;

/**
 * 直接操作用户的dao
 * @Author ：David
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */

public interface UserDao extends JpaRepository<User,Integer>{

	/**
	 * 通过年龄查找用户
	 */
	public List<User> findByAge(Integer age);
}
