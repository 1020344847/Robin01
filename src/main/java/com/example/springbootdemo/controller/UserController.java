package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/eat")
    public String eat(){

        System.out.println("nini");
        return "hello world";
    }


}
