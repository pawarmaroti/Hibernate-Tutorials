package com.maroti.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maroti.hibernate.beans.Student;

public class UdateOperation {
	
	
	public static void main(String[] args) {
	
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Student st = new Student();
		st.setSroll(101);
		st.setSname("Mahesh");
		st.setSaddr("Andman");
		/*s.update(st);*/
		
		s.merge(st);
		tx.commit();
		System.out.println("record updated succesfully");
		s.close();
		sf.close();
		
	
	
	
	
	
	
	
	}

}
