package com.david.edspringbootgradle.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.david.edspringbootgradle.domain.Authority;

/**
 * 权限
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestResource(exported= false)
public interface AuthorityRepository extends CrudRepository<Authority, Long>{

	List<Authority> findByUsername(String username);

	
}
