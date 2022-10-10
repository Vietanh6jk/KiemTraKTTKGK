package com.example.CAU_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CAU_1.entity.Order;
import com.example.CAU_1.reposity.OrderReposity;

@Service
public class OderServiceImpl implements OrderService {
	@Autowired
	private OrderReposity orderReposity;
	@Override
	public Order createOrder(Order order) {
		return orderReposity.saveAndFlush(order);
	}

	@Override
	public Order findByOrderName(String OrderName) {
		Order order= orderReposity.findByOrderName(OrderName);
		if(order !=null) {
			System.out.println(order);
		}
		return order;
	}

}
