package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.mapper.SellcarMapper;
import com.car.mapper.TrademarkMapper;
import com.car.pojo.SelectCar;
import com.car.pojo.Sellcar;
import com.car.pojo.Trademark;
import com.car.utils.LayUiUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class CarServiceImpl implements ICarService {

	  @Autowired
	    private TrademarkMapper trademarkMapper;
	  @Autowired
	  	private SellcarMapper sellcarMapper;
	   /* @Override
	    public List<SelectCar> selectAllTrade() {
	        return trademarkMapper.selectAllTrade();
	    }
*/
		@Override
		public void updateCar(Sellcar sellcar) {
			
			sellcarMapper.updateCar(sellcar);
		}

		@Override
		public int deleteCar(int tid) {
			
			return trademarkMapper.deleteCar(tid);
		}

		@Override
		public LayUiUtils selectAllTrade(int pageNum, int pageSize) {
			PageHelper.startPage(pageNum, pageSize);
			
			  List<SelectCar> list=trademarkMapper.selectAllTrade();
			  
			  PageInfo<SelectCar> infos=new PageInfo<>(list);
			 
			  LayUiUtils lau=new LayUiUtils();
			  
			  lau.setCount(infos.getTotal());
			  lau.setData(infos.getList());
			  lau.setCode(0);
			  lau.setMsg("");
			  return lau;
			
		}
	}


