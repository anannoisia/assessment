package com.kbtg.bootcamp.posttest.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class Controller {

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpServletResponse response;

    protected Object responseOK(Object data) {
        response.setStatus(HttpStatus.OK.value());
        return data;
    }

    protected Object responseCreatedOK(Object data) {
        response.setStatus(HttpStatus.CREATED.value());
        return data;
    }

}
