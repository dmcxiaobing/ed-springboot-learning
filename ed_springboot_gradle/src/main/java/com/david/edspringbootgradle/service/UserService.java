package com.david.edspringbootgradle.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.david.edspringbootgradle.domain.User;
import com.david.edspringbootgradle.domain.UserCreateForm;

public interface UserService {

	Object getUserList(int current, int rowCount, String searchPhrase);

	User getCurrentUser();
	
	String getCurrentUsername();

	User getUserByUsername(String username);

	User findUserById(Long id);

	Object uploadImage(MultipartFile file, HttpServletRequest request);

	void create(UserCreateForm form);
}
