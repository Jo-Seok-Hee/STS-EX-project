package com.sucky.ex.p06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sucky.ex.p06.dao.FavoritesDAO;
import com.sucky.ex.p06.model.Favorites;

@Service
public class FavoritesBO {

	@Autowired
	private FavoritesDAO favoritesDAO;
	
	public int addFavorites(String name, String url) {
		return favoritesDAO.insertFavorites(name, url);
	}
	
	public List<Favorites> getFavorites() {
		return favoritesDAO.selectFavorites();
	}
}
