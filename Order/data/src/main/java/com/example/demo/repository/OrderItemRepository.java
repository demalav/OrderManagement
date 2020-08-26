package com.example.demo.repository;

import com.example.demo.model.OrderItem;

import java.math.BigInteger;
import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, String> {

    @Query("select productName, quantity from OrderItem where productCode =?1")
    public List<Object[]> getOrderItem(BigInteger productCode);
}
