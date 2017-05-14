package com.maroti.hibernate.beans;

public class OldCustomer {
	private int cid;
	
	private String cname;
	private String caddr;
	
	
	public OldCustomer()
	{
		
	}
	public OldCustomer(int cid, String cname, String caddr) {
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
