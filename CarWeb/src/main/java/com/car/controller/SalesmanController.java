package com.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.pojo.SalesmanSelect;
import com.car.pojo.SelectUser;
import com.car.service.ISalesmanService;
import com.car.utils.LayUiUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/salesman")
public class SalesmanController {
	@Autowired
	ISalesmanService isalesmanService;
	@GetMapping("/select")
	public LayUiUtils getAllUser(@RequestParam(name="page", defaultValue="1") int pageNum,@RequestParam(name="limit", defaultValue="10") int pageSize){
	       LayUiUtils utils=new LayUiUtils();
	       int count=isalesmanService.getAll().size();

	       PageHelper.startPage(pageNum,pageSize);

	       List<SalesmanSelect> list=isalesmanService.getAll();

	       PageInfo<SalesmanSelect> info=new PageInfo<>(list);

	       List<SalesmanSelect> infos=info.getList();
	       for (SalesmanSelect selectUser : infos) {
			System.out.println(selectUser);
		}

	       utils.setCode(0);
	       utils.setCount(count);
	       utils.setMsg("");
	       utils.setData(infos);
	       return utils;
	       
	   }	
	@RequestMapping("/delall")
	@ResponseBody
    public void del(@RequestParam(value="particularsid") int particularsid){  
		System.out.println(particularsid);
       isalesmanService.delete(particularsid);
    }  
}
