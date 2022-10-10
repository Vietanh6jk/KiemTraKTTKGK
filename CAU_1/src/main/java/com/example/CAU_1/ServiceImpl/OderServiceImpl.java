package com.example.CAU_1.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.CAU_1.Enitty.Order;
import com.example.CAU_1.Reposity.OrderReposity;
import com.example.CAU_1.Service.OrderService;

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
