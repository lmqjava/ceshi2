package com.car.mapper;

import com.car.pojo.SelectAll;
import com.car.pojo.SelectUser;
import com.car.pojo.Userdetils;
import com.car.pojo.UserdetilsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserdetilsMapper {


    List<SelectAll> selectByExample();

    List<SelectUser> selectAllUser();

    int deleteByPrimaryKey(Integer uuid);




    long countByExample(UserdetilsExample example);

    int deleteByExample(UserdetilsExample example);



    int insert(Userdetils record);

    int insertSelective(Userdetils record);

    Userdetils selectByPrimaryKey(Integer uuid);

    int updateByExampleSelective(@Param("record") Userdetils record, @Param("example") UserdetilsExample example);

    int updateByExample(@Param("record") Userdetils record, @Param("example") UserdetilsExample example);

    int updateByPrimaryKeySelective(Userdetils record);

    int updateByPrimaryKey(Userdetils record);
}