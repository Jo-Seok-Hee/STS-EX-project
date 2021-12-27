package com.sucky.ex.p02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sucky.ex.p02.bo.UsedGoodsBO;
import com.sucky.ex.p02.model.UsedGoods;

@RestController
public class UsedGoodsRestController {
	
	@Autowired
	private UsedGoodsBO usedGoodsBO;
	
	@RequestMapping("/p02/ex01")
	public List<UsedGoods> ex01() {
		
		return usedGoodsBO.getUsedGoodsList();
	}
}
