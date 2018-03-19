package com.david.crawler.entity;
/**
 * 匹配数据库结构。电影实体类
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class DyUrl {

	// 主键id
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	// 电影名称
	private String name;
	// 电影url
	private String dyurl;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDyurl() {
		return dyurl;
	}
	public void setDyurl(String dyurl) {
		this.dyurl = dyurl;
	}
	@Override
	public String toString() {
		return "DyUrl [name=" + name + ", dyurl=" + dyurl + "]";
	}
	
	
}
