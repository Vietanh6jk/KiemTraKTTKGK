package com.example.CAU_2.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity ;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
	
	public Order(String orderId, String name, String price) {
		OrderId = orderId;
		Name = name;
		Price = price;
	}
	@Id
	@GeneratedValue
	@Column(name="OrderId")
	private String OrderId;
	@Column(name="OrderName")
	private String Name;
	@Column(name="Price")
	private String Price;
}
