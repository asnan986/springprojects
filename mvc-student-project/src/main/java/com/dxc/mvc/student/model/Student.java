package com.dxc.mvc.student.model;

public class Student {
	
	private String sname;
	private int sid;
	private String sdept;
	private float sCgpa;
	public Student(String sname, int sid, String sdept, float sCgpa) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.sdept = sdept;
		this.sCgpa = sCgpa;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	public float getsCgpa() {
		return sCgpa;
	}
	public void setsCgpa(float sCgpa) {
		this.sCgpa = sCgpa;
	}
	
	

}
