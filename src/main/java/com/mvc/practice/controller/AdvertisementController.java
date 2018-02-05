package com.mvc.practice.controller;

import com.mvc.practice.domain.Advertisement;
import com.mvc.practice.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by whilemouse on 18. 2. 5.
 */
@RestController
@RequestMapping(value = "advertisement")
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;

    @RequestMapping
    public List<Advertisement> get(){
        return advertisementService.findAll();
    }

    @RequestMapping("/{id}")
    public Advertisement get(@PathVariable int id){
        return advertisementService.findOne(id);
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
