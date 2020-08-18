package com.dxc.shopping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dxc.shopping.model.Product;
@Service
public class ProductService {
	
	
	private List<Product> listOfProduct;
	
	public List<Product> getListOfProduct() {
		return listOfProduct;
	}

	

	public List<Product> getProduct(){
		 
		Product product1=new Product(12,"Laptop",2,100000.0);
		Product product2=new Product(13,"mouse",20,2000.0);
		Product product3=new Product(14,"keyboard",10,5000.0);
		Product product4=new Product(15,"headphone",25,8000.0);
		Product product5=new Product(16,"microphone",15,5000.0);
		listOfProduct=new ArrayList<Product>();
		listOfProduct.add(product1);
		listOfProduct.add(product2);
		listOfProduct.add(product3);
		listOfProduct.add(product4);
		listOfProduct.add(product5);
		return listOfProduct;
	}

}
