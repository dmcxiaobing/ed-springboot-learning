package com.david.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.david.dao.UserDao;
import com.david.model.User;
import com.mongodb.WriteResult;
/**
 * dao的实现类
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private MongoTemplate mongoTemplate;
	
	/**
	 * 创建对象
	 */
	@Override
	public void saveUser(User user) {
		mongoTemplate.save(user);
	}

	/**
	 * 根据用户名查找对象
	 */
	@Override
	public User findUserByUserName(String userName) {
		// 创建query对象
		Query query = new Query(Criteria.where("userName").is(userName));
		User user = mongoTemplate.findOne(query, User.class);
		return user;
	}
	/**
	 * 更新对象.返回修改的数量
	 */
	@Override
	public int updateUser(User user) {
		Query query = new Query(Criteria.where("id").is(user.getId()));
		Update update = new Update().set("userName", user.getUserName())
				.set("passWord", user.getPassWord());
		// 更新查询返回结果集的第一条
		WriteResult result = mongoTemplate.updateFirst(query, update, User.class);
		if (result!=null) {
			return result.getN();
		}
		return 0;
	}
	/**
	 * 删除对象
	 */
	@Override
	public void deleteUserById(Long id) {
		// 根据id查找
		Query query = new Query(Criteria.where("id").is(id));
		mongoTemplate.remove(query,User.class);
	}

}
