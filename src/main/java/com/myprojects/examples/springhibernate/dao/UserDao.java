package com.myprojects.examples.springhibernate.dao;

import com.myprojects.examples.springhibernate.model.User;

import java.util.List;

public interface UserDao {

    void save(User user);
    List<User> list();
}
