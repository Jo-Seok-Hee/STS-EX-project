package com.sucky.ex.p04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewUserController {
	
	@RequestMapping("/p04/ex01")
	public String addUserView() {
		return "/p04/addUser";
	}
	
	@RequestMapping("/p04/ex01/addUser")
	public String addUser(
			@RequestParam("name") String name
			, @RequestParam("yyyyMMdd") String yyyyMMdd
			, @RequestParam("introduce") String introduce
			, @RequestParam("email") String email
			) {
		
		return "이름 : "+ name +"\n생년월일 : "+yyyyMMdd+"\n자기소개 : "+introduce+"\n이메일 : "+email; 
	}

}
