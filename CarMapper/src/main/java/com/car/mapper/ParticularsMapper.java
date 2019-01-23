package com.car.mapper;

import com.car.pojo.Particulars;
import com.car.pojo.ParticularsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParticularsMapper {
    long countByExample(ParticularsExample example);

    int deleteByExample(ParticularsExample example);

    int deleteByPrimaryKey(Integer particularsId);

    int insert(Particulars record);

    int insertSelective(Particulars record);

    List<Particulars> selectByExample(ParticularsExample example);

    Particulars selectByPrimaryKey(Integer particularsId);

    int updateByExampleSelective(@Param("record") Particulars record, @Param("example") ParticularsExample example);

    int updateByExample(@Param("record") Particulars record, @Param("example") ParticularsExample example);

    int updateByPrimaryKeySelective(Particulars record);

    int updateByPrimaryKey(Particulars record);
}