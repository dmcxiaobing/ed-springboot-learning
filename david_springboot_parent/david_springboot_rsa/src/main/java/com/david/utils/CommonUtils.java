package com.david.utils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.springframework.util.CollectionUtils;

import com.david.entity.ResponseEntity;

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

	/**
	 * Bean --> Map 1: 利用Introspector和PropertyDescriptor 将Bean --> Map
	 *
	 * @param obj
	 */
	public static Map<String, Object> transBean2Map(Object obj)
			throws IntrospectionException, InvocationTargetException, IllegalAccessException {

		if (obj == null) {
			return null;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor property : propertyDescriptors) {
			String key = property.getName();

			// 过滤class属性
			if (!key.equals("class")) {
				// 得到property对应的getter方法
				Method getter = property.getReadMethod();
				Object value = getter.invoke(obj);

				map.put(key, value);
			}

		}
		return map;
	}

	/**
	 * 拷贝实体，source,target不允许为空
	 *
	 * @param source
	 * @param target
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 */
	public static void copyProperties(Object source, Object target)
			throws IllegalAccessException, InvocationTargetException {
		BeanUtils.copyProperties(source, target);
	}

	/**
	 * 拷贝实体集合，sourceList，targetList不允许为空
	 *
	 * @param sourceList
	 * @param targetList
	 * @throws Exception
	 */
	public static void copyPropertiesList(List sourceList, List targetList) throws Exception {
		if (CollectionUtils.isEmpty(sourceList) || CollectionUtils.isEmpty(targetList)) {
			throw new Exception();
		}
		sourceList.forEach(items -> {
			Object target = new Object();
			try {
				BeanUtils.copyProperties(items, target);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			targetList.add(target);
		});
	}

	/**
	 * Map --> Bean 2: 利用org.apache.commons.beanutils 工具类实现 Map --> Bean
	 *
	 * @param map
	 * @param obj
	 */
	public static void transMap2Bean2(Map<String, Object> map, Object obj)
			throws InvocationTargetException, IllegalAccessException {
		if (map == null || obj == null) {
			return;
		}
		org.apache.commons.beanutils.BeanUtils.populate(obj, map);
	}

	/**
	 * Map --> Bean 1: 利用Introspector,PropertyDescriptor实现 Map --> Bean
	 *
	 * @param map
	 * @param obj
	 */
	public static void transMap2Bean(Map<String, Object> map, Object obj)
			throws IntrospectionException, InvocationTargetException, IllegalAccessException {
		BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

		for (PropertyDescriptor property : propertyDescriptors) {
			String key = property.getName();
			if (map.containsKey(key)) {
				Object value = map.get(key);
				// 得到property对应的setter方法
				Method setter = property.getWriteMethod();
				setter.invoke(obj, value);
			}
		}
	}

	public static void main(String[] args)
			throws InvocationTargetException, IllegalAccessException, IntrospectionException {
		ResponseEntity entity = new ResponseEntity("uid", "986945193");
		Map<String, Object> map = transBean2Map(entity);
		System.out.println(FastJsonUtil.toJSONString(map));
	}
}
