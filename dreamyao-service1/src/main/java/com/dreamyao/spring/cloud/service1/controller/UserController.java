package com.dreamyao.spring.cloud.service1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/10/27
 */
@Controller //声明为一个控制器
public class UserController {

    //处理对"/"的GET请求
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        //视图名为home
        return "home";
    }
}
