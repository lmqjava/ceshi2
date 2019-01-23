package com.car.mapper;

import com.car.pojo.Salesman;
import com.car.pojo.SalesmanExample;
import com.car.pojo.SalesmanSelect;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesmanMapper {
	
	int deleteById(int particularsid);
	
	List <SalesmanSelect> selectBySalesman();
	
    long countByExample(SalesmanExample example);

    int deleteByExample(SalesmanExample example);

    int deleteByPrimaryKey(Integer salesmanId);

    int insert(Salesman record);

    int insertSelective(Salesman record);

    List<Salesman> selectByExample(SalesmanExample example);

    Salesman selectByPrimaryKey(Integer salesmanId);

    int updateByExampleSelective(@Param("record") Salesman record, @Param("example") SalesmanExample example);

    int updateByExample(@Param("record") Salesman record, @Param("example") SalesmanExample example);

    int updateByPrimaryKeySelective(Salesman record);

    int updateByPrimaryKey(Salesman record);
}