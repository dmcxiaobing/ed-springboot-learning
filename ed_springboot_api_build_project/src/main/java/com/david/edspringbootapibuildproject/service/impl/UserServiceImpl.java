package com.david.edspringbootapibuildproject.service.impl;

import com.david.edspringbootapibuildproject.dao.UserMapper;
import com.david.edspringbootapibuildproject.model.User;
import com.david.edspringbootapibuildproject.service.UserService;
import com.david.edspringbootapibuildproject.core.AbstractService;
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
