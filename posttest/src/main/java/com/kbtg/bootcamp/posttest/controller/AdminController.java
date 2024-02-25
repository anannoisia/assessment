package com.kbtg.bootcamp.posttest.controller;

import com.kbtg.bootcamp.posttest.model.dto.LotteryRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController extends Controller {

    @PostMapping("/lotteries")
    public Object createdLottery(@RequestBody LotteryRequestDto req){
        return responseCreatedOK(req.getTicket());
    }
}
