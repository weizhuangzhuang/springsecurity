package com.wzz.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description : 测试controller  //描述
 * @Author : zzwei  //作者
 * @Date: 2020-05-18 17:52  //时间
 */

@Controller
public class TestController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "views/login";
    }

    @RequestMapping("/level1/{id}")
    public String level1(@PathVariable("id") Integer id){
        return "views/level1" + id;
    }

    @RequestMapping("/level2/{id}")
    public String level2(@PathVariable("id") Integer id){
        return "views/level2" + id;
    }

    @RequestMapping("/level3/{id}")
    public String level3(@PathVariable("id") Integer id){
        return "views/level3" + id;
    }

}
