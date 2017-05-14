package com.maroti.hibernate.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maroti.hibernate.beans.NewCustomer;

public class SelectRecords {
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
		
		//Unique Result
		/*String hql="from NewCustomer where id=102";
	
		Query q=s.createQuery(hql);
		Object o=q.uniqueResult();
		NewCustomer nc = (NewCustomer)o;
		System.out.println(nc.getCid());
		System.out.println(nc.getCname());
		System.out.println(nc.getCaddr());
	*/	
		
	
		
		//multiple records
		
		String hql="from NewCustomer";
		Query q=s.createQuery(hql);
		
		List<NewCustomer> nc=q.list();
		
		for(NewCustomer nc1 :nc)
		{
			System.out.println(nc1.getCid());
			System.out.println(nc1.getCname());
			System.out.println(nc1.getCaddr());
		}
		
		
		s.close();
		sf.close();
		
	}

}
