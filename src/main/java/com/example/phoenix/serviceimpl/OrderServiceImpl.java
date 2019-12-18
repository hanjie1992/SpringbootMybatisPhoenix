package com.example.phoenix.serviceimpl;

import com.example.phoenix.entity.Order;
import com.example.phoenix.mapper.OrderMapper;
import com.example.phoenix.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author: hanj
 * @date: 2019/12/18
 * @description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getOrders() {
        return orderMapper.getOrders();
    }

    @Override
    public void updateOrder(Long id,BigDecimal totalAmount) {
        orderMapper.updateOrder(id,totalAmount);
    }
}
