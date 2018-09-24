package com.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class AppConfig {

	private static SessionFactory sessionFactory;
	
	static {
		try{
			
			sessionFactory = new AnnotationConfiguration().configure()
					.buildSessionFactory();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
