package com.car.service;

import java.util.List;

import com.car.pojo.LbImage;
import com.car.utils.LayUiUtils;

public interface ContentService {

	String hello(String name);
	
	
	LbImage selectById(Integer imgId);
	
	
	void insertLbImage(LbImage lbImage);
	
	
	
	void updateLbImage(LbImage lbImage);
	
	
	void deleteLbImage(Integer imgId);
	

	LayUiUtils selectAll(int pageNum,int pageSize);

}
