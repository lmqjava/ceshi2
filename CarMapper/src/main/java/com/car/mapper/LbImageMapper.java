package com.car.mapper;

import com.car.pojo.LbImage;
import com.car.pojo.LbImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LbImageMapper {
	/**
	 * 通过id查询图片
	 */
	LbImage selectById(Integer imgId);
	
	/**
	 * 添加图片信息
	 */
	void insertLbImage(LbImage lbImage);
	
	/**
	 * 修改图片信息
	 */
	
	void updateLbImage(LbImage lbImage);
	/**
	 * 删除图片信息
	 */
	
	void deleteLbImage(Integer imgId);
	/**
	 * 显示图片信息
	 */
	List<LbImage> selectAll();
	
   /* int countByExample(LbImageExample example);

    int deleteByExample(LbImageExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(LbImage record);

    int insertSelective(LbImage record);

    List<LbImage> selectByExample(LbImageExample example);

    LbImage selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") LbImage record, @Param("example") LbImageExample example);

    int updateByExample(@Param("record") LbImage record, @Param("example") LbImageExample example);

    int updateByPrimaryKeySelective(LbImage record);

    int updateByPrimaryKey(LbImage record);*/
}