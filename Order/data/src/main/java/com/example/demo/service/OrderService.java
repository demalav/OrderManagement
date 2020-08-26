package com.example.demo.service;

import com.example.demo.Entity.OrderEntity;
import com.example.demo.Entity.OrderItemEntity;
import com.example.demo.exception.OrderNotFoundException;
import com.example.demo.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public OrderEntity getOrder(String customername) {
        List<String> order = orderRepository.getOrder(customername);
        OrderEntity orderEntity = new OrderEntity();
        if (order != null) {
            if (order.get(0) != null)
                orderEntity.setCustomerName(order.get(0));
            if (order.get(1) != null)
                orderEntity.setAddress(order.get(1));
            if (order.get(2) != null)
                orderEntity.setOrderItem(order.get(2));
            if (order.get(3) != null)
                orderEntity.setTotal(order.get(3));
            if (order.get(4) != null)
                orderEntity.setDate(order.get(4));
        } else {
            throw new OrderNotFoundException("Customer not found", 400);
        }
        return orderEntity;
    }

    public void createOrder(OrderEntity orderEntity) {
        orderRepository.save(orderEntity);
    }
}
