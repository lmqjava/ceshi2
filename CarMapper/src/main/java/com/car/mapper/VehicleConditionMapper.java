package com.car.mapper;

import com.car.pojo.VehicleCondition;
import com.car.pojo.VehicleConditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleConditionMapper {
    long countByExample(VehicleConditionExample example);

    int deleteByExample(VehicleConditionExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(VehicleCondition record);

    int insertSelective(VehicleCondition record);

    List<VehicleCondition> selectByExample(VehicleConditionExample example);

    VehicleCondition selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") VehicleCondition record, @Param("example") VehicleConditionExample example);

    int updateByExample(@Param("record") VehicleCondition record, @Param("example") VehicleConditionExample example);

    int updateByPrimaryKeySelective(VehicleCondition record);

    int updateByPrimaryKey(VehicleCondition record);
}