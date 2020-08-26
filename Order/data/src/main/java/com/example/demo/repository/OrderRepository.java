package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

public interface OrderRepository extends Serializable {

    @Query("select customerName, shippingAddress, orderItem, total, date from Order where customerName =?1")
    public List<String> getOrder(String customerName);
}
