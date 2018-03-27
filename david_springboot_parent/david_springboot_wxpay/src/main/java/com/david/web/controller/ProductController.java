package com.david.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 转发到商品列表jsp
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Controller
public class ProductController {
	/**
	 * 转发到商品列表html页面。
	 */
	@RequestMapping("/product_list")
	public String product_list() {
		
		return "product_list";
	}
	
	/**
	 * 转发到生成支付二维码的页面
	 */
	@RequestMapping("/toCreateCode")
	public String toCreateCode() {
		return "createCode";
	}
	

	/**
	 * 支付成功。转发到成功页面。
	 */
	@RequestMapping("/success")
	public String success() {
		System.out.println("success");
		return "success";
	}
}
