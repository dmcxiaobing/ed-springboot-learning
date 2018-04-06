package com.david.web.controller;

import static org.junit.Assume.assumeNotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.david.test.*;
import com.david.utils.CommonUtil;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 一个简单的上传，然后返回上传后得到的图片地址
 * 
 * @author ：david
 * @新浪微博 ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
public class FtpUploadImageController {
	
	@RequestMapping("/uploadImage")
	public String testFtp1(@RequestParam("file") MultipartFile fileForm) throws Exception {
		// 处理表单上传的文件。
		if (fileForm.isEmpty()) {
			return "没有上传图片。";
		}
		// 将文件保存到指定目录下...这里将图片。保存到桌面
		byte[] bytes = fileForm.getBytes();
		Path pathDesktop = Paths.get("/Users/david/Desktop/"+fileForm.getOriginalFilename()+"");
		System.out.println("/Users/david/Desktop/"+fileForm.getOriginalFilename()+"");
		Files.write(pathDesktop, bytes);
		// 创建客户端对象，将文件上传到服务器中
		FTPClient ftp = new FTPClient();
		InputStream local = null;
		try {
			// 创建FTP连接,端口号可以设定，我的是22，默认是21
			ftp.connect(FtpTest.FTP_URL, FtpTest.FTP_PORT);

			// 登录FTP服务器，使用用户名和密码
			ftp.login("ftpuser", "centos");

			// 上传文件,读取本地文件..设置路径
			String path = "/Users/david/Desktop/";
			//设置上传路径
            String basePath="/home/ftpuser/www/images/";
            // 根据日期生成层及目录
            Date currentDate = new Date();
            String dateStr=new SimpleDateFormat("yyyy/MM/dd").format(currentDate);
            for(String pathStr:dateStr.split("/")){
                basePath+=pathStr+"/";
                boolean flag = ftp.changeWorkingDirectory(basePath);
                if(!flag){
                    //创建上传的路径  该方法只能创建一级目录，在这里如果/home/ftpuser/www/images/存在则可创建image
                    ftp.makeDirectory(basePath);
                }
            }
            //指定上传路径
            ftp.changeWorkingDirectory(basePath);
            System.out.println("basePath:"+basePath);
			// 指定上传文件的类型 二进制文件
			ftp.setFileType(FTP.BINARY_FILE_TYPE);
			// 读取本地文件
			File file = new File(path+fileForm.getOriginalFilename()+"");
			local = new FileInputStream(file);
			// 第一个参数是文件名..这里给它自定义生成一个名字
//			ftp.storeFile(file.getName(), local);
			String UUID_FileName = CommonUtil.getFileName(file.getName());
			ftp.storeFile(UUID_FileName, local);
			// 获取图片地址http://192.168.1.188/images/2018/04/06/73153916-2a56-47bb-ad7a-43cdb1b147f8.png
			System.out.println(FtpTest.FTP_URL+basePath.substring(17)+UUID_FileName);
			// 已经上传成功了。所以这里可以删除。
			// 从桌面删除此文件。
			Files.deleteIfExists(pathDesktop);
			return "上传成功。图片地址是："+FtpTest.FTP_URL+basePath.substring(17)+UUID_FileName;
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭文件流
				local.close();
				// 退出
				ftp.logout();
				// 断开连接
				ftp.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		String base = "/home/ftpuser/www/images/2018/04/06/";
		// 截取内容。只要/images/2018/04/06/"..只要17位之后的
		base = base.substring(17);
		System.out.println(base);
	}
}
