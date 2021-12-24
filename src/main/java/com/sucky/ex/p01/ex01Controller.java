package com.sucky.ex.p01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/p01/ex01")
public class ex01Controller {
	@ResponseBody
	@RequestMapping("/1")
	public String printString() {
		
		return "Spring  response";
	}
	
	@ResponseBody
	@RequestMapping("/2")
	public Map<String,Integer> printMap(){
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("apple", 1000);
		map.put("orange", 1500);
		map.put("banana", 2000);
		
		return map;
		
		
	}
}
