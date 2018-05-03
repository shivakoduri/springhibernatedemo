package com.myprojects.examples.springhibernate.dao;

import com.myprojects.examples.springhibernate.model.User;

public interface UserDetailsDao {

    User findUserByUsername(String username);
}
