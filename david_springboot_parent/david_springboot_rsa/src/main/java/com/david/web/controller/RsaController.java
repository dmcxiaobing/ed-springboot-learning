package com.david.web.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.david.entity.ResponseEntity;
import com.david.utils.FastJsonUtil;
import com.david.utils.HttpUrlconnectionUtils;
import com.david.utils.HttpUrlconnectionUtils.CallBack;
import com.david.utils.RandomUtil;
import com.david.utils.RsaUtil;


@RestController
public class RsaController {

	/**
	 * rsa加密
	 */
	@RequestMapping("/encode")
	public void rsaEncode(HttpServletResponse response) throws Exception {
		ResponseEntity entity = new ResponseEntity();
		entity.setUserid("123456");
		entity.setPhone("1234566777");
//		RsaUtil.setDefaultRsa(entity);
		entity.setCode(504);
		// 设置未加密数据
		entity.setData("data is not sign");
		entity.setAesKey("no aes key");
		System.out.println(entity);
		// 随机生成AES密钥
		String aesKey = RandomUtil.getRandom(16);
		// 加密
		String data = RsaUtil.serverResponseData(entity, aesKey);
		String aeskey =  RsaUtil.serverResponseEncryptKey(aesKey);
		// 发送
		entity.setCode(200);
		entity.setData(data);
		entity.setAesKey(aeskey);
//		RsaUtil.setSignRsa(entity, 200, data, aeskey);
		System.out.println("gengxinhou:"+entity);
		
		FastJsonUtil.write_json(response, FastJsonUtil.toJSONString(entity));
	}
	
	/**
	 * rsa加密加密失败。
	 */
	@RequestMapping("/encodeError")
	public void encodeError(HttpServletResponse response) throws Exception {
		ResponseEntity entity = new ResponseEntity("uid", "986945193");
		// 随机生成AES密钥
		String aesKey = RandomUtil.getRandom(16);
		// 加密
		String data = RsaUtil.serverResponseData(entity, aesKey);
		String aeskey =  RsaUtil.serverResponseEncryptKey(aesKey);
		// 发送
		entity.setCode(400);
		entity.setData("");
		entity.setAesKey("");
		FastJsonUtil.write_json(response, FastJsonUtil.toJSONString(entity));
	}
	
	
	@RequestMapping("/decode")
	public void decode(HttpServletResponse response) throws Exception {
		final String decodeResult = "";
		HttpUrlconnectionUtils.doGetAsyn("http://localhost:8080/encode", new CallBack() {
			
			@Override
			public void onRequestComplete(String result) {
				System.out.println("加密后的数据是："+result);
				// 解析加密数据
				ResponseEntity responseEntity =  JSONObject.parseObject(result, ResponseEntity.class);//JSON字符串转对象
				try {
					String decodeResult = RsaUtil.clientDecode(responseEntity.getData(), responseEntity.getAesKey());
//					FastJsonUtil.write_json(response, decodeResult);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	
}
