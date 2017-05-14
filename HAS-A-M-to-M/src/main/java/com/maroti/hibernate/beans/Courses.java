package com.maroti.hibernate.beans;

import java.util.Date;
import java.util.Set;

public class Courses {
	private int cid;
	private String cname;
	private Set<Faculty> faculty;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set<Faculty> getFaculty() {
		return faculty;
	}
	public void setFaculty(Set<Faculty> faculty) {
		this.faculty = faculty;
	}
	

	}
