package com.david.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.david.entity.SysPermission;
import com.david.entity.SysRole;
import com.david.entity.UserInfo;
import com.david.service.UserInfoService;


/**
 * shiro的验证.包括用户名密码是否正确以及权限的验证
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class MyShiroRealm extends AuthorizingRealm{
	
	
	@Autowired
	private UserInfoService userInfoService;
	/**
	 * 主要用来验证身份，也就是说验证用户名和密码是否正确
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		// 获取用户的输入的账号。
		String username = (String)token.getPrincipal();
		// 通过username从数据库中查找User对象，是否能够查找到。
		// 实际项目中，这里可以根据实际情况作缓存，如果不做，shiro自己也有时间间隔机制，两分钟内不会重复执行此方法
		UserInfo userInfo = userInfoService.findByUsername(username);
		System.out.println(userInfo);
		if (userInfo==null) {
			// 没有查找到用户
			return null;
		}
		// 匹配密码
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
				userInfo,//用户名
				userInfo.getPassword()//密码
				,ByteSource.Util.bytes(userInfo.getCredentialsSalt())//密码盐
				,getName()  //realm name
				);
		return authenticationInfo;
	}

	
	
	/**
	 * 验证权限
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		 System.out.println("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
	        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
	        UserInfo userInfo  = (UserInfo)principals.getPrimaryPrincipal();
	        for(SysRole role:userInfo.getRoleList()){
	            authorizationInfo.addRole(role.getRole());
	            for(SysPermission p:role.getPermissions()){
	                authorizationInfo.addStringPermission(p.getPermission());
	            }
	        }
	        return authorizationInfo;
	}

}
