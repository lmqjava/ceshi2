package com.car.service;

import java.util.List;

import com.car.pojo.Carfm;
import com.car.pojo.Engine;
import  com.car.utils.LayUiUtils;
public interface CarfmService{


	List<Carfm> selectAllCarfms();
	int insertEngine(Engine engine);
	LayUiUtils selectAllEngine(int pageNum,int pageSize);

}
