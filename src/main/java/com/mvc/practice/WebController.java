package com.mvc.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ksb on 2018. 1. 30..
 */
@Controller
public class WebController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

}