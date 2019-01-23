package com.car.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.pojo.SelectUser;
import com.car.pojo.Trademark;
import com.car.pojo.Userdetils;
import com.car.service.ICarService;
import com.car.service.IUserService;
import com.car.utils.LayUiUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUserService iuserService;
	@GetMapping("/select")
	public LayUiUtils getAllUser(@RequestParam(name="page", defaultValue="1") int pageNum,@RequestParam(name="limit", defaultValue="10") int pageSize){
	       LayUiUtils utils=new LayUiUtils();
	       int count=iuserService.getAll().size();

	       PageHelper.startPage(pageNum,pageSize);

	       List<SelectUser> list=iuserService.getAll();

	       PageInfo<SelectUser> info=new PageInfo<>(list);

	       List<SelectUser> infos=info.getList();
	       for (SelectUser selectUser : infos) {
			System.out.println(selectUser);
		}

	       utils.setCode(0);
	       utils.setCount(count);
	       utils.setMsg("");
	       utils.setData(infos);
	       return utils;
	       
	   }	
	
	@RequestMapping("/delUser")
	@ResponseBody
    public void delUser(@RequestParam(value="uuid") int uuid){  
		System.out.println(uuid);
       iuserService.delete(uuid);
    }  
}