package com.david.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 写一个通用mapper，使自己的项目，继承此mapper。
 * 
 * 注意：该接口不能被扫描到，不然会出错。
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public interface MyMapper<T>  extends Mapper<T>,MySqlMapper<T>{

}
