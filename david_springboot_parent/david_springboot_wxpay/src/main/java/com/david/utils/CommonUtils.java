package com.david.utils;


import java.util.Map;
import java.util.UUID;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;


/**
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * @OsChina空间: https://my.oschina.net/mcxiaobing
 */
/**
 * 一个公共的工具类
 */
public class CommonUtils {
	/**
	 * 获取一个32位的随机数 16位数字组成。并去掉“-”并且转换为大写
	 * 
	 */
	public static String getUUIDRandomNum() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}

	/**
	 * 将map中的数据直接封装到一个javabean中
	 */
	public static <T> T toBean(Map map, Class<T> clazz) {
		try {
			/**
			 * 创建指定类型的JavaBean对象
			 */
			/*
			 * 1. 通过参数clazz创建实例 2. 使用BeanUtils.populate把map的数据封闭到bean中
			 */
			T bean = clazz.newInstance();
			ConvertUtils.register(new DateConverter(), java.util.Date.class);
			// 将数据封装在javabean中
			BeanUtils.populate(bean, map);
			// 返回javabean对象
			return bean;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
}
