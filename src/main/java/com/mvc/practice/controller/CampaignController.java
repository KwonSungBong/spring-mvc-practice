package com.mvc.practice.controller;

import com.mvc.practice.domain.Campaign;
import com.mvc.practice.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by whilemouse on 18. 2. 5.
 */
@RestController
@RequestMapping(value = "/campaign")
public class CampaignController {

    @Autowired
    private CampaignService campaignService;

    @GetMapping
    public List<Campaign> get(){
        return campaignService.findAll();
    }

    @GetMapping("/{id}")
    public Campaign get(@PathVariable int id){
        return campaignService.findOne(id);
    }

    @PostMapping
    public void post(){
    }

    @PutMapping("/{id}")
    public void put(@PathVariable int id){
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
    }

}
