package com.dcl;

import com.dcl.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dcl
 * @date 2020/4/8 - 23:32
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class test {
    @Autowired
    private UserDao userDao;
    @Test
    public void test01(){
        System.out.println(userDao.getClass());
        System.out.println(userDao.getUserById(1));
    }
}
