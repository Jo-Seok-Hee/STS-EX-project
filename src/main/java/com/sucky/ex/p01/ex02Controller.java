package com.sucky.ex.p01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ex02Controller {
	
	@RequestMapping("/p01/ex02/1")
	public String view() {
		return "p01/ex02";
	}
}
