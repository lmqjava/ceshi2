package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.mapper.SalesmanMapper;
import com.car.pojo.SalesmanSelect;

@Service
public class SalesmanServiceImpl implements ISalesmanService{

	@Autowired
	SalesmanMapper salesmanMapper;
	@Override
	public List<SalesmanSelect> getAll() {
		// TODO Auto-generated method stub
		return salesmanMapper.selectBySalesman();
	}
	@Override
	public int delete(int particularsid) {
		// TODO Auto-generated method stub
		return salesmanMapper.deleteById(particularsid);
	}

}
