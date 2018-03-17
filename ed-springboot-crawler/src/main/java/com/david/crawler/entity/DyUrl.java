package com.david.crawler.entity;

public class DyUrl {

	
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private String name;
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
