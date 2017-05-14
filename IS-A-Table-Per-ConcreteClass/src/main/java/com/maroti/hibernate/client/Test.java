package com.maroti.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maroti.hibernate.beans.AdminEmployee;
import com.maroti.hibernate.beans.Employee;
import com.maroti.hibernate.beans.HEmployee;
import com.maroti.hibernate.beans.SEmployee;

public class Test {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		SEmployee se = new SEmployee(101, "Maroti", "USA", "Java Developer");
		HEmployee he = new HEmployee(102, "Sunil", "Nanded", "10hrs");
		AdminEmployee ad = new AdminEmployee(103, "Adesh", "US", "HS Road");
		
		Transaction tx=s.beginTransaction();
		s.save(se);
		s.save(he);
		s.save(ad);
		System.out.println("Success............!");
		tx.commit();
		
		s.close();
		sf.close();
		
		
	}

}
