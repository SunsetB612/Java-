package org.example.springbeandemo.controller;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private Integer autowire_bean;

    @Resource(name = "resource_name1")
    private String resource_bean1;

    @Resource(name = "resource_name2",type = String.class)
    private String resource_bean2;

    @GetMapping("/autowire_bean")
    public String getAutowire_bean(){
        return "autowire_bean: "+autowire_bean+
                "<br>resource_bean1: "+resource_bean1+
                "<br>resource_bean2: "+resource_bean2;
    }
}
