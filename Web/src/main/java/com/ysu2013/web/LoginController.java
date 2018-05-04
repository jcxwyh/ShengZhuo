package com.ysu2013.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author AaronJiang
 * @version 1.0
 * @date 2018/02/27
 * @mail 1327994105@qq.com
 * @description LoginController
 */

@Controller
@RequestMapping
public class LoginController {

    @GetMapping(value={"/","/login","/index"})
    public String login(){
        return "login";
    }


}
