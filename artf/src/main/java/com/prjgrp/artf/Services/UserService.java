package com.prjgrp.artf.Services;
import com.prjgrp.artf.Entity.User;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class UserService 
{
    public List<User> getuserinfo()
    {
        return List.of(
           new User(1, "Carl", "carl@gmail.com", "carl@123")
        );
    }

    
}
