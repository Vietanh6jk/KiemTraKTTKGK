package com.example.CAU_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CAU_1.entity.Order;
import com.example.CAU_1.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/register")
	public Order register(@RequestBody Order order) {
		return orderService.createOrder(order);
	}
	@GetMapping("/getuser")
	public Order getOrder(@RequestBody String OrderName) {
		return orderService.findByOrderName(OrderName);
	}
	
}
