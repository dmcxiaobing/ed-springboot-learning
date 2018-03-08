package com.david.demo;

import org.apache.naming.java.javaURLContextFactory;

/**
 * 简单的运算
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class Demo1 {

	
	public static void main(String[] args) {
//		test1();
		tetString();
		
	}

	private static void tetString() {
		String he = null;
		String david = "qq986945193";
		System.out.println(he instanceof String);
		System.out.println(david instanceof String);
	}

	/**
	 * 检测j++的缓存机制。
	 */
	private static void test1() {
		int j = 0;
		for (int i = 0; i < 3; i++) {
//			j = j+1;
			// j++  实际就是  tem = j;j=j+1;j=tem。因此j的值一直是0
			j = j++ ;
			System.out.println(j);
		}
		System.out.println(j);
	}
}
