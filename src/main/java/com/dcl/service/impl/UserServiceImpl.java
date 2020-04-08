package com.dcl.service.impl;

import com.dcl.dao.UserDao;
import com.dcl.model.User;
import com.dcl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dcl
 * @date 2020/4/9 - 0:55
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User getUserById(Integer id) {

        return  userDao.getUserById(id);
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void update(User user) {

    }
}
