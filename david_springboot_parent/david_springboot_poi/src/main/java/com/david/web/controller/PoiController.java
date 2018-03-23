package com.david.web.controller;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.david.convert.EntityToMapConvert;
import com.david.entity.WordParam;
import com.david.utils.FileUtil;
import com.david.utils.PoiUtil;
/**
 * poi生成doc
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Controller
public class PoiController extends BaseController {
	private static final Logger LOGGER = LoggerFactory.getLogger(PoiController.class);

	@Value("${company}")
	private String company;

	/**
	 * 转发到index页面
	 */
	@RequestMapping("/")
	public ModelAndView index(Model model) {
		
		try {
			// properties文件中的中文 默认是以ISO-8859-1的字符编码读取
						// 要想获取真实数据，需要重新编码
			model.addAttribute("company",new String(company.getBytes("ISO-8859-1")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("index");
	}

	/**
	 * 生成文件
	 */
	@RequestMapping("/build")
	public ResponseEntity<byte[]> build(WordParam wordParam)throws Exception{
		LOGGER.info("准备生成文件。。。。。。");
		Map<String, Object> map = EntityToMapConvert.toMap(wordParam);
		for(Entry<String, Object> set:map.entrySet()) {
			String value = set.getValue().toString().replaceAll("\\r", "").replaceAll("\\n", "\r");
			// 修改后的内容
			map.put(set.getKey(), value);
			LOGGER.info(set.getKey()+"=["+value+"]");
		}
		String fileName = PoiUtil.generateFileName(wordParam);
		String expFile = "/opt/tmp/"+fileName;
		File file = null;
		try {
			LOGGER.info("开始生成绩效文件。。。。");
			InputStream inputStream = PoiController.class.getClassLoader().getResourceAsStream("conf/template.doc");
			PoiUtil.build(inputStream, map, expFile);
			LOGGER.info("文件生成成功["+expFile+"]");
			file = new File(expFile);
			return FileUtil.download(fileName, file);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (file.exists()) {
				LOGGER.info("清除临时文件"+expFile);
				file.delete();
			}
		}
		
		
		LOGGER.info("发生异常");
		return null;
		
	}
	
	
	
}
