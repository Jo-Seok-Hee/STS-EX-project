package com.sucky.ex.p03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sucky.ex.p03.bo.reviewBO;
import com.sucky.ex.p03.model.model;

@RestController
public class reviewController {
	
	@Autowired
	private reviewBO BO;
	
	@RequestMapping("/p03/ex01")
	public model ex01(@RequestParam("id")int id) {
		return BO.getReview(id);
	}
}
