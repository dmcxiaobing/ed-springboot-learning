package com.david.edspringbootgradle.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Spring-security中Bcrypt算法
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class BCryptUtil {

	public static void main(String[] args) {
//		int t = 0;
//		String password = "123456";
//		System.out.println(password + " -> ");
//		for (t = 1; t <= 10; t++) {
//		    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		    String hashedPassword = passwordEncoder.encode(password);
//		    System.out.println(hashedPassword);
//		}
//
//		password = "admin";
//		System.out.println(password + " -> ");
//		for (t = 1; t <= 10; t++) {
//		    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		    String hashedPassword = passwordEncoder.encode(password);
//		    System.out.println(hashedPassword);
//		}
//		
		//$2a$10$xOXicDtmPHeK/S2N6RvQtu3WyL6IlSePPOYS7aPSU.1xbEx3kfrFa
		System.out.println(encodeBCrypt("admin"));
	}
	
	
	/**
	 * 进行加密采用BCrypt加密，salt 10
	 * String password 明文密码
	 */
	public static String encodeBCrypt(String password) {
		 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
		 String hashedPassword = passwordEncoder.encode(password);
		return hashedPassword;		
	} 
}
