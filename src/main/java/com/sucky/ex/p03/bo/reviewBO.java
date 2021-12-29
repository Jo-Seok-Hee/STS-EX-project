package com.sucky.ex.p03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sucky.ex.p03.dao.reviewDAO;

import com.sucky.ex.p03.model.model;

@Service
public class reviewBO {
	
	@Autowired
	private reviewDAO DAO;
	
	//셀렉트
	public model getReview(int id) {
		return DAO.selectReview(id);
	}
	
	//인설트 1번
	public int addReview(int storeId, String menu, String userName, double point, String review) {
		
		return DAO.insertReview(storeId, menu, userName, point, review);
	}
	//인설트 2번
	public int addReviewObject(model review) {
		
		return DAO.insertReviewObject(review);
	}
}
