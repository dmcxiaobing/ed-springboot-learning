package com.david.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.david.dao.UserDao;
import com.david.model.User;
@RestController
public class UserController {
	@Resource
    private UserDao userDao;
 
	@RequestMapping("/add")
    public User add(User user) {
    	userDao.saveUser(user);
        return user;
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam Long id) {
    	userDao.deleteUserById(id);
        return "ok";
    }

    @RequestMapping("/update")
    public String update(User user) {
    	userDao.updateUser(user);
        return "ok";
    }
}
