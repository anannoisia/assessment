package com.kbtg.bootcamp.posttest.model.dto;

import lombok.Data;

@Data
public class LotteryRequestDto {

    private String ticket;
    private int amount;
    private int price;
}
