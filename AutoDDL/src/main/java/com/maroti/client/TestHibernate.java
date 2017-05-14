package com.maroti.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maroti.beans.Customer;

public class TestHibernate {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		Customer cst = new Customer();
		//cst.setId(101);
		cst.setName("Maroti");
		cst.setAddr("Nanded");
		s.save(cst);
		tx.commit();
		System.out.println("Success!!!!!!!!!!!!!!!!!!!!");
		s.close();
		
	}

}
