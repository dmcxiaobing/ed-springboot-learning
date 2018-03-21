package com.david.web.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 上传文件
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Controller
public class UploadController {

	private static String UPLOAD_FOLDER = "D://assets//";

	/**
	 * 转发到上传文件的界面
	 */
	@GetMapping("/")
	public String index() {
		return "upload";
	}

	/**
	 * 上传文件
	 */
	@PostMapping("/upload")
	public String singleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
		if (file.isEmpty()) {
			// 没有选择，直接上传
			redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
			return "redirect:uploadStatus";
		}
		try {
			// 将文件保存到指定目录下
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOAD_FOLDER+file.getOriginalFilename()+"");
			Files.write(path, bytes);
			redirectAttributes.addFlashAttribute("message","upload success:"+file.getOriginalFilename());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:uploadStatus";
	}

	/**
	 * 转发到上传结果页面
	 */
	@GetMapping("/uploadStatus")
	public String uploadStatus() {
		return "uploadStatus";
	}

}
