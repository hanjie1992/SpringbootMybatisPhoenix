package com.example.phoenix.mapper;

import com.example.phoenix.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface OrderMapper {
    List<Order> getOrders();

    void updateOrder(@Param("id") Long id, @Param("totalAmount") BigDecimal totalAmount);
}

