package com.david.edspringbootgradle.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.david.edspringbootgradle.domain.User;


/**
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestResource(exported = false) // 禁止暴露REST
public interface UserRepository  extends CrudRepository<User, Long>{

	User findByUsername(Object currentUsername);

}
