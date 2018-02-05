package com.mvc.practice.controller;

import com.mvc.practice.domain.Segment;
import com.mvc.practice.service.SegmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by whilemouse on 18. 2. 5.
 */
@RestController
@RequestMapping(value = "/segment")
public class SegmentController {

    @Autowired
    private SegmentService segmentService;

    @RequestMapping
    public List<Segment> get(){
        return segmentService.findAll();
    }

    @RequestMapping("/{id}")
    public Segment get(@PathVariable int id){
        return segmentService.findOne(id);
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
