package com.dharma.demo.controller;

import com.dharma.demo.dao.JpaPublishPageDao;
import com.dharma.demo.model.Publish;
import com.dharma.demo.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/classes")
public class ClassesController {

    @Autowired
    PublishService publishService;

    @RequestMapping(value = "/{classes}")
    public String getPublish(ModelMap map,@RequestParam(name = "page",defaultValue = "0") int no ,@PathVariable String classes, HttpSession session){
        Integer page = no;
        Integer size = 13;
        Sort sort = new Sort(Sort.Direction.DESC,"idpublish");
        Pageable pageable = new PageRequest(page,size,sort);
        Page<Publish> pages = publishService.getPublishByClasses(pageable,classes);
        List<Publish> lists= pages.getContent();
        map.put("publishes", lists);
        map.put("username",session.getAttribute("username"));
        map.put("totalpages",pages.getTotalPages());
        map.put("totalelements",pages.getTotalElements());
        map.put("number",page);
        return "index1";
    }
//    @RequestMapping(value = "/del/{id}")
//    public String getInformationById(ModelMap map,@PathVariable int id){
//        map.put("textname",publishService.getPublishById(id).getTextname());
//        map.put("text",publishService.getPublishById(id).getText());
//        return "information";
//    }
}
