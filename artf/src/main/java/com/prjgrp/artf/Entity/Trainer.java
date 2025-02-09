package com.prjgrp.artf.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class Trainer 
{
    @Id
    public int coachId;
    public String coachname;
    public String coachmail;
    public String specialisedsport;
    public Trainer() {
    }
    public Trainer(int coachId, String coachname, String coachmail, String specialisedsport) {
        this.coachId = coachId;
        this.coachname = coachname;
        this.coachmail = coachmail;
        this.specialisedsport = specialisedsport;
    }
    public int getCoachId() {
        return coachId;
    }
    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }
    public String getCoachname() {
        return coachname;
    }
    public void setCoachname(String coachname) {
        this.coachname = coachname;
    }
    public String getCoachmail() {
        return coachmail;
    }
    public void setCoachmail(String coachmail) {
        this.coachmail = coachmail;
    }
    public String getSpecialisedsport() {
        return specialisedsport;
    }
    public void setSpecialisedsport(String specialisedsport) {
        this.specialisedsport = specialisedsport;
    }
    
    

}
