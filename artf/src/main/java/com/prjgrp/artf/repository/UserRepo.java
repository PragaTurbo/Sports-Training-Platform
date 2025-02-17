package com.prjgrp.artf.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prjgrp.artf.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> 
{
    // public List<User> getByUname(String username);
    
}
