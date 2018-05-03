package com.myprojects.examples.springhibernate.service;

import com.myprojects.examples.springhibernate.model.User;

import java.util.List;

public interface UserService {

    void save(User user);

    List<User> list();
}
