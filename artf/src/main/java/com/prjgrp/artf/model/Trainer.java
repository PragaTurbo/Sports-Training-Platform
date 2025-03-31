package com.prjgrp.artf.model;

import javax.persistence.*;

@Entity
@Table
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int coachId;

    @Column(unique = true)
    private String coachname;
    private String coachmail;
    private String specialisedsport;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)  
    private User user;

    public Trainer() {
    }

    public Trainer(int coachId, String coachname, String coachmail, String specialisedsport, User user) {
        this.coachId = coachId;
        this.coachname = coachname;
        this.coachmail = coachmail;
        this.specialisedsport = specialisedsport;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
