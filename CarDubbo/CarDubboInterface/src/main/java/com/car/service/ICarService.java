package com.car.service;

import java.util.List;

import com.car.pojo.SelectCar;
import com.car.pojo.Sellcar;
import com.car.pojo.Trademark;
import com.car.utils.LayUiUtils;

public interface ICarService {
	/*List<SelectCar> selectAllTrade();*/
	LayUiUtils selectAllTrade(int pageNum,int pageSize);
	int deleteCar(int tid);
	
	void updateCar(Sellcar sellcar);
}
