package com.example.demo.service;

import com.example.demo.Entity.OrderItemEntity;
import com.example.demo.exception.OrderNotFoundException;
import com.example.demo.repository.OrderItemRepository;

import java.math.BigInteger;
import java.util.List;

@Service
public class OrderItemService {

    @Autowired
    OrderItemRepository orderItemRepository;

    public OrderItemEntity getOrderItem(BigInteger productCode) {
        List<Object[]> items = orderItemRepository.getOrderItem(productCode);
        OrderItemEntity orderItemEntity = new OrderItemEntity();
        if (items != null) {
            for (Object[] item : items) {
                if (item[0] != null)
                    orderItemEntity.setProductName(item[0].toString());
                if (item[1] != null)
                    orderItemEntity.setQuantity(item[1].toString());
            }
        } else {
            throw new OrderNotFoundException("productId is not found", 400);
        }
        return orderItemEntity;
    }

    public void createOrder(OrderItemEntity orderItemEntity) {
        orderItemRepository.save(orderItemEntity);
    }
}
