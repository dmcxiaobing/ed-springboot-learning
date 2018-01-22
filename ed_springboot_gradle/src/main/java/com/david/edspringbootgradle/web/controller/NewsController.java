package com.david.edspringbootgradle.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * 新闻api
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */

import com.david.edspringbootgradle.domain.Message;
import com.david.edspringbootgradle.domain.News;
import com.david.edspringbootgradle.domain.NewsCreateForm;
import com.david.edspringbootgradle.service.NewsService;
/**
 * 新闻api
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
@RequestMapping(value = "/api/v1/", name = "新闻api")
public class NewsController {

	@Autowired
	private NewsService newsService;
	private Message message = new Message();
	/**
	 * 创建新闻
	 * @param form 新闻中表单数据
	 * @return
	 */
	@RequestMapping(value="i/news/create",method=RequestMethod.POST)
	public ResponseEntity<Message> createNews(@Valid @RequestBody NewsCreateForm form
			,BindingResult bindingResult){
		try {
			News news = newsService.create(form);
			message.setMessage(1,"新闻创建成功");
			return new ResponseEntity<Message>(message,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			message.setMessage(0,"新闻创建失败");
			return new ResponseEntity<Message>(message,HttpStatus.OK);
		}
		
	}
	
	/**
	 * 
	 * 
	 * {
		  "code": 1,
		  "message": "获取新闻列表成功",
		  "content": {
		    "content": [
		      {
		        "id": 1,
		        "title": "womend ",
		        "img": null,
		        "content": "fsd"
		      },
		      {
		        "id": 3,
		        "title": "sdf",
		        "img": "",
		        "content": "safdfsd"
		      }
		    ],
		    "last": true,
		    "totalElements": 2,
		    "totalPages": 1,
		    "number": 0,
		    "size": 20,
		    "sort": null,
		    "numberOfElements": 2,
		    "first": true
		  }
		}
	 */
	
	/**
	 * 获取新闻列表
	 */
	@RequestMapping(value = "news/getNewsList", method = RequestMethod.GET)
	public ResponseEntity<Message> getNewsList(@RequestParam(defaultValue="0")Long startId
			,Pageable pageable) {
		Page<News> news = newsService.getNewsList(startId,pageable);
		message.setMessage(1, "获取新闻列表成功",news);
		return new ResponseEntity<Message>(message,HttpStatus.OK);
	}
}
