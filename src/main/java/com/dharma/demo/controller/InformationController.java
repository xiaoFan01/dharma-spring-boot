package com.dharma.demo.controller;

import com.dharma.demo.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("information")
public class InformationController {

    @Autowired
    PublishService publishService;

    @RequestMapping(value = "/{id}")
    public String getInformationById(ModelMap map, @PathVariable int id){
        map.put("textname",publishService.getPublishById(id).getTextname());
        map.put("text",publishService.getPublishById(id).getText());
        return "information";
    }
}
