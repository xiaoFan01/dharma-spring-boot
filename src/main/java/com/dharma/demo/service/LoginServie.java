package com.dharma.demo.service;


import com.dharma.demo.dao.JpaLoginDao;
import com.dharma.demo.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginServie {
    @Autowired
    private JpaLoginDao loginDao;

    @Transactional
    public Login getLoginById(Integer id){
        return loginDao.findById(id).orElse(new Login("null","-1","-1"));
    }

    @Transactional
    public boolean addUser(Login login){
        return loginDao.save(login)!=null;
    }

    public Login getLoginByName(String name)
    {
        if (loginDao.findByUsername(name)==null)
            return new Login("-1","-1","-1");
        return loginDao.findByUsername(name);
    }

    public Login getLoginByPhone(String phone){
        if (loginDao.findByPhone(phone)==null)
            return new Login("-1","-1","-1");
        return loginDao.findByPhone(phone);
    }

    public Login getLoginByNameAndByPassword(String name,String password){
        return loginDao.findByUsernameAndPassword(name,password);
    }




}
