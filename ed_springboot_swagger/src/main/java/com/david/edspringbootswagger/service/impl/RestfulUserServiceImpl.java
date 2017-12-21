package com.david.edspringbootswagger.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.david.edspringbootswagger.core.AbstractService;
import com.david.edspringbootswagger.dao.RestfulUserMapper;
import com.david.edspringbootswagger.model.RestfulUser;
import com.david.edspringbootswagger.service.RestfulUserService;

import javax.annotation.Resource;


/**
 * Created by David on 2017/12/21.
 */
@Service
@Transactional
public class RestfulUserServiceImpl extends AbstractService<RestfulUser> implements RestfulUserService {
    @Resource
    private RestfulUserMapper restfuluserMapper;

}
