package com.david.edspringbootswagger.web.controller;
import com.david.edspringbootswagger.core.Result;
import com.david.edspringbootswagger.core.ResultGenerator;
import com.david.edspringbootswagger.model.User;
import com.david.edspringbootswagger.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;

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
// 使用swagger的API
@Api("userController相关api")
public class UserController {
    @Resource
    private UserService userService;
 
    /**
     * 
	{
	    "code": 500,
	    "message": "接口 [/user/add] 内部错误，请联系管理员"
	}
	
	{
	    "code": 200,
	    "data": null,
	    "message": "SUCCESS"
	}
	
     */
    @ApiOperation("添加一个用户")
    @PostMapping("/add")
    public Result add(User user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }
    @ApiOperation("根据ID删除用户")
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }
    @ApiOperation("更新用户")
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
		
		{
		    "code": 500,
		    "message": "接口 [/user/detail] 内部错误，请联系管理员"
		}
     */
    @ApiOperation("查看用户详情")
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        User user = userService.findById(id);
        // 故意搞一个异常
     //   int num = 100/0;
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
    @ApiOperation("查询所有用户")
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        /**
         *     //当前页
			    private int pageNum;
			    //每页的数量
			    private int pageSize;
			    //当前页的数量
			    private int size;
			    //排序
			    private String orderBy;
			
			    //由于startRow和endRow不常用，这里说个具体的用法
			    //可以在页面中"显示startRow到endRow 共size条数据"
			
			    //当前页面第一个元素在数据库中的行号
			    private int startRow;
			    //当前页面最后一个元素在数据库中的行号
			    private int endRow;
			    //总记录数
			    private long total;
			    //总页数
			    private int pages;
			    //结果集
			    private List<T> list;
			
			    //前一页
			    private int prePage;
			    //下一页
			    private int nextPage;
			
			    //是否为第一页
			    private boolean isFirstPage = false;
			    //是否为最后一页
			    private boolean isLastPage = false;
			    //是否有前一页
			    private boolean hasPreviousPage = false;
			    //是否有下一页
			    private boolean hasNextPage = false;
			    //导航页码数
			    private int navigatePages;
			    //所有导航页号
			    private int[] navigatepageNums;
			    //导航条上的第一页
			    private int navigateFirstPage;
			    //导航条上的最后一页
			    private int navigateLastPage;
         */
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
