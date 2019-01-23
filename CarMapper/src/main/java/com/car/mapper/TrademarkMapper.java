package com.car.mapper;

import com.car.pojo.SelectCar;
import com.car.pojo.Trademark;
import com.car.pojo.TrademarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrademarkMapper {
	
	List<SelectCar> selectAllTrade();
	
	int deleteCar(int tid);
	
    long countByExample(TrademarkExample example);

    int deleteByExample(TrademarkExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Trademark record);

    int insertSelective(Trademark record);

    List<Trademark> selectByExample(TrademarkExample example);

    Trademark selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Trademark record, @Param("example") TrademarkExample example);

    int updateByExample(@Param("record") Trademark record, @Param("example") TrademarkExample example);

    int updateByPrimaryKeySelective(Trademark record);

    int updateByPrimaryKey(Trademark record);

	

	
}