package com.ysu2013.web;

import com.ysu2013.config.Result;
import com.ysu2013.entity.Colleague;
import com.ysu2013.service.LoginService;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private LoginService loginService;

    @GetMapping(value={"/","/login","/index"})
    public String login(){
        return "login";
    }

    @PostMapping("/validName")
    @ResponseBody
    public Result<Colleague>  validName(@RequestParam("name") String name){
        Result<Colleague> result = new Result<>();
        try{
            if(StringUtils.isEmpty(name) || StringUtils.isBlank(name)){
                result.setCode(Result.Code.PARAMETERROR);
            }else
            if(this.loginService.validName(name)){
                result.setCode(Result.Code.SUCCESS);
            }else{
                result.setCode(Result.Code.NOSUCHCOLLEAGUE);
            }
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(Result.Code.SYSTEMERROR);
        }

        return result;
    }

}
