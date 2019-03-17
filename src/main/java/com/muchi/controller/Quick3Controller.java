package com.muchi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ConfigurationProperties(prefix = "person")
public class Quick3Controller {

    private String name;
    private String addr;
    private Integer age;

    @RequestMapping("/quick3")
    @ResponseBody
    public String getInfo(){
        return "";
    }

}
