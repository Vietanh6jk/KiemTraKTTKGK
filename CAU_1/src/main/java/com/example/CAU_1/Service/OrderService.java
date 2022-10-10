package com.example.CAU_1.Service;

import org.springframework.stereotype.Service;

import com.example.CAU_1.Enitty.Order;
@Service
public interface OrderService {
	Order createOrder(Order order);
    Order findByOrderName(String OrderName);
}
