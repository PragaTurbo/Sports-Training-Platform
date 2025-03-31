package com.prjgrp.artf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prjgrp.artf.model.Admin;

public interface AdminRepo extends JpaRepository<Admin,Long>
{

    List<Admin> findByAdminId(long adminId);


    @Query("select e from Admin e where e.adminaccess = :adminaccess")
    List<Admin> findByAdminaccess(String adminaccess);
    
}
