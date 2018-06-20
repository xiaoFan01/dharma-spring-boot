package com.dharma.demo.dao;

import com.dharma.demo.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface JpaLoginDao extends CrudRepository<Login,Integer> {
    Login findByUsernameAndPassword(String username,String password);
    Login findByUsername(String name);
    Login findByPhone(String phone);
}
