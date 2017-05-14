package com.maroti.hibernate.beans;

public class HEmployee extends Employee {

	private String wh;

	public HEmployee(int eid, String ename, String eaddr,String wh) {
		super(eid, ename, eaddr);
		this.wh=wh;
		// TODO Auto-generated constructor stub
	}
	public String getWh() {
		return wh;
	}
	
	public void setWh(String wh) {
		this.wh = wh;
	}
	
	
	
}
