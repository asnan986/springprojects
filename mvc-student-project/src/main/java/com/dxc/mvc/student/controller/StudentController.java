package com.dxc.mvc.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("/")
	public String showindexpage() {
		
		return "index";
		
	}
	@RequestMapping("/addstudent")
	public String showaddstudent(){
		return "addstudent";
	}

}
