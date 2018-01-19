package com.david.edspringbootgradle.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.david.edspringbootgradle.domain.User;


/**
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestResource(exported = false) // 禁止暴露REST
public interface UserRepository  extends JpaRepository<User, Long>{

	User findByUsername(Object currentUsername);

//	Page<User> findByUsernameContaining(String searchPhrase, PageRequest pageRequest);

}
