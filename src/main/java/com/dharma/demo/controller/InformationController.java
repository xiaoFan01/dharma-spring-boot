package com.dharma.demo.controller;

import com.dharma.demo.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("information")
public class InformationController {

    @Autowired
    PublishService publishService;

    @RequestMapping(value = "/{id}")
    public String getInformationById(ModelMap map, @PathVariable int id, HttpSession session){
        map.put("textname",publishService.getPublishById(id).getTextname());
        map.put("text",publishService.getPublishById(id).getText());
        map.put("username",session.getAttribute("username"));
        return "information";
    }
    @RequestMapping(value = "/02/{id}")
    public String getInformationById02(ModelMap map, @PathVariable int id, HttpSession session){
        map.put("textname",publishService.getPublishById(id).getTextname());
        map.put("text",publishService.getPublishById(id).getText());
        map.put("username",session.getAttribute("username"));
        return "information02";
    }
}
