package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.car.mapper.LbImageMapper;
import com.car.pojo.LbImage;
import com.car.service.ContentService;
import com.car.utils.LayUiUtils;

@Service
public class ContentServiceImpl implements ContentService{
	
	@Autowired
	private LbImageMapper lbimageMapper;

	@Override
	public String hello(String name) {
		
		return "hello-"+name;
	}

/*	@Override
	public List<LbImage> selectAll() {
		
		return lbimageMapper.selectAll();
	}*/

	@Override
	public LbImage selectById(Integer imgId) {
		
		return lbimageMapper.selectById(imgId);
	}

	@Override
	public void insertLbImage(LbImage lbImage) {
		lbimageMapper.insertLbImage(lbImage);
		
	}

	@Override
	public void updateLbImage(LbImage lbImage) {
		lbimageMapper.updateLbImage(lbImage);
		
	}

	@Override
	public void deleteLbImage(Integer imgId) {
		lbimageMapper.deleteLbImage(imgId);
		
	}

	@Override
	public LayUiUtils selectAll(int pageNum, int pageSize) {
		
		PageHelper.startPage(pageNum, pageSize);
		List<LbImage> list=lbimageMapper.selectAll();
		System.out.println(list);
		PageInfo<LbImage> pInfo=new PageInfo<>(list);
		List<LbImage> list2=pInfo.getList();
		LayUiUtils utils=new LayUiUtils();
		utils.setCount(pInfo.getTotal());
		utils.setMsg("");
		utils.setData(pInfo.getList());
		utils.setCode(0);
		System.out.println(utils);
		return utils;
	}	
}
