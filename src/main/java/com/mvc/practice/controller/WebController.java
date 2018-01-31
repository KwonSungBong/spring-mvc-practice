package com.mvc.practice.controller;

import com.mvc.practice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/")
    public String index(Model model){
        String test = testService.test();
        model.addAttribute("test", test);
        return "index";
    }

}