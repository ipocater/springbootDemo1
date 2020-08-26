package com.ipoca.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        Map<Object,String> map, HttpRequest httpRequest){
        if (!StringUtils.isEmpty(password) && !StringUtils.isEmpty(username) && password.equals("123456")){
                return "dashboard";
        } else {
            map.put("msg","登录失败");
            return "login";
        }
    }
}
