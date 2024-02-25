package com.kbtg.bootcamp.posttest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends Controller{

    @GetMapping("")
    public Object getUser(){
        return responseOK("");
    }
}
