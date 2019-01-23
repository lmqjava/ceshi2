package com.car.service;

import java.util.List;

import com.car.pojo.SalesmanSelect;

public interface ISalesmanService {
	List<SalesmanSelect> getAll();
	
	int delete(int particularsid);
}
