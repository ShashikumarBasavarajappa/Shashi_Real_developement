package com.dev.controller;
import org.hibernate.*;  
import org.hibernate.cfg.*;  
import com.dev.model.Employee1;

public class Annotation_Example {
	public static void main(String[] args) {
		
	
		 AnnotationConfiguration cfg =  new AnnotationConfiguration();
		 
		 Session session =  cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		 
		 Transaction t1 =  session.beginTransaction();
		Employee1 e3 = new Employee1();
		e3.setId(2);
		e3.setFirstName("Jakkali");
		e3.setLastName("Shashi");
		
		session.persist(e3);
		t1.commit();
	}

}
