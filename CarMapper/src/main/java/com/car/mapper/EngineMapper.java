package com.car.mapper;

import com.car.pojo.Engine;
import com.car.pojo.EngineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngineMapper {

    int insertEngine(Engine engine);
	
	List<Engine> selectAllEngine();
	
    int countByExample(EngineExample example);

    int deleteByExample(EngineExample example);

    int deleteByPrimaryKey(Integer ssId);

    int insert(Engine record);

    int insertSelective(Engine record);

    List<Engine> selectByExample(EngineExample example);

    Engine selectByPrimaryKey(Integer ssId);

    int updateByExampleSelective(@Param("record") Engine record, @Param("example") EngineExample example);

    int updateByExample(@Param("record") Engine record, @Param("example") EngineExample example);

    int updateByPrimaryKeySelective(Engine record);

    int updateByPrimaryKey(Engine record);
}