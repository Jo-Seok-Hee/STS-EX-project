package com.sucky.ex.p06.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritesDAO {
	
	public int insertFavorites(
			@Param("name")String name
			, @Param("url")String url
			);
}
