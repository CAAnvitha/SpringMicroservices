package com.anvitha.orderservice.controller;

import com.anvitha.orderservice.OrderServiceApplication;
import com.anvitha.orderservice.dto.InventoryResponse;
import com.anvitha.orderservice.dto.OrderRequest;
import com.anvitha.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/order")
@RestController
@RequiredArgsConstructor
public class OrderController {

    private  final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";

    }
}
