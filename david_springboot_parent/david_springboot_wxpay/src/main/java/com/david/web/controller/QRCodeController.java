package com.david.web.controller;

import org.assertj.core.data.Index;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 生成二维码的图片
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Controller
public class QRCodeController {

	/**
	 * 转发到html页面。利用qrcode.js生成二维码
	 */
	@RequestMapping("/qrcode")
	public String qrcode() {
		
		return "qrcode";
	}
}
