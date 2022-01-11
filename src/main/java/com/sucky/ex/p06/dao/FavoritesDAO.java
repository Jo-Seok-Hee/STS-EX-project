package com.sucky.ex.p06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sucky.ex.p06.model.Favorites;

@Repository
public interface FavoritesDAO {
	
	public int insertFavorites(
			@Param("name")String name
			, @Param("url")String url
			);
	
	public List<Favorites> selectFavorites();
}
