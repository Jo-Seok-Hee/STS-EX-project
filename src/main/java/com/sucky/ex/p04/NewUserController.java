package com.sucky.ex.p04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sucky.ex.p04.bo.NewUserBO;
import com.sucky.ex.p04.model.NewUser;

@Controller
public class NewUserController {
	
	@RequestMapping("/p04/ex01")
	public String addUserView() {
		return "/p04/addUser";
	}
	
	@RequestMapping("/p04/ex01/addUser")
	public String addUser(
			@RequestParam("name") String name
			, @RequestParam("yyyymmdd") String yyyymmdd
			, @RequestParam("introduce") String introduce
			, @RequestParam("email") String email
			) {
		
		return "이름 : "+ name +"\n생년월일 : "+yyyymmdd+"\n자기소개 : "+introduce+"\n이메일 : "+email; 
	}
	
	@Autowired
	private NewUserBO newUserBO;
	
	@ResponseBody
	@RequestMapping("/p04/ex01/addUser2")
	public String ex01(
			@RequestParam("name")String name
			, @RequestParam("yyyymmdd")String birth
			, @RequestParam("introduce")String introduce
			, @RequestParam("email")String email) {
		int count = newUserBO.addNewUser(name, birth, introduce, email);
		
		return "성공 : " + count;
	}
	
	@ResponseBody
	@RequestMapping("/p04/ex01/id")
	public NewUser id(@RequestParam("id")int id) {
		
		return newUserBO.getNewUser(id);
		
	}
	
	
	@RequestMapping("/p04/ex01/model")
	public String view(Model model) {
		
		NewUser user = new NewUser();
		user = newUserBO.getNewUser(10);
		model.addAttribute("result", user);
		model.addAttribute("info","사용자 정보");
		
		
		return "/p04/userInfo";
	}
	
}
