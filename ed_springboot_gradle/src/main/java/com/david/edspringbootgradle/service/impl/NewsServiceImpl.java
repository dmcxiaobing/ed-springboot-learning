package com.david.edspringbootgradle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.edspringbootgradle.domain.News;
import com.david.edspringbootgradle.repository.NewsRepository;
import com.david.edspringbootgradle.service.NewsService;

/**
 * 新闻
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsRepository newsRepository;
	/**
	 * 查询所有
	 */
	@Override
	public Iterable<News> findAll() {
		return newsRepository.findAll();
	}
}
