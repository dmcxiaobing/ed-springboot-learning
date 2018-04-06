package com.david.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.david.entity.Message;
import com.david.utils.MyMapper;

/**
 * 消息mapper
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Repository
public interface MessageMapper extends MyMapper<Message> {

	/**
	 * 查询所有
	 */
	public List<Message> list();

	/**
	 * 查询数量
	 */
	public int count();

}
