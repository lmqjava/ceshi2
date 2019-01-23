package com.car.mapper;

import com.car.pojo.Sellcar;
import com.car.pojo.SellcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellcarMapper {
	
	void updateCar(Sellcar sellcar);
	
    long countByExample(SellcarExample example);

    int deleteByExample(SellcarExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Sellcar record);

    int insertSelective(Sellcar record);

    List<Sellcar> selectByExample(SellcarExample example);

    Sellcar selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Sellcar record, @Param("example") SellcarExample example);

    int updateByExample(@Param("record") Sellcar record, @Param("example") SellcarExample example);

    int updateByPrimaryKeySelective(Sellcar record);

    int updateByPrimaryKey(Sellcar record);

	
}