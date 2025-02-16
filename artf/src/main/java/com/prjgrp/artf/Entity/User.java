package com.prjgrp.artf.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class User 
{
    @Id
    public int userId;
    public String username;
    public String usermail;
    public String userpass;
    

    public User(int userId) {
        this.userId = userId;
    }

    public User(int userId, String username, String usermail, String userpass) {
        this.userId = userId;
        this.username = username;
        this.usermail = usermail;
        this.userpass = userpass;
        
    }

    public User() {
    }
    
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsermail() {
        return usermail;
    }
    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }
    public String getUserpass() {
        return userpass;
    }
    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }
     
    


    
}
