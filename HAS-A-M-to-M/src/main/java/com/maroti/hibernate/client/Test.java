package com.maroti.hibernate.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maroti.hibernate.beans.Courses;
import com.maroti.hibernate.beans.Faculty;

public class Test {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Courses c1 = new Courses();
		Faculty f1 = new Faculty();
		Set<Courses> crs = new HashSet<Courses>();
		Set<Faculty> fc = new HashSet<Faculty>();
		
		f1.setFid(101);
		f1.setFname("Maroti");
		f1.setCourses(crs);
		
		c1.setCid(202);
		c1.setCname("Java");
		c1.setFaculty(fc);
		
		crs.add(c1);
		fc.add(f1);
			
		
		s.save(c1);
		s.save(f1);
		tx.commit();
		System.out.println("success......................!");
		s.close();
		sf.close();
		
		
	}

}
