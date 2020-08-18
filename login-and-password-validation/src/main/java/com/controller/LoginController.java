package com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.LoginBean;
import com.service.LoginService;

@Controller
public class LoginController {
	
	
	@Autowired
	private LoginService service;

	
	@RequestMapping("/login")
	public String showLoginPage(@ModelAttribute("login") LoginBean login) {
		
		return "login";
	}
	@RequestMapping(value="/submitlogin",method=RequestMethod.POST)
	public String checkLoginDetails(@ModelAttribute("login") LoginBean login,BindingResult result) {
		
		if(result.hasErrors())
			return "login";
		else if(service.validate(login))
			return "success";
		return "invalid";
		
		
	}

}
