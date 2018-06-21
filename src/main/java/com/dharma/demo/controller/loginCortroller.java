package com.dharma.demo.controller;

import com.dharma.demo.dao.JpaPublishPageDao;
import com.dharma.demo.model.Login;
import com.dharma.demo.model.Publish;
import com.dharma.demo.service.LoginServie;
import com.dharma.demo.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/login")

public class loginCortroller {

    @Autowired
    JpaPublishPageDao jpaPublishPageDao;
    @Autowired
    LoginServie loginServie;
    @Autowired
    PublishService publishService;

    @RequestMapping
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/log_in")
    public String log_in(ModelMap map, @RequestParam(name = "page",defaultValue = "0") int no,@RequestParam("username") String name, @RequestParam("password") String password, HttpSession session){
        if (loginServie.getLoginByName(name).getPassword().equals(password)){
            session.setAttribute("username",name);
            Integer page = no;
            Integer size = 13;
            Sort sort = new Sort(Sort.Direction.DESC,"idpublish");
            Pageable pageable = new PageRequest(page, size,sort);
            Page<Publish> pages = publishService.getPublishAll(pageable);
            List<Publish> lists= pages.getContent();
            map.put("publishes", lists);
            map.put("username",session.getAttribute("username"));
            map.put("totalpages",pages.getTotalPages());
            map.put("totalelements",pages.getTotalElements());
            map.put("number",page);
            if (name.equals("admin"))
                return "admin";
            return "index1";
        }
        else{
            map.put("err","您的用户名或密码有误，请重新输入");
            return "login";
        }
    }


    @ResponseBody
    @RequestMapping(value = "/get/id/{id}",method = RequestMethod.GET)
    public Login get(@PathVariable Integer id){
        return loginServie.getLoginById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/get/name/{username}/password/{password}" ,method = RequestMethod.GET)
    public Login get(@PathVariable String username,@PathVariable String password){
        return loginServie.getLoginByNameAndByPassword(username,password);
    }

}
