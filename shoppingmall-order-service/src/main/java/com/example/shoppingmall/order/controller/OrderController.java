package com.example.shoppingmall.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/order")
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
    @RequestMapping("/place")
    public String placeOrder(Long orderId, Integer prodNum){
        logger.info("order coming, orderId={}, prodNum={}", orderId, prodNum);
        return "success";
    }
}