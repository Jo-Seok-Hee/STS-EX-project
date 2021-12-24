package com.sucky.ex.p01;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/p01/ex01")
public class ex01RestController {
	
	@RequestMapping("/3")
	public String printString() {
		return "RestController �׽�Ʈ";
	}
	
	@RequestMapping("/4")
	public Data printData() {
		Data data = new Data();
		data.setId(10);
		data.setName("서키");
		
		return data;
	}
	
	@RequestMapping("/5")
	public ResponseEntity<Data> entity(){
		Data data = new Data();
		data.setId(5);
		data.getId();
		data.setName("서키서키");
		
		ResponseEntity<Data> entity = new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
	
	
	
	
	
	
	
}
