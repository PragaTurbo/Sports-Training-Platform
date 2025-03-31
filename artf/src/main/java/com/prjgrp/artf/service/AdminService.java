package com.prjgrp.artf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prjgrp.artf.model.Admin;
import com.prjgrp.artf.repository.AdminRepo;

@Service
public class AdminService 
{

    @Autowired
    private final AdminRepo aRepo;
    public AdminService(AdminRepo aRepo)
    {
        this.aRepo = aRepo;
    }


    public List<Admin> getalladmin()
    {
        return aRepo.findAll();
    }


    public List<Admin> addAdmins(List<Admin> admins)
    {
        return aRepo.saveAll(admins);
    }

    public List<Admin> updateadmin(List<Admin> admin)
    {
        return aRepo.saveAll(admin);
    }

    public void delAdmin(Long adminId)
    {
        aRepo.deleteById(adminId);
    }

    public List<Admin> getbyid(Long adminId)
    {
        return aRepo.findByAdminId(adminId);
    }

    public List<Admin> getbyaccess(String adminaccess)
    {
        return aRepo.findByAdminaccess(adminaccess);
    }
}
