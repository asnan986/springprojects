package org.dxc.shopping.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.dxc.shopping.connection.ConnectionDB;
import org.dxc.shopping.controller.ProductController;
import org.dxc.shopping.model.Product;
import org.springframework.stereotype.Component;
@Component
public class ProductDao {
	public Logger logger=Logger.getLogger(ProductController.class.getName());
	 private Connection con;
	 private Statement statement;
	 private List<Product> listofproducts=new ArrayList<Product>();
	private Product product;
	 
	

	public ProductDao() {
		super();
		con = ConnectionDB.getConnection();
		// TODO Auto-generated constructor stub
		try {
			statement=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addNewProductDB(Product product) {
	logger.info("============addNewProductDB Dao layer=============");
	
	String sql ="insert into productdetailst value('"+product.getPid()+"','"+product.getPname()+"','"+product.getQuantity()+"','"+product.getPrice()+"')";
	int count=0;
	try {
		count = statement.executeUpdate(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if (count>0) {
		System.out.println("No of product inserted is "+count);
		

	}
	}

	public List<Product> getAllProduct() {
		{
			listofproducts.removeAll(listofproducts);
		try {
			statement = con.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from productdetailst");
			while(resultSet.next()) {
				
				product=new Product();
				product.setPid(resultSet.getInt("productid"));
				product.setPname(resultSet.getString("productname"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				listofproducts.add(product);
		} 
		}
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
		return listofproducts;
		
		}
		
		
	

}
