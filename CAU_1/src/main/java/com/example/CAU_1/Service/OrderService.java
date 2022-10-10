package com.example.CAU_1.service;

import org.springframework.stereotype.Service;

import com.example.CAU_1.entity.Order;

@Service
public interface OrderService {
	Order createOrder(Order order);
    Order findByOrderName(String OrderName);
}
