package com.prjgrp.artf.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prjgrp.artf.model.User;
import java.util.List;


@Repository
public interface UserRepo extends JpaRepository<User,Integer> 
{
    List<User> findByUsername(String username);
     

    @Query("select e from User e where e.lastName = :lastName")
    List<User> findByLastName(String lastName);
}
