package com.tedu.sp.service;

import java.util.List;

import com.tedu.sp.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}