package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author light
 * @version 1.0
 * @project linuxProject
 * @description
 * @data 2022/10/16 15 : 13 : 59
 */
@RestController
@RequestMapping("/book")
public class bookController {
    @GetMapping
    public String addr(){
        System.out.println("hellow");
        return "hah";
    }
}
