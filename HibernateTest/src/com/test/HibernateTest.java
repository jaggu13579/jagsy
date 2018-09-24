package com.test;

import org.hibernate.Session;

public class HibernateTest {

	public static void main(String [] args){
		Session s = AppConfig.getSessionFactory().openSession();
		s.beginTransaction();
		
		CustomerDetails cd = new CustomerDetails();
		cd.setFirstName("jags");
		cd.setAge(25);
		cd.setLastName("adds");
		cd.setId(12);
		
		s.save(cd);
		s.getTransaction().commit();
		s.close();
		AppConfig.getSessionFactory().close();
	}
}
