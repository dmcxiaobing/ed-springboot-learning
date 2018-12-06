package com.david.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author ：David
 * @weibo ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
/**
 * 基于阿里巴巴 fastjson所做的工具类
 */
public class FastJsonUtil {

	/**
	 * 将对象转成json串
	 * 
	 * @param object
	 *            任意类型
	 */
	public static String toJSONString(Object object) {
		// 显示Javabean中的空值.并且禁止循环引用检测
		return JSON.toJSONString(object, SerializerFeature.WriteMapNullValue,SerializerFeature.DisableCircularReferenceDetect);
		// DisableCircularReferenceDetect来禁止循环引用检测
//		return JSON.toJSONString(object, SerializerFeature.DisableCircularReferenceDetect);
	}
	
	

	// 输出json
	public static void write_json(HttpServletResponse response, String jsonString) {
		response.setContentType("application/json;utf-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			writer.write(jsonString);
		} catch (IOException e) {
		} finally {
			if (writer != null) {
				writer.flush();
				writer.close();
			}
		}
	}


	/**
	 * 将json数据转换成pojo对象list
	 */
	public static <T> List<T> jsonToList(String jsonData, Class<T> clazz) {
		try {
			List<T> list = JSON.parseArray(jsonData, clazz);
			return list;
		} catch (Exception e) {
		}

		return null;
	}
	
	/**
	 * 将json转换成map
	 */
	public static Map<String, Object> json2Map(String json) {
		try {
			return JSON.parseObject(json, Map.class);
		}catch (Exception e){

		}
		return null;

	}

	/**
	 * 将json数据转换成pojo对象
	 */
	public static <T> T jsonToObject(String jsonData, Class<T> clazz) {
		try {
			T t = JSON.parseObject(jsonData, clazz);
			return t;
		} catch (Exception e) {
		}

		return null;
	}

	/**
	 * ajax提交后回调的json字符串
	 * 
	 * @return
	 */
	public static String ajaxResult(boolean success, String message) {
		Map map = new HashMap();
		map.put("success", success);// 是否成功
		map.put("message", message);// 文本消息
		String json = JSON.toJSONString(map,SerializerFeature.WriteMapNullValue);
		return json;
	}

	/**
	 * JSON串自动加前缀
	 * 
	 * @param json
	 *            原json字符串
	 * @param prefix
	 *            前缀
	 * @return 加前缀后的字符串
	 */

	public static String JsonFormatterAddPrefix(String json, String prefix, Map<String, Object> newmap) {
		if (newmap == null) {
			newmap = new HashMap();
		}
		Map<String, Object> map = (Map) JSON.parse(json);

		for (String key : map.keySet()) {
			Object object = map.get(key);
			if (isEntity(object)) {
				String jsonString = JSON.toJSONString(object);
				JsonFormatterAddPrefix(jsonString, prefix + key + ".", newmap);

			} else {
				newmap.put(prefix + key, object);
			}

		}
		return JSON.toJSONString(newmap);
	}

	/**
	 * 判断某对象是不是实体
	 * 
	 * @param object
	 * @return
	 */
	private static boolean isEntity(Object object) {
		if (object instanceof String) {
			return false;
		}
		if (object instanceof Integer) {
			return false;
		}
		if (object instanceof Long) {
			return false;
		}
		if (object instanceof java.math.BigDecimal) {
			return false;
		}
		if (object instanceof Date) {
			return false;
		}
		if (object instanceof java.util.Collection) {
			return false;
		}
		return true;

	}
}
