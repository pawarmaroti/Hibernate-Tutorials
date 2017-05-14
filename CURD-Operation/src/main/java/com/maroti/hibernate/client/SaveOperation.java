package com.maroti.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maroti.hibernate.beans.Student;

public class SaveOperation {
	
	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	SessionFactory sf=cfg.buildSessionFactory();
	
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	
	Student st = new Student();
	st.setSroll(105);
	st.setSname("Priyanka");
	st.setSaddr("Delhi");
	
	/*int id=(Integer)s.save(st);
	System.out.println(id);
	 */
	
	/*s.persist(st);
	*/
	
	s.saveOrUpdate(st);
	
	tx.commit();
	System.out.println("record inserted successfully");
	s.close();
	sf.close();
	
}
}
