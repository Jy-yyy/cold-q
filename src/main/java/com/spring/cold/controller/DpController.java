package com.spring.cold.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DpController {
    @RequestMapping("/")
    public String dp(){
        return "login";
    }

    @RequestMapping("console")
    public String love(){
        return "views/console";
    }

}
