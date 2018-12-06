package com.david.web.controller;

import com.david.entity.User;
import com.david.utils.JwtUtil;
import com.david.utils.ResponseData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author ：David
 * @weibo ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
/**
 * 简单测试jwt
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping("/login")
    @ResponseBody
    public ResponseData login(@RequestParam String username, @RequestParam String password) {
        if ("david".equals(username) && "123456".equals(password)) {
            ResponseData responseData = ResponseData.ok();
            User user = new User();
            user.setId(1);
            user.setUsername(username);
            user.setPassword(password);
            responseData.putDataValue("user", user);
//            String token = JwtUtil.sign(user, 30L * 24L * 3600L * 1000L);
            String token = JwtUtil.sign(user, 10000);
            if (token != null) {
                responseData.putDataValue("token", token);
            }
            return responseData;
        }
        return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "用户名或者密码错误" });
    }

    @GetMapping("/getUser")
    @ResponseBody
    public ResponseData getUser(@RequestParam String token) {
        User user = JwtUtil.unsign(token, User.class);
        if (user != null) {
            return ResponseData.ok().putDataValue("user", user);
        }
        return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "token不合法" });
    }

}
