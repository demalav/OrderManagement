package com.example.demo.controller;

import com.example.demo.Entity.OrderItemEntity;
import com.example.demo.service.OrderItemService;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping(value = "/data/order")
public class OrderItemController {

    @Autowired
    OrderItemService orderItemService;

    @GetMapping(value = "/orderdetails/{productCode}")
    public ResponseEntity<OrderItemEntity> getOrderItem(@PathVariable BigInteger productCode){
      OrderItemEntity  orderItemEntity =  orderItemService.getOrderItem(productCode);
        return new ResponseEntity<>(orderItemEntity, HttpStatus.OK);
    }

    @PostMapping(value = "/create/orderitems")
    public void createOrderItem(@RequestBody OrderItemEntity orderItemEntity){
            orderItemService.createOrder(orderItemEntity);
    }
}
