package com.maroti.hibernate.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyGenerator implements IdentifierGenerator {

	public Serializable generate(SharedSessionContractImplementor s,
			Object arg1) throws HibernateException {
		// TODO Auto-generated method stub
		String eid="MAROTI";
		try {
		
			Connection con=s.connection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select mar_seq.nextval from dual");
			if(rs.next())
			{
				eid=eid+rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return eid;
	}

}
