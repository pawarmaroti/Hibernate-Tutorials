package com.maroti.hibernate.beans;

public class SEmployee extends Employee {
	private String role;

	public SEmployee(int eid, String ename, String eaddr, String role) {
		super(eid, ename, eaddr);
		this.role=role;
	
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
}
