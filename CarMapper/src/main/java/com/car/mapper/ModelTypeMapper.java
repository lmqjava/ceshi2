package com.car.mapper;

import com.car.pojo.ModelType;
import com.car.pojo.ModelTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelTypeMapper {
    long countByExample(ModelTypeExample example);

    int deleteByExample(ModelTypeExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(ModelType record);

    int insertSelective(ModelType record);

    List<ModelType> selectByExample(ModelTypeExample example);

    ModelType selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") ModelType record, @Param("example") ModelTypeExample example);

    int updateByExample(@Param("record") ModelType record, @Param("example") ModelTypeExample example);

    int updateByPrimaryKeySelective(ModelType record);

    int updateByPrimaryKey(ModelType record);
}