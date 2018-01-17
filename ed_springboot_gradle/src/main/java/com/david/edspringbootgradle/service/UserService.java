package com.david.edspringbootgradle.service;

import com.david.edspringbootgradle.domain.User;

public interface UserService {

	Iterable<User> findAll();

}
