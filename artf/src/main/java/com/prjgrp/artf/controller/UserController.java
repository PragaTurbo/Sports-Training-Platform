package com.prjgrp.artf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import com.prjgrp.artf.model.User;
import com.prjgrp.artf.service.UserService;





@RestController
@RequestMapping("/user")
public class UserController 
{
    @Autowired
    private final UserService uservice;
    public UserController(UserService uService)
    {
        this.uservice = uService;
    }



    @GetMapping("/getAll")
    public List<User> getuserinfo()
    {
        return uservice.getuserinfo();
    }
    
    @PostMapping("/post")
    public List<User> addusers(@RequestBody List<User> user)
    {
        return uservice.addusers(user);
    }
    
    
    @PutMapping("/put")
    public List<User> updateuser(@RequestBody List<User> user)
    {
        return uservice.updateuser(user);
    }
    
    @DeleteMapping("/deluser/{id}")
    public String deluser(@PathVariable int id)
    {
        uservice.deluser(id);
        return "User with uid: "+id+" is deleted successfully";
    }
    
    @GetMapping("/get/uname/{username}")
    public List<User> getByUname(@PathVariable String username)
    {
        return uservice.getByUname(username);
    }
    
    @GetMapping("/get/lname/{lastName}")
    public List<User> getlastname(@PathVariable String lastName)
    {
        return uservice.getlastname(lastName);
    }
    
    @GetMapping("/sorted")
    public List<User> getsorted()
    {
        return uservice.getsorted();
    }


    @GetMapping("/pagination")
    public Page<User> getpage(@RequestParam int page, int size)
    {
        return uservice.getPage(page, size);
    }

}
