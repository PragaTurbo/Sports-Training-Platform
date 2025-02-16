package com.prjgrp.artf.Services;
import com.prjgrp.artf.Entity.User;
import com.prjgrp.artf.Repositories.UserRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService 
{
    
    private final UserRepo urepo;
    @Autowired
    public UserService(UserRepo urepo)
    {
        this.urepo = urepo;
    }



    public List<User> getuserinfo()
    {
        return urepo.findAll();
    }

    public List<User> addusers(List<User> user)
    {
        return urepo.saveAll(user);
    }
    public List<User> updateuser(List<User> user)
    {
        return urepo.saveAll(user);
    }

    public void deluser(int uid)
    {
        urepo.deleteById(uid);
        
    }
    
}
