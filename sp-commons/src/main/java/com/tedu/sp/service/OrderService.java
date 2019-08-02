package com.tedu.sp.service;


import com.tedu.sp.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);
}