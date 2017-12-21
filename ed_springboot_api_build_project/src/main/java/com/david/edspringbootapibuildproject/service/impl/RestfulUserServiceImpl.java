package com.david.edspringbootapibuildproject.service.impl;

import com.david.edspringbootapibuildproject.dao.RestfulUserMapper;
import com.david.edspringbootapibuildproject.model.RestfulUser;
import com.david.edspringbootapibuildproject.service.RestfulUserService;
import com.david.edspringbootapibuildproject.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
