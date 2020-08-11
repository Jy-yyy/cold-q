package com.spring.cold.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("field")
@Controller
public class FieldController {
    @RequestMapping("1")
    public String field1(){
        return "views/field-add";
    }
}
