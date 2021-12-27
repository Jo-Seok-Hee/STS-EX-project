package com.sucky.ex.p02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sucky.ex.p02.model.UsedGoods;

@Repository
public interface UsedGoodsDAO {
	
	public List<UsedGoods> selectUsedGoodsList();
	
}
