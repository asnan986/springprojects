package com.dxc.shopping.model;


public class Product {
	
private int pid;
private String pname;
private int quantity;
private double price;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Product(int pid, String pname, int quantity, double price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.quantity = quantity;
	this.price = price;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}


	

}
