package com.david.utils;

import java.util.UUID;
/**
 * 一个简单处理文件重名的问题
 * @author ：david  
 * @新浪微博 ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class CommonUtil {
	// 生成上传文件的名称
	public static String getFileName(String primitiveFileName) {
		// 使用uuid生成文件名
		String fileName = UUID.randomUUID().toString();
		// 获取文件后缀
		String suffix = primitiveFileName.substring(primitiveFileName.lastIndexOf("."));
		return fileName + suffix;
	}
}
