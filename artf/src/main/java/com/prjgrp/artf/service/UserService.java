package com.prjgrp.artf.service;
import com.prjgrp.artf.model.User;
import com.prjgrp.artf.repository.UserRepo;

import java.util.List;
import org.springframework.data.domain.Pageable;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



@Service
public class UserService 
{
    
    @Autowired
    private final UserRepo urepo;
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

    public void deluser(int id)
    {
        urepo.deleteById(id);
        
    }
    public List<User> getByUname(String username)
    {
        return urepo.findByUsername(username);
    }
    

    public List<User> getlastname(String lastName)
    {
        return urepo.findByLastName(lastName);
    }




    public List<User> getsorted()
    {
        return urepo.findAll(Sort.by(Sort.Direction.ASC, "firstName"));
    }

    public Page<User> getPage(int page,int size)
    {
        Pageable pageable = PageRequest.of(page,size);
        return urepo.findAll(pageable);
    }


}
