package com.david.edspringbootlearning.introduce.freemarker.method;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import freemarker.template.SimpleSequence;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

/**
 * 实现排序。freemarker要实现TemplateMethodModelEx接口
 * 
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
public class SortMethod implements TemplateMethodModelEx {
	/**
	 * 升序
	 */
	@Override
	public Object exec(List arguments) throws TemplateModelException {
		// 获取第一个参数
		SimpleSequence arg0 = (SimpleSequence) arguments.get(0);
		List<BigDecimal> list = arg0.toList();
		// Comparator接口
		Collections.sort(list, new Comparator<BigDecimal>() {

			@Override
			public int compare(BigDecimal o1, BigDecimal o2) {
				// 升序
				return o1.intValue() - o2.intValue();
			}
		});
		return list;
	}

}
