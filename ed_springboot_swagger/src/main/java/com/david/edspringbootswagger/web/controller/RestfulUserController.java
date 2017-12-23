package com.david.edspringbootswagger.web.controller;

import com.david.edspringbootswagger.core.Result;
import com.david.edspringbootswagger.core.ResultGenerator;
import com.david.edspringbootswagger.model.RestfulUser;
import com.david.edspringbootswagger.service.RestfulUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by David on 2017/12/21.
*/
@RestController
@RequestMapping("/restful/user")
//@EnableSwagger2
public class RestfulUserController {
    @Resource
    private RestfulUserService restfulUserService;

    @PostMapping
    public Result add(@RequestBody RestfulUser restfulUser) {
        restfulUserService.save(restfulUser);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        restfulUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody RestfulUser restfulUser) {
        restfulUserService.update(restfulUser);
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
     */
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        RestfulUser restfulUser = restfulUserService.findById(id);
        return ResultGenerator.genSuccessResult(restfulUser);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RestfulUser> list = restfulUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
