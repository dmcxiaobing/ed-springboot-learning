package com.david.web.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户信息
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

	/**
	 * 用户查询
	 */
	@RequestMapping("/userList")
	@RequiresPermissions("userInfo:view") // 权限管理
	public String userInfo() {
		return "userInfo";
	}

	/**
	 * 用户添加
	 */
	@RequestMapping("/userAdd")
	@RequiresPermissions("userInfo:add")
	public String userInfoAdd() {
		return "userInfoAdd";
	}

	/**
	 * 用户删除
	 */
	@RequestMapping("/userDel")
	@RequiresPermissions("userInfo:del")
	public String userDel() {
		return "userInfoDel";
	}
}
