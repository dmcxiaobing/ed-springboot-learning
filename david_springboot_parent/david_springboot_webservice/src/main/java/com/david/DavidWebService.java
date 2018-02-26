package com.david;

import javax.jws.WebMethod;
import javax.jws.WebService;
/**
 * 一个webservice的接口。
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@WebService //说明是一个webservice的接口
public interface DavidWebService {	
	
	@WebMethod // 表示这个方法要发布出去
	public String sayHello(String name);
}
