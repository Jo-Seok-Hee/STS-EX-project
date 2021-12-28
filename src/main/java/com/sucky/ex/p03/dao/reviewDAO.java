package com.sucky.ex.p03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sucky.ex.p03.model.model;

@Repository
public interface reviewDAO {
	
	public model selectReview(@Param("id")int id);
}
