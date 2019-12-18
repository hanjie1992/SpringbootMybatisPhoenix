package com.example.phoenix;

import com.example.phoenix.mapper.OrderMapper;
import com.example.phoenix.entity.Order;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class PhoenixApplicationTests {

	@Autowired
	private OrderMapper orderMapper;

	@Test
	public void testGetOrders() {
		List<Order> orders = orderMapper.getOrders();
		orders.forEach(System.out::println);
	}

	@Test
	public void testUpdateOrder() {
		orderMapper.updateOrder(2L, BigDecimal.valueOf(88.8));
	}


}
