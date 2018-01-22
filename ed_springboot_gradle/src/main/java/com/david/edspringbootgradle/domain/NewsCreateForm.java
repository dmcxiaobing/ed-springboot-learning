package com.david.edspringbootgradle.domain;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 创建新闻表单pojo
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class NewsCreateForm implements Serializable{

	@NotEmpty
	private String title;
	
	@NotEmpty
	private String content;
	@NotEmpty
	private String img;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public NewsCreateForm(String title, String content, String img) {
		super();
		this.title = title;
		this.content = content;
		this.img = img;
	}
	public NewsCreateForm() {
		super();
	}
	
	
}
