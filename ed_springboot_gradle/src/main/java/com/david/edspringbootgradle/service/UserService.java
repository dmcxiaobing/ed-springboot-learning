package com.david.edspringbootgradle.service;

import com.david.edspringbootgradle.domain.User;

public interface UserService {

	Object getUserList(int current, int rowCount, String searchPhrase);

	User getCurrentUser();
	
	String getCurrentUsername();
}
