package com.david.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.david.dao.UserInfoDao;
import com.david.entity.UserInfo;
/**
 * 用户信息
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

	@Resource
	private UserInfoDao userInfoDao;
	@Override
	public UserInfo findByUsername(String username) {
		return userInfoDao.findByUsername(username);
	}

}
