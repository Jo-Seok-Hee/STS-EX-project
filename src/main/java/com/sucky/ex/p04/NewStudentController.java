package com.sucky.ex.p04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sucky.ex.p04.bo.NewStudentBO;
import com.sucky.ex.p04.model.NewStudent;

@Controller
public class NewStudentController {
	
	@Autowired
	private NewStudentBO newStudentBO;
	
	@RequestMapping("/p04/ex02/view")
	public String firstView() {
		return "/p04/newStudent";
	}
	
	
	@PostMapping("/p04/ex02/addStudent")
	public String addStudent(
			@ModelAttribute NewStudent newStudent
			,Model model) {
		
		int count = newStudentBO.addStudent(newStudent);
		
		model.addAttribute("result", newStudent);
		return "/p04/NewStudentInfo";
	}
}
