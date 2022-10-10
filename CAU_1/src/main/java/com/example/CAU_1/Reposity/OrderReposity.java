package com.example.CAU_1.reposity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CAU_1.entity.Order;


@Repository
public interface OrderReposity extends  JpaRepository<Order, String>{
	Order findByOrderName(String OrderName);
}
