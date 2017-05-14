package com.maroti.hibernate.client;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maroti.hibernate.beans.NewCustomer;

public class UpdateRecords {
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
		
		/*NewCustomer oc1 = new NewCustomer(101, "Maroti", "Nanded");
		NewCustomer oc2 = new NewCustomer(102, "Prashant", "Pune");
		NewCustomer oc3 = new NewCustomer(103, "Jagruti", "USA");
		NewCustomer oc4 = new NewCustomer(104, "Mahesh", "Mumbai");
		
		s.save(oc1);
		s.save(oc2);
		s.save(oc3);
		s.save(oc4);
*
*
*/
		
		
		/*String hql="update from NewCustomer set cname='Donald' where cid=101";*/
		/*String hql="update from NewCustomer set cname='Donald', caddr='America' where cid=101";*/
		
		//primary key update also using hql is possible
		String hql="update from NewCustomer set cid=777,cname='Donald' where cid=101";
		
		Query q=s.createQuery(hql);
		q.executeUpdate();
		tx.commit();
		System.out.println("records update successfully..........!");
		s.close();
		sf.close();
		
	}

}
