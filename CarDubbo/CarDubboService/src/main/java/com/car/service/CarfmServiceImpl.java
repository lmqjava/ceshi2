package com.car.service;

import java.util.List;

import com.car.mapper.EngineMapper;
import com.car.pojo.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.car.mapper.CarfmMapper;
import com.car.pojo.Carfm;
import com.car.service.CarfmService;
import  com.car.utils.LayUiUtils;
import com.github.pagehelper.PageInfo;
import com.car.utils.LayUiUtils;
@Service
public class CarfmServiceImpl implements CarfmService {

	@Autowired
	private CarfmMapper carfmMapper;
	@Autowired
	private EngineMapper engineMapper;
	@Override
	public List<Carfm> selectAllCarfms() {
		
		return carfmMapper.selectAllCarfms();
	}
	@Override
	public LayUiUtils selectAllEngine(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Engine> list=engineMapper.selectAllEngine();
		PageInfo<Engine> pageInfo=new PageInfo<>(list);
		LayUiUtils utils=new LayUiUtils();
		utils.setCode(0);
		utils.setCount(pageInfo.getTotal());
		utils.setData(pageInfo.getList());
		utils.setMsg("");
		return utils;
	}
	@Override
	public int insertEngine(Engine engine) {

		return engineMapper.insertEngine(engine);
	}


}
