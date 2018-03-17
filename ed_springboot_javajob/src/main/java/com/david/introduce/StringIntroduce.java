package com.david.introduce;
/**
 * String的简单介绍
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class StringIntroduce {
	public static void main(String[] args) {
		String string = "hello building 小区 3 room";
		// 获取小区出现的位置
		System.out.println(string.indexOf("小区"));
		// 截取小区之前的数据
		string = string.substring(0,string.indexOf("小区"));
		System.out.println(string);
	}
}
