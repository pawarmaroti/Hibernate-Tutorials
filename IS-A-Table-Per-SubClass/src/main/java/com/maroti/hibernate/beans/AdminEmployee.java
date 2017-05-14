package com.maroti.hibernate.beans;

public class AdminEmployee extends Employee {

	private String bname;

	public AdminEmployee(int eid, String ename, String eaddr,String bname) {
		super(eid, ename, eaddr);
		this.bname=bname;
		// TODO Auto-generated constructor stub
	}
	
	public String getBname() {
		return bname;
	}
	
	public void setBname(String bname) {
		this.bname = bname;
	}
	
}
