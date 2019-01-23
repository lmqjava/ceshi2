package com.car.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.car.pojo.SelectCar;
import com.car.pojo.Sellcar;
import com.car.pojo.Trademark;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.car.service.ICarService;
import com.car.utils.LayUiUtils;

@RestController
@RequestMapping("/car")
public class CarController {
	@Autowired
	private ICarService iCarService;

	@GetMapping("/select")
	public LayUiUtils getAllCar(@RequestParam(name = "page", defaultValue = "1") int pageNum,
			@RequestParam(name = "limit", defaultValue = "10") int pageSize) {
	LayUiUtils lau=iCarService.selectAllTrade(pageNum, pageSize);
	
	return lau;

	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public boolean deleteCar(@RequestParam("tid") int tid) {

		return iCarService.deleteCar(tid) > 0;
	}

	@RequestMapping(value = "/updateCar", method = RequestMethod.POST)
	public void updateCar(Sellcar sellcar) {

		System.out.println(sellcar);

		iCarService.updateCar(sellcar);
	}

}
