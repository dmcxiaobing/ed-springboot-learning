package com.david.dao;

import org.springframework.data.repository.CrudRepository;

import com.david.entity.UserInfo;
/**
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public interface UserInfoDao extends CrudRepository<UserInfo, Long>{

	public UserInfo findByUsername(String username);

}
