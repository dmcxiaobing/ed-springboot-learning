package com.david;

import javax.jws.WebService;


/*
 * 定义一个webservice的接口实现类
 */
@WebService
public class DavidWebServiceImpl implements DavidWebService {

	@Override
	public String sayHello(String name) {
		System.out.println("接口实现类中发布成功");
		String impl = name + "davidImpl";
		return impl;
	}

}
