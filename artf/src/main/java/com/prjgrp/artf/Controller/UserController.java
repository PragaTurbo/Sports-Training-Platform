package com.prjgrp.artf.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
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



    @GetMapping("/userdetail")
    public List<User> getuserinfo()
    {
        return uservice.getuserinfo();
    }

    @PostMapping("/adduser")
    public List<User> addusers(@RequestBody List<User> user)
    {
       return uservice.addusers(user);
    }
}
