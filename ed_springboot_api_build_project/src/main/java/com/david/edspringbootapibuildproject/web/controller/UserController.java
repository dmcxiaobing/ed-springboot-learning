package com.david.edspringbootapibuildproject.web.controller;
import com.david.edspringbootapibuildproject.core.Result;
import com.david.edspringbootapibuildproject.core.ResultGenerator;
import com.david.edspringbootapibuildproject.model.User;
import com.david.edspringbootapibuildproject.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by David on 2017/12/20.
*/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
 
    @PostMapping("/add")
    public Result add(User user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }
    /**
     * 
	    {
		    "code": 200,
		    "data": {
		        "age": 30,
		        "uid": 1,
		        "username": "david"
		    },
		    "message": "SUCCESS"
		}
     * @param id
     * @return
     */
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    /**
     * http://localhost:8080/user/list?page=1&size=1
     * @param page 当前页 从第1页开始
     * @param size 每页显示数量 默认 查所有
			{
			    "code": 200,
			    "data": {
			        "endRow": 12,
			        "firstPage": 0,
			        "hasNextPage": false,
			        "hasPreviousPage": false,
			        "isFirstPage": false,
			        "isLastPage": true,
			        "lastPage": 0,
			        "list": [
			            {
			                "age": 30,
			                "uid": 1,
			                "username": "david"
			            },
			            {
			                "age": 22,
			                "uid": 67,
			                "username": "xiaobing"
			            }
			        ],
			        "navigateFirstPage": 0,
			        "navigateLastPage": 0,
			        "navigatePages": 8,
			        "navigatepageNums": [],
			        "nextPage": 0,
			        "orderBy": "",
			        "pageNum": 0,
			        "pageSize": 0,
			        "pages": 0,
			        "prePage": 0,
			        "size": 12,
			        "startRow": 1,
			        "total": 12
			    },
			    "message": "SUCCESS"
			}
     * 
     * 
     */
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
