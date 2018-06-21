package com.dharma.demo.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class AdiminController {

    @Autowired
    PublishService publishService;

    @RequestMapping
    public String getAllPublishById(ModelMap map, @RequestParam(name = "page",defaultValue = "0") int no,HttpSession session){
        Integer page = no;
        Integer size = 13;
        Sort sort = new Sort(Sort.Direction.DESC,"idpublish");
        Pageable pageable = new PageRequest(page,size,sort);
        Page<Publish> pages = publishService.getPublishAll(pageable);
        List<Publish> lists= pages.getContent();
        map.put("publishes",lists);
        map.put("username",session.getAttribute("username"));
        map.put("totalpages",pages.getTotalPages());
        map.put("totalelements",pages.getTotalElements());
        map.put("number",page);
        return "admin";
    }
    @RequestMapping(value = "/del/{id}")
    public String delPublishById(ModelMap map,@PathVariable int id,HttpSession session){
        publishService.delPublish(id);
        Integer page = 0;
        Integer size = 13;
        Sort sort = new Sort(Sort.Direction.DESC,"idpublish");
        Pageable pageable = new PageRequest(page,size,sort);
        Page<Publish> pages = publishService.getPublishAll(pageable);
        List<Publish> lists= pages.getContent();
        map.put("publishes",lists);
        map.put("username",session.getAttribute("username"));
        map.put("totalpages",pages.getTotalPages());
        map.put("totalelements",pages.getTotalElements());
        map.put("number",page);
        return "admin";
    }
}
