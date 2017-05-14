package com.maroti.hibernate.client;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maroti.hibernate.beans.Voter;
import com.maroti.hibernate.beans.Voting;




public class Test {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Voter v = new Voter();
		v.setVid(101);
		v.setVname("Maroti");
		
		Voting vt = new Voting();
		vt.setVtid(201);
		vt.setPname("BJP");
		vt.setDate(new Date());
		vt.setVoter(v);
		
		s.save(v);
		s.save(vt);
		
		tx.commit();
		System.out.println("success......................!");
		s.close();
		sf.close();
		
		
	}

}
