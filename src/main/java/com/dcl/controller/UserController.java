package com.dcl.controller;

import com.dcl.model.User;
import com.dcl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dcl
 * @date 2020/4/9 - 1:37
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUser")
    public String getUser(@RequestParam(value = "id",defaultValue = "1")Integer id, Model model){
        System.out.println("**************************************");
        System.out.println(id);
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "success";
    }
}
