package com.prjgrp.artf.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin 
{
    @Id
    private long adminId;
    private String adminName;
    private String adminMail;
    private String adminPass;
    private String adminaccess;

    public Admin() 
    {
    }

    public Admin(long adminId) {
        this.adminId = adminId;
    }

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminMail() {
        return adminMail;
    }

    public void setAdminMail(String adminMail) {
        this.adminMail = adminMail;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public String getAdminaccess() {
        return adminaccess;
    }

    public void setAdminaccess(String adminaccess) {
        this.adminaccess = adminaccess;
    }

    

    

    
}
