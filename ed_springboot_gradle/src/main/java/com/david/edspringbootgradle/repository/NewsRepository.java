package com.david.edspringbootgradle.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.david.edspringbootgradle.domain.News;

/**
 * 新闻
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestResource(exported=false)
public interface NewsRepository extends PagingAndSortingRepository<News, Long>{
	
	Page<News> findByIdGreaterThan(Long startId,Pageable pageable);
}
