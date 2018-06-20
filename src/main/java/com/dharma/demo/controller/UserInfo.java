package com.dharma.demo.controller;

import com.dharma.demo.model.Publish;
import com.dharma.demo.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/userinfo")
public class UserInfo {

    @Autowired
    PublishService publishService;
    private String username;

    @RequestMapping
    public String userInfo(ModelMap map, HttpSession session){
        this.username = (String)session.getAttribute("username");
        List<Publish> publishes = publishService.getByUsername(this.username);
        map.put("publishes",publishes);
        map.put("username",session.getAttribute("username"));
        return "userinfo";
    }
    @RequestMapping(value = "/del/{id}")
    public String delPublishById(ModelMap map, @PathVariable int id,HttpSession session){
        publishService.delPublish(id);
        List<Publish> publishes = publishService.getByUsername(this.username);
        map.put("publishes",publishes);
        map.put("username",session.getAttribute("username"));
        return "userinfo";
    }
}
