package com.example.demo.service;

import com.example.demo.Entity.OrderEntity;
import com.example.demo.Entity.OrderItemEntity;
import com.example.demo.exception.OrderNotFoundException;
import com.example.demo.repository.OrderRepository;
import demo.ComponentDomainClient;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    ComponentDomainClient componentDomainClient;

    public ResponseEntity<OrderEntity> getOrder(String customername) {
       return componentDomainClient.getOrder(customername);
    }

    public void createOrder(OrderEntity orderEntity) {
        componentDomainClient.createOrder(orderEntity);
    }
}
