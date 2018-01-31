package com.mvc.practice.controller;

import com.mvc.practice.domain.TestDomain;
import com.mvc.practice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")
public class RestWebController {

    @Autowired
    private TestService testService;

    @RequestMapping
    public String rest(){
        List<TestDomain> domainList = testService.findAll();
        return "rest";
    }

}