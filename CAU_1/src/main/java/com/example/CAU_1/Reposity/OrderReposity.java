package com.example.CAU_1.Reposity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CAU_1.Enitty.Order;

public interface OrderReposity extends  JpaRepository<Order, String>{
	Order findByOrderName(String OrderName);
}
