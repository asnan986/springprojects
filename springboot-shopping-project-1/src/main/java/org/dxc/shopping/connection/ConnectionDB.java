package org.dxc.shopping.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

	
	
private static Connection con;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("sql driver is loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String mySqlUrl ="jdbc:mysql://localhost:3306/productdetailsdb";
		String username ="root";
		String password = "root";
		
		try {
			con = DriverManager.getConnection(mySqlUrl, username, password);
			System.out.println("My sql connection is established");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
		
		
	}
}
