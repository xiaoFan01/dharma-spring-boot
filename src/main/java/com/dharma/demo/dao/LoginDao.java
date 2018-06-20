package com.dharma.demo.dao;

import com.dharma.demo.model.Login;

public interface LoginDao {
    int insert(Login login);

    int deleteById(int id);

    int updateById(Login login);

    Login getById(int id);

    Login getByName(String name);
}
