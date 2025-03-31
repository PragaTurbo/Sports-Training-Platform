package com.prjgrp.artf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.prjgrp.artf.model.Admin;
import com.prjgrp.artf.service.AdminService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;






@RestController
@RequestMapping("/admin")
public class AdminController 
{

    @Autowired
    private final AdminService aService;
    public AdminController(AdminService aService)
    {
        this.aService = aService;
    }

    @GetMapping("/getAll")
    public List<Admin> getadmindetail()
    {
        return aService.getalladmin();
    }
    
    @PostMapping("/post")
    public List<Admin> addAdmins(@RequestBody List<Admin> admin)
    {
        
        return aService.addAdmins(admin);
    }

    @PutMapping("/put")
    public List<Admin> putMethodName(@RequestBody List<Admin> admin) 
    {
        return aService.updateadmin(admin);
    }


    @DeleteMapping("/del/{adminId}")
    public String delAdmin(@PathVariable Long adminId)
    {
        aService.delAdmin(adminId);
        return "Admin ID : "+ adminId+" deleted successfully.";
    }
    

    @GetMapping("/get/id/{adminId}")
    public List<Admin> getByid(@PathVariable Long adminId)
    {
        return aService.getbyid(adminId);
    }

    @GetMapping("/get/access/{adminaccess}")
    public List<Admin> getbyaccess(@PathVariable String adminaccess)
    {
        return aService.getbyaccess(adminaccess);
    }


    
}
