package com.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.car.pojo.Carfm;
import com.car.service.CarfmService;

import com.car.utils.LayUiUtils;


@Controller
public class CarfmController {

	@Autowired
	private CarfmService carfmService;
	
	@RequestMapping("/selectAllCar")
	@ResponseBody
	public List<Carfm> selectAllCar(){
		
		return carfmService.selectAllCarfms();
	}
	@RequestMapping("/engine")
	@ResponseBody()
	public LayUiUtils selectAllEngine(@RequestParam(name="page", defaultValue="1") int pageNum, @RequestParam(name="limit", defaultValue="10") int pageSize){
		LayUiUtils utils=carfmService.selectAllEngine(pageNum, pageSize);

		return utils;

	}

}
