package com.david.edspringbootgradle.service.impl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.david.edspringbootgradle.domain.Authority;
import com.david.edspringbootgradle.domain.User;
import com.david.edspringbootgradle.domain.UserCreateForm;
import com.david.edspringbootgradle.repository.AuthorityRepository;
import com.david.edspringbootgradle.repository.UserRepository;
import com.david.edspringbootgradle.service.UserService;
import com.david.edspringbootgradle.utils.BCryptUtil;

/**
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Service
public class UserServiceImpl implements UserService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AuthorityRepository authorityRepository;

	@Autowired
	private Environment environment;

	/**
	 * 获取所有用户
	 */
	@Override
	public Object getUserList(int current, int rowCount, String searchPhrase) {
		HashMap<String, Object>  ret = new HashMap<String,Object>();
		List<Object> pList = new ArrayList<>();
		// 获取到所有用户数量
		Long total = userRepository.count();
		int i = 0;
		System.out.println("current:"+current+"::::"+rowCount);
		Pageable pageable =new PageRequest(current, rowCount);
		// PageRequest 开始和每页记录数
		Page<User> users = userRepository.findAll(pageable);
		for (User user : users) {
			HashMap<String, Object> data = new HashMap<String, Object>();
			data.put("id", user.getId());
			data.put("username", user.getUsername());
			data.put("image", user.getImage());
			if (user.getEnabled() == 1) {
				data.put("enabled", "<font color='green'>启用</font>");
			} else {
				data.put("enabled", "<font color='red'>禁用</font>");
			}
			/**
			 * 查询权限
			 */
			List<Authority> authorities = authorityRepository.findByUsername(user.getUsername());
			ArrayList<String> arrayList = new ArrayList<String>();
			for (Authority authority : authorities) {
				if (authority.getAuthority().equals("ROLE_ADMIN")) {
					arrayList.add("管理员");
				} else if (authority.getAuthority().equals("ROLE_USER")) {
					arrayList.add("用户");
				}
			}
			data.put("role", arrayList.toString());
			pList.add(data);
			i++;
		}
		ret.put("current", 1);
		// 用户数量
		ret.put("rowCount", i);
		// 数据
		ret.put("rows", pList);
		// 数量
		ret.put("total", total);
		System.out.println(ret.toString());
		return ret;
	}

	
	
	public void testPageQuery() throws Exception {
	    int page=1,size=10;
	    Sort sort = new Sort(Direction.DESC, "id");
	    Pageable pageable = new PageRequest(page, size, sort);
//	    userRepository.findALL(pageable);
//	    userRepository.findByUserName("testName", pageable);
	}
	
	/**
	 * 获取当前用户
	 */
	@Override
	public User getCurrentUser() {
		return userRepository.findByUsername(getCurrentUsername());
	}

	/**
	 * 获取当前登陆的用户名称
	 */
	@Override
	public String getCurrentUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = authentication.getName();
		return username;
	}


	/**
	 * 根据用户名查找用户
	 */
	@Override
	public User getUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}


	/**
	 * 根据id查找用户
	 */
	@Override
	public User findUserById(Long id) {
		return userRepository.findOne(id);
	}


	/**
	 * 上传用户头像
	 */
	@Override
	public Object uploadImage(MultipartFile file, HttpServletRequest request) {
		User user = getCurrentUser();
		HashMap<String, Object> result = new HashMap<>();
		if (file!=null) {
			if (!file.isEmpty()) {
				try {
					byte[] bytes = file.getBytes();
					// 当前app根目录
					String rootPath = request.getServletContext().getRealPath("/");
					// 需要上传的相对地址。从application.properties中获取.。。实际值为static/upload/
					String relativePath = environment.getProperty("image.file.upload.dir");
					// 判断文件夹是否存在，如果不存在，则创建..
					File dir = new java.io.File(rootPath+java.io.File.separator+relativePath);
					if (!dir.exists()) {
						dir.mkdir();
					}
					// 返回文件后缀名，如果有的话.
					String fileExtension = getFileExtension(file);
					// 生成UUID样式的文件名.
					String uuidFilename = UUID.randomUUID().toString()+"."+fileExtension;
					// 拼接带有文件路径的文件。
					String fullFilename = dir.getAbsolutePath()+File.separator+uuidFilename;
					// 用户头像被访问路径
					String relativeFile = relativePath+File.separator+uuidFilename;
					// 将文件图片保存到磁盘上。
					File serverFile = new File(fullFilename);
					BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
					stream.write(bytes);
					stream.close();
					LOGGER.info("Server File Location = " + serverFile.getAbsolutePath());
					// 协议。端口号等信息拼接。
					String serverPath = new URL(request.getScheme(), request.getServerName(), request.getServerPort(),
							request.getContextPath()).toString();
					result.put("url", serverPath + "/" + relativeFile);
					// 存放访问路径
					user.setImage(relativeFile);
					userRepository.save(user);
				} catch (Exception e) {
					LOGGER.info("error: {}", e);
					result.put("url", "none");
				}
			}
		}
		return null;
	}


	/**
	 * 返回文件后缀名，如果有的话
	 */
	private String getFileExtension(MultipartFile file) {
		if (file == null) {
			return null;
		}

		String name = file.getOriginalFilename();
		int extIndex = name.lastIndexOf(".");

		if (extIndex == -1) {
			return "";
		} else {
			return name.substring(extIndex + 1);
		}
	}


	/**
	 * 创建用户
	 */
	@Override
	public void create(UserCreateForm form) {
		// 将表单信息设置到用户对象中。
		User user = new User();
		user.setUsername(form.getUsername());
		user.setPassword(BCryptUtil.encodeBCrypt(form.getPassword()));
		user.setEnabled(1);
		// 设置权限
		Authority authority = new Authority();
		authority.setUsername(form.getUsername());
		authority.setAuthority("ROLE_USER");
		userRepository.save(user);
		authorityRepository.save(authority);
	}

}
