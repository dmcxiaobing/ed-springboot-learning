package com.david.edspringbootapibuildproject.service.impl;

import com.david.edspringbootapibuildproject.dao.UserMapper;
import com.david.edspringbootapibuildproject.model.User;
import com.david.edspringbootapibuildproject.service.UserService;
import com.mysql.jdbc.log.LogUtils;
import com.david.edspringbootapibuildproject.core.AbstractService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by David on 2017/12/20.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User findUserByUsernamePassword(String username, String password) {
        if (StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password)){
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            User dbuser = userMapper.findUserByUsernamePassword(user);
            if (dbuser != null) {
                return dbuser;

            }
        }

        return null;
    }
}
