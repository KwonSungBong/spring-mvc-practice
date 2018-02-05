package com.mvc.practice.controller;

import com.mvc.practice.domain.AdvertisementSegment;
import com.mvc.practice.service.AdvertisementSegmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by whilemouse on 18. 2. 5.
 */
@RestController
@RequestMapping(value = "/advertisementSegment")
public class AdvertisementSegmentController {

    @Autowired
    private AdvertisementSegmentService advertisementSegmentService;

    @RequestMapping
    public List<AdvertisementSegment> get(){
        return advertisementSegmentService.findAll();
    }

    @RequestMapping("/{id}")
    public AdvertisementSegment get(@PathVariable int id){
        return advertisementSegmentService.findOne(id);
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
