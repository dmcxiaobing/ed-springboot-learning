package com.david.edspringbootgradle.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.david.edspringbootgradle.domain.News;
import com.david.edspringbootgradle.domain.NewsCreateForm;

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

	Page<News> getNewsList(Long startId, Pageable pageable);

	News create(NewsCreateForm form);

}
