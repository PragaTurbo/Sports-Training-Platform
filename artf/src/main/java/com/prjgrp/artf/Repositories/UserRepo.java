package com.prjgrp.artf.Repositories;
import com.prjgrp.artf.Entity.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> 
{
    // public List<User> getByUname(String username);
    
}
