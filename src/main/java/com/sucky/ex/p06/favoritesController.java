package com.sucky.ex.p06;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sucky.ex.p06.bo.FavoritesBO;
import com.sucky.ex.p06.model.Favorites;

@Controller
public class favoritesController {
	
	@Autowired
	private FavoritesBO favoritesBO;
	
	@GetMapping("/p06/pr01/favoritesView")
	public String pr01() {
		
	
		
		return "/p06/favorites";
	}
	
	@ResponseBody
	@GetMapping("/p06/pr01/addFavorites")
	public String pr01Insert(
			@RequestParam("name")String name
			, @RequestParam("url")String url
			
			) {
		
		favoritesBO.addFavorites(name, url);
		
		return "http://localhost:8080/p06/pr01/select";
	}
	
	
	@GetMapping("/p06/pr01/select")
	public String pr01Select(Model model) {
		
		List<Favorites> favorites = new ArrayList<>();
		
		favorites = favoritesBO.getFavorites();
		
		model.addAttribute("favorites", favorites);
		
		return "/p06/favoritesResult";
	}
}
