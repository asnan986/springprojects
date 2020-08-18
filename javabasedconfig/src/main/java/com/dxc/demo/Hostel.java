package com.dxc.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Hostel {
	
	private String hostelname;
	private String hostelLocation;
	private int hostelRooms;
	private int hostelmembers;
	public Hostel(String hostelname, String hostelLocation, int hostelRooms, int hostelmembers) {
		super();
		this.hostelname = hostelname;
		this.hostelLocation = hostelLocation;
		this.hostelRooms = hostelRooms;
		this.hostelmembers = hostelmembers;
	}
	public Hostel() {
		// TODO Auto-generated constructor stub
	}
	public String getHostelname() {
		return hostelname;
	}
	public String getHostelLocation() {
		return hostelLocation;
	}
	public int getHostelRooms() {
		return hostelRooms;
	}
	public int getHostelmembers() {
		return hostelmembers;
	}
	@Value("Mili")
	public void setHostelname(String hostelname) {
		this.hostelname = hostelname;
	}@Value("near nss college of engg, Palakkad")
	public void setHostelLocation(String hostelLocation) {
		this.hostelLocation = hostelLocation;
	}@Value("5")
	public void setHostelRooms(int hostelRooms) {
		this.hostelRooms = hostelRooms;
	}
	@Value("20")
	public void setHostelmembers(int hostelmembers) {
		this.hostelmembers = hostelmembers;
	}
	
	

}
