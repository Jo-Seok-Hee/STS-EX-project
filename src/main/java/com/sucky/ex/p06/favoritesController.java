package com.sucky.ex.p06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sucky.ex.p06.bo.FavoritesBO;

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
		
		int count = favoritesBO.addFavorites(name, url);
		
		return "성공 : "+count;
	}
	
}
