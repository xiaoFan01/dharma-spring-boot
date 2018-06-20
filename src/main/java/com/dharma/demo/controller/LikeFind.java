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
@RequestMapping("/likefind")
public class LikeFind {

    @Autowired
    PublishService publishService;

    @RequestMapping
    public String likeFind(ModelMap map, @RequestParam(name = "page",defaultValue = "0") int no,@RequestParam(name = "findlikename") String name, HttpSession session){
        Integer page = no;
        Integer size = 13;
        Sort sort = new Sort(Sort.Direction.DESC,"idpublish");
        Pageable pageable = new PageRequest(page,size,sort);
        Page<Publish> publishes = publishService.getByNameLike(pageable,"%"+name+"%");
        List<Publish> lists= publishes.getContent();
        map.put("publishes",lists);
        map.put("username",session.getAttribute("username"));
        map.put("totalpages",publishes.getTotalPages());
        map.put("totalelements",publishes.getTotalElements());
        map.put("number",page);
        return "index1";
    }
}
