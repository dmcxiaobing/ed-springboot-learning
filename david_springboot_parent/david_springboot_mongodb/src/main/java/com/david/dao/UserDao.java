package com.david.dao;

import com.david.model.User;

/**
 * 用户dao
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public interface UserDao {
    public void saveUser(User user);

    public User findUserByUserName(String userName);

    public int updateUser(User user);

    public void deleteUserById(Long id);
}
