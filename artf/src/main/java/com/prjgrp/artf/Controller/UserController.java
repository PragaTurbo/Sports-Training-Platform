package com.prjgrp.artf.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.prjgrp.artf.Entity.User;
import com.prjgrp.artf.Services.UserService;

@RestController
public class UserController 
{
    private final UserService uservice;
    @Autowired
    public UserController(UserService uService)
    {
        this.uservice = uService;
    }



    @GetMapping("/user")
    public List<User> getuserinfo()
    {
        return uservice.getuserinfo();
    }
    
}
