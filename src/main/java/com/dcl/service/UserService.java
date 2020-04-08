package com.dcl.service;

import com.dcl.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dcl
 * @date 2020/4/9 - 0:40
 */

public interface UserService {
    public User getUserById(Integer id);

    public List<User> getAll();

    public void add(User user);

    public void deleteById(Integer id);

    public void update(User user);


}
