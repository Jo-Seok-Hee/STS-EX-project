package com.sucky.ex.p05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class p05Controller {
	
	@GetMapping("/p05/ex01")
	public String ex01() {
		return "/p05/ex01";
	}
	
	
	@GetMapping("/p05/ex02")
	public String ex02(Model model) {
		
		//과일이름 리스트
		List<String> fruits = new ArrayList<>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("멜론");
		fruits.add("복숭아");
		fruits.add("파인애플");
		model.addAttribute("fruits", fruits);
		
		List<Map<String, Object>> users = new ArrayList<>();
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("name", "서키");
		map.put("age", 29);
		map.put("hobby", "댄스");
		
		users.add(map);
		
		map = new HashMap<>();
		map.put("name", "처키");
		map.put("age", 20);
		map.put("hobby", "바둑");
		
		users.add(map);
		
		model.addAttribute("users",users);
		
		return "/p05/ex02"; 
	}
	
	@GetMapping("/p05/ex03")
	public String ex03() {
		return "/p05/ex03";
	}
	
	
}
