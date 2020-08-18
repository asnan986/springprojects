package com.service;

import org.springframework.stereotype.Service;

import com.bean.LoginBean;
@Service
public class LoginService {
	
	
	public boolean validate(LoginBean loginBean) {
		
	 if(loginBean.getUserName().equals(loginBean.getPassword()))
	 { if (loginBean.getUserName().isEmpty())
		 return false;
		 return true;
	 }
			
	 return false;
			 
		}

}
