package com.example.phoenix.service;

import com.example.phoenix.entity.Order;

import java.math.BigDecimal;
import java.util.List;

public interface OrderService {
    List<Order> getOrders();

    void updateOrder(Long id,BigDecimal totalAmount);
}
