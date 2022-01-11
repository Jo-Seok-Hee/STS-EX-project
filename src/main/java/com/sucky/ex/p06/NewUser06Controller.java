package com.sucky.ex.p06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sucky.ex.p04.bo.NewUserBO;

@Controller
public class NewUser06Controller {
	
	@Autowired
	private NewUserBO newUserBO;
	
	@GetMapping("/p06/ex01/addUserView")
	public String ex01() {
		return "/p06/addUser";
	}
	
	@ResponseBody
	@PostMapping("/p06/ex01/addUser")
	public String ex01InsertDate(
			@RequestParam("name")String name
			, @RequestParam("yyyyMMdd")String yyyyMMdd
			, @RequestParam("introduce")String introduce
			, @RequestParam("email")String email
			) {
		int count = newUserBO.addNewUser(name, yyyyMMdd, introduce, email);
		

		if(count == 1 ) {
			return "success";
		} else {
			return "fail";
		}
	}
}
