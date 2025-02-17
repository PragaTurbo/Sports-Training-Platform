package com.prjgrp.artf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

import com.prjgrp.artf.model.User;
import com.prjgrp.artf.service.UserService;



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

    // @GetMapping("/get/uname/{username}")
    // public List<User> getByUname(@PathVariable String username)
    // {
    //     return uservice.getByUname(username);

    // }

    @PostMapping("/adduser")
    public List<User> addusers(@RequestBody List<User> user)
    {
       return uservice.addusers(user);
    }


    @PutMapping("/updateuser")
    public List<User> updateuser(@RequestBody List<User> user)
    {
        return uservice.updateuser(user);
    }

    @DeleteMapping("/deluser/{uid}")
    public String deluser(@PathVariable int uid)
    {
        uservice.deluser(uid);
        return "User with uid: "+uid+" is deleted successfully";
    }
    
}
