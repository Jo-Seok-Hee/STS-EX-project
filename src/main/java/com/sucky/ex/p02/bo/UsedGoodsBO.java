package com.sucky.ex.p02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sucky.ex.p02.model.UsedGoods;
import com.sucky.ex.p02.dao.UsedGoodsDAO;

@Service
public class UsedGoodsBO {
	
	@Autowired  //싱글턴 객체 생성법  
	private UsedGoodsDAO usedGoodsDAO;
	
	public List<UsedGoods> getUsedGoodsList(){
		
		return usedGoodsDAO.selectUsedGoodsList();
		
	}
}
