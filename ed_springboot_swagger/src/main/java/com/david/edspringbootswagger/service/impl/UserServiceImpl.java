package com.david.edspringbootswagger.service.impl;

import com.david.edspringbootswagger.dao.UserMapper;
import com.david.edspringbootswagger.model.User;
import com.david.edspringbootswagger.service.UserService;
import com.david.edspringbootswagger.core.AbstractService;
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

}
