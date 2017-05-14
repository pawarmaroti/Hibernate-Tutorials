package com.maroti.hibernate.beans;

public class NewCustomer {
	private int cid;
	private String cname;
	private String caddr;
	
	
	public NewCustomer()
	{
		
	}
	public NewCustomer(int cid, String cname, String caddr) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddr = caddr;
	}
	
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
	public String getCaddr() {
		return caddr;
	}
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
	
	
	

}
