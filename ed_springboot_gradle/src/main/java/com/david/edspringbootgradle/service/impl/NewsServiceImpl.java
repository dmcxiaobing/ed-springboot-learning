package com.david.edspringbootgradle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.david.edspringbootgradle.domain.News;
import com.david.edspringbootgradle.domain.NewsCreateForm;
import com.david.edspringbootgradle.domain.User;
import com.david.edspringbootgradle.repository.NewsRepository;
import com.david.edspringbootgradle.service.NewsService;
import com.david.edspringbootgradle.service.UserService;

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
	@Autowired
	private UserService userService;
	/**
	 * 查询所有
	 */
	@Override
	public Iterable<News> findAll() {
		return newsRepository.findAll();
	}

	/**
	 * 保存
	 */
	@Override
	public void save(News news) {
		newsRepository.save(news);
	}

	/**
	 * 根据主键id查找
	 */
	@Override
	public News findById(Long id) {
		return newsRepository.findOne(id);
	}

	/**
	 * 根据主键id删除
	 */
	@Override
	public void deleteById(Long id) {
		newsRepository.delete(id);
	}

	/**
	 * 获取新闻列表
	 */
	@Override
	public Page<News> getNewsList(Long startId, Pageable pageable) {
		Page<News> page = newsRepository.findByIdGreaterThan(startId, pageable);
		return page;
	}
	/**
	 * 创建新闻
	 */
	@Override
	public News create(NewsCreateForm form) {
		User user = userService.getCurrentUser();
		News news = new News();
		news.setContent(form.getContent());
		news.setTitle(form.getTitle());
		news.setImg(form.getImg());
		newsRepository.save(news);
		return news;
	}
}
