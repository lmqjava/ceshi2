package com.car.mapper;

import com.car.pojo.Roler;
import com.car.pojo.RolerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolerMapper {
    long countByExample(RolerExample example);

    int deleteByExample(RolerExample example);

    int deleteByPrimaryKey(Integer rolerId);

    int insert(Roler record);

    int insertSelective(Roler record);

    List<Roler> selectByExample(RolerExample example);

    Roler selectByPrimaryKey(Integer rolerId);

    int updateByExampleSelective(@Param("record") Roler record, @Param("example") RolerExample example);

    int updateByExample(@Param("record") Roler record, @Param("example") RolerExample example);

    int updateByPrimaryKeySelective(Roler record);

    int updateByPrimaryKey(Roler record);
}