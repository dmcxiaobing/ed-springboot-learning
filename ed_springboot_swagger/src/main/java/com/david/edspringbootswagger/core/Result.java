package com.david.edspringbootswagger.core;

import com.alibaba.fastjson.JSON;

/**
 * 统一API响应结果封装
 */
public class Result {
	/**
	 * 响应结果码
	 */
    private int code;
    /**
     * 返回的描述信息
     */
    private String message;
    /**
     * 返回的具体内容。某个javabean
     */
    private Object data;

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code;
        return this;
    }

    public int getCode() {
        return code;
    }

    public Result setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }
    /**
     * 直接将对象转换成json
     */
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
