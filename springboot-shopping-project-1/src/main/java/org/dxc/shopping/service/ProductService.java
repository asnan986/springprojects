package org.dxc.shopping.service;



import java.util.List;

import org.dxc.shopping.dao.ProductDao;
import org.dxc.shopping.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
    @Autowired
	ProductDao productDao;
   
	
	
	public void addnewproduct(Product product) {
		productDao.addNewProductDB(product);
		
	}


	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		
		
		return productDao.getAllProduct();
	}
}
