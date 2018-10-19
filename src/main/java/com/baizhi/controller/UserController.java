package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jia on 2018/10/16.
 */
@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/selectAll")
    public @ResponseBody
    List<User> selectAll() {
        System.out.println("123123123");
        return service.selectAll();
    }
}
