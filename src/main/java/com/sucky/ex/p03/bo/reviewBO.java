package com.sucky.ex.p03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sucky.ex.p03.dao.reviewDAO;

import com.sucky.ex.p03.model.model;

@Service
public class reviewBO {
	
	@Autowired
	private reviewDAO DAO;
	public model getReview(int id) {
		return DAO.selectReview(id);
	}
}
