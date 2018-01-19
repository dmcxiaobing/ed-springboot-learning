package com.david.edspringbootgradle.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.david.edspringbootgradle.domain.Authority;
import com.david.edspringbootgradle.domain.User;
import com.david.edspringbootgradle.repository.AuthorityRepository;
import com.david.edspringbootgradle.repository.UserRepository;
import com.david.edspringbootgradle.service.UserService;

/**
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AuthorityRepository authorityRepository;


	/**
	 * 获取所有用户
	 */
	@Override
	public Object getUserList(int current, int rowCount, String searchPhrase) {
		HashMap<String, Object>  ret = new HashMap<String,Object>();
		List<Object> pList = new ArrayList<>();
		// 获取到所有用户数量
		Long total = userRepository.count();
		int i = 0;
		if (rowCount == -1) {
			rowCount = new Long(total).intValue();
		}
		Pageable pageable =new PageRequest(current - 1, rowCount);
		// PageRequest 开始和每页记录数
		Page<User> users = userRepository.findAll(pageable);
		for (User user : users) {
			HashMap<String, Object> data = new HashMap<String, Object>();
			data.put("id", user.getId());
			data.put("username", user.getUsername());
			data.put("image", user.getImage());
			if (user.getEnabled() == 1) {
				data.put("enabled", "<font color='green'>启用</font>");
			} else {
				data.put("enabled", "<font color='red'>禁用</font>");
			}
			/**
			 * 查询权限
			 */
			List<Authority> authorities = authorityRepository.findByUsername(user.getUsername());
			ArrayList<String> arrayList = new ArrayList<String>();
			for (Authority authority : authorities) {
				if (authority.getAuthority().equals("ROLE_ADMIN")) {
					arrayList.add("管理员");
				} else if (authority.getAuthority().equals("ROLE_USER")) {
					arrayList.add("用户");
				}
			}
			data.put("role", arrayList.toString());
			pList.add(data);
			i++;
		}
		ret.put("current", 1);
		// 用户数量
		ret.put("rowCount", i);
		// 数据
		ret.put("rows", pList);
		// 数量
		ret.put("total", total);
		System.out.println(ret.toString());
		return ret;
	}

	
	
	public void testPageQuery() throws Exception {
	    int page=1,size=10;
	    Sort sort = new Sort(Direction.DESC, "id");
	    Pageable pageable = new PageRequest(page, size, sort);
//	    userRepository.findALL(pageable);
//	    userRepository.findByUserName("testName", pageable);
	}
	
	/**
	 * 获取当前用户
	 */
	@Override
	public User getCurrentUser() {
		return userRepository.findByUsername(getCurrentUsername());
	}

	/**
	 * 获取当前登陆的用户名称
	 */
	@Override
	public String getCurrentUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = authentication.getName();
		return username;
	}

}
