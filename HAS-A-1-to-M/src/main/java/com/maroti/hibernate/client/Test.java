package com.maroti.hibernate.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maroti.hibernate.beans.Actor;
import com.maroti.hibernate.beans.Movies;



public class Test {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Movies m1 = new Movies();
		m1.setMid(101);
		m1.setMname("Bahubali-1");
		
		Movies m2 = new Movies();
		m2.setMid(102);
		m2.setMname("Bahubali-2");
		
		Set<Movies> set = new HashSet<Movies>();
		set.add(m1);
		set.add(m2);
		
		Actor a = new Actor();
		a.setAid(111);
		a.setAname("Prabhas");
		a.setMovies(set);
		
		s.save(a);
		s.save(m1);
		s.save(m2);
		tx.commit();
		System.out.println("success......................!");
		s.close();
		sf.close();
		
		
	}

}
