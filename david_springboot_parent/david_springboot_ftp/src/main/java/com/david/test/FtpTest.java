package com.david.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;
/**
 * 简单的上传文件。并获取地址
 * @author ：david  
 * @新浪微博 ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class FtpTest {

	public static final String FTP_URL = "192.168.1.188";
	public static final int FTP_PORT = 21;

	@Test
	public void testFtpClient() throws Exception {
		// 创建一个FTPClient对象
		FTPClient ftpClient = new FTPClient();

		// 创建FTP连接,端口号可以设定，我的是22，默认是21
		ftpClient.connect(FTP_URL, FTP_PORT);

		// 登录FTP服务器，使用用户名和密码
		ftpClient.login("ftpuser", "centos");

		// 上传文件,读取本地文件..设置路径
		String path = "/Users/david/Desktop/QQ20180318-0.jpg";
//		String path = "D:\\David\\Netbuy\\images\\defaultImgs\\9.jpg";
		FileInputStream inputStream = new FileInputStream(new File(path));

		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);// ************此处是重点要不就服务器的图像就被损坏

		// 设置上传的路径
		String pathname = "/home/ftpuser/www/images";// 这个路径就是FTP服务端存储的路径，可以从FileZilla中获取
		ftpClient.changeWorkingDirectory(pathname);

		// 参数一：服务器端文档名；参数二：上传文档的inputStream
		String remote = "11cui00.jpg";
		ftpClient.storeFile(remote, inputStream);
		System.out.println(FTP_URL+"/images/"+remote);
		// 关闭连接
		ftpClient.logout();

	}

}
