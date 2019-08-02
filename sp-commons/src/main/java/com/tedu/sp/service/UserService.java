package com.tedu.sp.service;

import com.tedu.sp.pojo.User;

public interface UserService {
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}