package com.maroti.hibernate.client;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert_Table_Table {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		String hql ="insert into NewCustomer(cid,cname,caddr) select c.cid, c.cname, c.caddr from OldCustomer c";
		Transaction tx=s.beginTransaction();
		Query q=s.createQuery(hql);
		q.executeUpdate();
		
		tx.commit();
		System.out.println("Success.................!");
		s.close();
		sf.close();
		
		
		
		
	}
	
}
