package com.dxc.junit;

import java.util.Scanner;

import com.dxc.junit.model.User;
import com.dxc.junit.service.LoginService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		User user = new User();
		LoginService loginsevice = new LoginService();

		System.out.println("Enter your username");
        user.setUsername(scanner.nextLine());
		System.out.println("Enter your password");
        user.setPassowrd(scanner.nextLine());
        
        boolean result = loginsevice.validatelogin(user);
        
        if (result) 
        	System.out.println("validation successfull");
        else
        	System.out.println("validation unsuccessfull");
        	
	}
}
