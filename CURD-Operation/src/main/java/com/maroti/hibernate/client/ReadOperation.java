package com.maroti.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maroti.hibernate.beans.Student;

public class ReadOperation {

public static void main(String[] args) {
	
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Student st = (Student)s.get(Student.class, 102);
		System.out.println("Student Roll : " + st.getSroll());
		System.out.println("Student Name : " + st.getSname());
		System.out.println("Student Addr : " + st.getSaddr());
		System.out.println("record updated succesfully");
		s.close();
		sf.close();
		
	
	
	
	
	
	
	
	}

}
