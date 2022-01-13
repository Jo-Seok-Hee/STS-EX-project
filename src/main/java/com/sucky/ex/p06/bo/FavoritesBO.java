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
	
	public boolean checkDuplicate(String url) {
		int count = favoritesDAO.duplicateName(url);
		
		if(count == 0) {  // 웹페이지에서 받은 String name 파라미터가 db에있는 이름과 일치하는게 없음
			return false;
		} else {
			return true; // 중복된 이름을 가지고있음 
		}
	}
	
	public int deleteFavorId(int id) {
		
		return favoritesDAO.deleteId(id);
		
	}
}
