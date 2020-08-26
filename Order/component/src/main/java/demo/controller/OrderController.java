package com.example.demo.controller;

import com.example.demo.Entity.OrderEntity;
import com.example.demo.Entity.OrderItemEntity;
import com.example.demo.service.OrderService;

import java.math.BigInteger;

@RestController
@RequestMapping(value = "/component/orderdetails")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping(value = "/order/{customername}")
    public ResponseEntity<OrderEntity> getOrder(@PathVariable String customername) {
        return orderService.getOrder(customername);
    }

    @PostMapping(value = "/create/order")
    public void createOrder(@RequestBody OrderEntity orderEntity) {
        orderService.createOrder(orderEntity);
    }
}
