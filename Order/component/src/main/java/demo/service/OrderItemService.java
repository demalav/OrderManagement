package com.example.demo.service;

import com.example.demo.Entity.OrderItemEntity;
import com.example.demo.exception.OrderNotFoundException;
import com.example.demo.repository.OrderItemRepository;
import demo.IComponentDomainClient;

import java.math.BigInteger;
import java.util.List;

@Service
public class OrderItemService {

    @Autowired
    IComponentDomainClient componentDomainClient;

    public ResponseEntity<OrderItemEntity> getOrderItem(BigInteger productCode) {
        return componentDomainClient.getOrderItem(productCode);
    }

    public void createOrderItem(OrderItemEntity orderItemEntity) {
        componentDomainClient.createOrderItem(orderItemEntity);
    }
}
