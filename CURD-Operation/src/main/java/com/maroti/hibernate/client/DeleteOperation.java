package com.maroti.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maroti.hibernate.beans.Student;

public class DeleteOperation {

public static void main(String[] args) {
	
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
	
		Student st=(Student)s.get(Student.class, 101);
		
		s.delete(st);
		tx.commit();
		System.out.println("record deleted succesfully");
		s.close();
		sf.close();
		
	
	
	
	
	
	
	
	}

}
