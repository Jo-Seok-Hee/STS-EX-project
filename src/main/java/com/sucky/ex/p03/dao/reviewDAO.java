package com.sucky.ex.p03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sucky.ex.p03.model.model;

@Repository
public interface reviewDAO {
	
	//셀렉트
	public model selectReview(@Param("id")int id);
	
	//인써트 1번
	public int insertReview(
			@Param("storeId")int storeId
			,@Param("menu")String menu
			,@Param("userName")String userName
			,@Param("point")double point
			,@Param("review")String review
			
			);
	//인써트 2번
	public int insertReviewObject(model review);
}
