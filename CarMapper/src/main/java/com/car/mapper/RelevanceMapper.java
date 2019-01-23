package com.car.mapper;

import com.car.pojo.Relevance;
import com.car.pojo.RelevanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelevanceMapper {
    long countByExample(RelevanceExample example);

    int deleteByExample(RelevanceExample example);

    int deleteByPrimaryKey(Integer releId);

    int insert(Relevance record);

    int insertSelective(Relevance record);

    List<Relevance> selectByExample(RelevanceExample example);

    Relevance selectByPrimaryKey(Integer releId);

    int updateByExampleSelective(@Param("record") Relevance record, @Param("example") RelevanceExample example);

    int updateByExample(@Param("record") Relevance record, @Param("example") RelevanceExample example);

    int updateByPrimaryKeySelective(Relevance record);

    int updateByPrimaryKey(Relevance record);
}