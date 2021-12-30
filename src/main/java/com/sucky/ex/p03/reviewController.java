package com.sucky.ex.p03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sucky.ex.p03.bo.reviewBO;
import com.sucky.ex.p03.model.model;

@RestController
public class reviewController {
	
	//스프링한테 객체선언 떠넘기기
	@Autowired
	private reviewBO BO;
	
	//셀렉트 리뷰
	@RequestMapping("/p03/ex01")
	public model ex01(@RequestParam("id")int id) {
		return BO.getReview(id);
	}
	//인써트 리뷰
	@RequestMapping("/p03/ex02")
	public String ex02(@RequestParam("storeId")int storeId) {
		
		// 인써트 내용
		// `storeId` = 4 , 콤비네이션 , 조서키 , 5.0 , 개맛잇어요
		//인서트 1번
		int count = BO.addReview(storeId, "김치피자", "조인성", 0.5, "뒤집어졋어요");
		
		//인서트 2번
//		model review = new model();
//		review.setStoreId(4);
//		review.setMenu("핫치킨피자");
//		review.setUserName("엄지");
//		review.setPoint(4.0);
//		review.setReview("마싯서요");
//		
//		int count = BO.addReviewObject(review);
		return "입력 결과" + count ;
	}
}
