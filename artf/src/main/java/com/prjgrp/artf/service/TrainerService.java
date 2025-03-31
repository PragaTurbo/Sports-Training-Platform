package com.prjgrp.artf.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.prjgrp.artf.model.Trainer;
import com.prjgrp.artf.repository.TrainerRepo;

@Service
public class TrainerService 
{
    @Autowired
    private final TrainerRepo tRepo;
    public TrainerService(TrainerRepo tRepo)
    {
        this.tRepo = tRepo;
    }
    
    public List<Trainer> getTrainerDetail()
    {
        return tRepo.findAll();
    }
    public List<Trainer> posttrainer(List<Trainer> trainer)
    {
        return tRepo.saveAll(trainer);
    }

    
    public Trainer putTrainerID(int coachId, Trainer trainer) {
        Optional<Trainer> existingTrainerOptional = tRepo.findById(coachId);
    
        if (existingTrainerOptional.isPresent()) {
            Trainer existingTrainer = existingTrainerOptional.get();
            existingTrainer.setCoachname(trainer.getCoachname());
            existingTrainer.setCoachmail(trainer.getCoachmail());
            existingTrainer.setSpecialisedsport(trainer.getSpecialisedsport());
            return tRepo.save(existingTrainer);
        } else {
            trainer.setCoachId(coachId); 
            return tRepo.save(trainer);
        }
    }
    public void delByList(int coachId)
    {
        tRepo.deleteById(coachId);
    }
    public List<Trainer> getByCoachname(String coachname)
    {
        return tRepo.findByCoachname(coachname);
    }
    public List<Trainer> getBySport(String specialisedsport)
    {
        return tRepo.findBySpecialisedsport(specialisedsport);
    }

    public List<Trainer> getsorted()
    {
        return tRepo.findAll(Sort.by(Sort.Direction.ASC,"coachname"));
    }

    public Page<Trainer> getpage(int page,int size)
    {
        Pageable pageable = PageRequest.of(page,size);
        return tRepo.findAll(pageable);
    }

}
