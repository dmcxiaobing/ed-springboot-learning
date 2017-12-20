package com.david.edspringbootjpa.util;

import com.david.edspringbootjpa.domain.Result;

/**
 * 返回客户端的数据整体封装
 * 
 * @Author ：David
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
public class ResultUtils {

	/**
	 * 返回成功，带有Javabean数据
	 */
	public static Result success(Object object) {
		Result result = new Result<>();
		result.setCode(0);
		result.setMsg("成功");
		result.setData(object);
		return result;
	}

	/**
	 * 返回成功，没有Javabean数据
	 */
	public static Result result() {
		return success(null);
	}

	/**
	 * 返回失败
	 */
	public static Result error(Integer code, String msg) {
		Result result = new Result<>();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}
}
