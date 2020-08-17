package com.spring.cold.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author jy
 * @date 2020-08-17
 */
@Controller
@RequestMapping("/lean")
public class learnController {

    @RequestMapping("/regular")
    public String regular(String s1,String s2){
        Pattern p = Pattern.compile(s2);
        Matcher m = p.matcher(s1);
        System.out.println(m.matches());
        return "views/regular";
    }
}
