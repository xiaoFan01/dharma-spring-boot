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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Id;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/publish")
public class PublishController {

    @Autowired
    PublishService publishService;
    @Autowired
    Publish publish;

    @RequestMapping
    public String dopublish(ModelMap map){
        return "publish";
    }
    @RequestMapping("/index")
    public String publish(ModelMap map){
        Integer page = 0;
        Integer size = 13;
        Sort sort = new Sort(Sort.Direction.DESC,"idpublish");
        Pageable pageable = new PageRequest(page, size,sort);
        Page<Publish> pages = publishService.getPublishAll(pageable);
        List<Publish> lists= pages.getContent();
        map.put("publishes", lists);
        return "index1";
    }
    @RequestMapping("/dopublish")
    public String  addpublished(ModelMap map,@RequestParam String textname, @RequestParam String text,@RequestParam(name = "r1") String classes, HttpSession session) {
        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        publish.setUsername((String) session.getAttribute("username"));
        publish.setTextname(textname);
        publish.setText(text);
        publish.setDate(date1);
        publish.setClasses(classes);
        publish.setClickrate(0);
        publish.setCommentnum(0);
        publishService.addPublished(publish);
        //List<Publish> publishes = publishService.getPublishs();
        //map.put("publishes",publishes);
        Integer page = 0;
        Integer size = 13;
        Sort sort = new Sort(Sort.Direction.DESC,"idpublish");
        Pageable pageable = new PageRequest(page, size,sort);
        Page<Publish> pages = publishService.getPublishAll(pageable);
          List<Publish> lists= pages.getContent();
        map.put("publishes", lists);
        return "index1";
    }
}
