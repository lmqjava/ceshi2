package com.car.mapper;

import com.car.pojo.Carfm;
import com.car.pojo.CarfmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarfmMapper {
	List<Carfm> selectAllCarfms();
	
    int countByExample(CarfmExample example);

    int deleteByExample(CarfmExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(Carfm record);

    int insertSelective(Carfm record);

    List<Carfm> selectByExample(CarfmExample example);

    Carfm selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") Carfm record, @Param("example") CarfmExample example);

    int updateByExample(@Param("record") Carfm record, @Param("example") CarfmExample example);

    int updateByPrimaryKeySelective(Carfm record);

    int updateByPrimaryKey(Carfm record);
}