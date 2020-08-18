package com.dxc.aop.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;


public class ProductService {

	public int addProduct(int a, int b) {
		return a + b;
	}

	public int addProduct1(int a, int b) {
		return a + b;
	}

	public void getProduct() {
		throw new ArithmeticException();
	}

	public String delayProduct() {
		try {
			TimeUnit.SECONDS.sleep((long) 5.0);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		return "product delay due to corona";

	}

}
