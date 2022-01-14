package com.sucky.ex.p06;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	@PostMapping("/p06/pr01/addFavorites")
	public String pr01Insert(
			@RequestParam("name")String name
			, @RequestParam("url")String url
			
			) {
		
		int count = favoritesBO.addFavorites(name, url);
		
		if(count == 1) {
			return "success";
		} else {
			return "fail";
		}
		
	}
	
	
	@GetMapping("/p06/pr01/select")
	public String pr01Select(Model model) {
		
		List<Favorites> favorites = new ArrayList<>();
		
		favorites = favoritesBO.getFavorites();
		
		model.addAttribute("favorites", favorites);
		
		return "/p06/favoritesResult";
	}
	
	@ResponseBody
	@PostMapping("/p06/pr01/duplicate")
	public String pr01Duplicate(@RequestParam(value="url", required=false)String url) {
		
		
		
		if(favoritesBO.checkDuplicate(url) == false) {
			return "success";
		} else {
			return "fail";
		}
	}
	
	@ResponseBody
	@GetMapping("/p06/pr01/delete")
	public String pr01Delete(@RequestParam("id")int id) {
		int count = favoritesBO.deleteFavorId(id);
		
		if(count == 0) {
			return "fail";
		} else {
			return "success";
		}
		
	}
}
