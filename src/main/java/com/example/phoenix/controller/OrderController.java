package com.example.phoenix.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.phoenix.entity.Order;
import com.example.phoenix.service.OrderService;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author: hanj
 * @date: 2019/12/18
 * @description:
 */
@RestController
@RequestMapping("/algorithm")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/getOrders", method = RequestMethod.GET)
    public String getOrders() {
        try {
            List<Order> mapResult = orderService.getOrders();
            JSONArray responseJson = (JSONArray) JSON.toJSON(mapResult);
            return responseJson.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "xxxx";
        }
    }

    @RequestMapping(value = "/updateOrder", method = RequestMethod.PUT)
    public void updateOrder(Long id,BigDecimal totalAmount) {
        try {
            orderService.updateOrder(id,totalAmount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
