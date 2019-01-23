package com.car.service;

import java.util.List;

import com.car.pojo.SelectUser;
import com.car.pojo.Userdetils;

public interface IUserService {
	
	public List<SelectUser> getAll();
	
	public  int delete(int uuid);
}
