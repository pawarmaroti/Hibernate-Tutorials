package com.maroti.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maroti.hibernate.beans.OldCustomer;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf=null;
		Session s=null;
		
		try {

			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			sf=cfg.buildSessionFactory();
			s=sf.openSession();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Transaction tx=s.beginTransaction();
		
		OldCustomer oc1 = new OldCustomer(101, "Maroti", "Nanded");
		OldCustomer oc2 = new OldCustomer(102, "Prashant", "Pune");
		OldCustomer oc3 = new OldCustomer(103, "Jagruti", "USA");
		OldCustomer oc4 = new OldCustomer(104, "Mahesh", "Mumbai");
		
		s.save(oc1);
		s.save(oc2);
		s.save(oc3);
		s.save(oc4);
		
		tx.commit();
		System.out.println("records inserted successfully..........!");
		s.close();
		sf.close();
		
	}

}
