package com.david.edspringbootgradle.service;

import java.util.List;

import com.david.edspringbootgradle.domain.News;

/**
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public interface NewsService {

	Iterable<News> findAll();

	void save(News news);

	News findById(Long id);

	void deleteById(Long id);

}
