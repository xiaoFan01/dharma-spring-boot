package com.dharma.demo.controller;


import com.dharma.demo.model.Login;
import com.dharma.demo.service.LoginServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/regist")
public class RegisterController {

    @Autowired
    Login login;
    @Autowired
    LoginServie loginServie;

    @RequestMapping
    public String register(){
        return "regist";
    }

    @RequestMapping(value = "/register")
    public String register(ModelMap map, @RequestParam("username") String name, @RequestParam("password") String password, @RequestParam("phone") String phone){
        if (!loginServie.getLoginByName(name).getUsername().equals("-1"))
        {
            map.put("err","该用户名已存在,请重新输入");
            return "regist";
        }
        else if (!loginServie.getLoginByPhone(phone).getPhone().equals("-1")){
            map.put("err","该手机号已注册,请重新输入");
            return "regist";
        }
        login.setUsername(name);
        login.setPassword(password);
        login.setPhone(phone);
        loginServie.addUser(login);
        return "login";
    }
}
