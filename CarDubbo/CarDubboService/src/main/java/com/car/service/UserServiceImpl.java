package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.mapper.UserdetilsMapper;
import com.car.pojo.SelectUser;
import com.car.pojo.Userdetils;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserdetilsMapper userdetilsMapper;
	@Override
	public List<SelectUser> getAll() {
		// TODO Auto-generated method stub
		return userdetilsMapper.selectAllUser();
	}
	@Override
	public int delete(int uuid) {
		// TODO Auto-generated method stub
		return userdetilsMapper.deleteByPrimaryKey(uuid);
	}

}