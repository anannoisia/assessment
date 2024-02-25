package com.kbtg.bootcamp.posttest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lotteries")
public class LotteryController extends Controller {

    @GetMapping("")
    public Object getLottery(){
        return responseOK("");
    }
}
