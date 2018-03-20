package com.david.service;

import com.david.entity.UserInfo;
/**
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public interface UserInfoService {
	  /**通过username查找用户信息;*/
	public UserInfo findByUsername(String username);
}
