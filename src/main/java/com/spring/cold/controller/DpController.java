package com.spring.cold.controller;

import com.spring.cold.pojo.DpUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DpController {
    @RequestMapping("/")
    public String dp(){
        return "login";
    }

    @RequestMapping("/index")
    public String login(DpUser dpUser){
        return "index";
    }

    @RequestMapping("/console")
    public String console(HttpServletRequest request, HttpServletResponse response){
        return "views/console";
    }

}
