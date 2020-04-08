package com.dcl.dao;

import com.dcl.model.User;

import java.util.List;

/**
 * @author dcl
 * @date 2020/4/7 - 21:30
 */
public interface UserDao {

    void addUser(User user);

    void deleteById(Integer id);

    void update(User user);

    User getUserById(Integer id);

    List<User> getAll();

}
