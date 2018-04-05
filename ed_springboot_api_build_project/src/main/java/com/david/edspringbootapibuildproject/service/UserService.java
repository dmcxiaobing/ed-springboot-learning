package com.david.edspringbootapibuildproject.service;
import com.david.edspringbootapibuildproject.model.User;
import com.david.edspringbootapibuildproject.core.Service;


/**
 * Created by David on 2017/12/20.
 */
public interface UserService extends Service<User> {

	User findUserByUsernamePassword(String username, String password);

}
