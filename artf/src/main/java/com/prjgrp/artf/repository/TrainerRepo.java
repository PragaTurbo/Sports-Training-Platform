package com.prjgrp.artf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prjgrp.artf.model.Trainer;
@Repository
public interface TrainerRepo extends JpaRepository<Trainer,Integer>
{
    List<Trainer> findByCoachname(String coachname);
    
    List<Trainer> findByCoachmail(String coachmail);


    @Query("SELECT e from Trainer e where e.specialisedsport = :specialisedsport")
    List<Trainer> findBySpecialisedsport(String specialisedsport);
}
