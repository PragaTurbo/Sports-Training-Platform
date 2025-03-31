package com.prjgrp.artf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;

import com.prjgrp.artf.model.Trainer;
import com.prjgrp.artf.service.TrainerService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;








@RestController
@RequestMapping("/trainer")
public class TrainerController 
{
    @Autowired
    private final TrainerService tService;
    public TrainerController(TrainerService tService)
    {
        this.tService = tService;
    }
 
    @GetMapping("/getAll")
    public List<Trainer> getTrainerDetail() 
    {
        return tService.getTrainerDetail();
    }
    @PostMapping("/post")
    public List<Trainer> postTrainerName(@RequestBody List<Trainer> trainer) 
    {
        return tService.posttrainer(trainer);
    }

    @PutMapping("/put/{coachId}")
    public Trainer putTrainerID(@PathVariable int coachId, @RequestBody Trainer trainer) {
        return tService.putTrainerID(coachId, trainer);
    }

    @DeleteMapping("/delete/{coachId}")
    public String delByList(@PathVariable int coachId)
    {
        
        tService.delByList(coachId);
        return "Trainer ID:"+coachId+" deleted successfully";

    }

    @GetMapping("/get/name/{coachname}")
    public List<Trainer> getByCoachname(@PathVariable String coachname) {
         return tService.getByCoachname(coachname);
    }

    @GetMapping("/get/sport/{specialisedsport}")
    public List<Trainer> getBySport(@PathVariable String specialisedsport)
    {
        return tService.getBySport(specialisedsport);
    }
    
    @GetMapping("/sorted")
    public List<Trainer> getsorted()
    {
        return tService.getsorted();
    }

    @GetMapping("/pagination")
    public Page<Trainer> getpage(@RequestParam int page, int size)
    {
        return tService.getpage(page, size);
    }


}
