package com.dev.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dev.model.Employee;

public class Test2_Example {
	public static void main(String[] args) {
		Configuration config =  new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sss =  config.buildSessionFactory();
		Session opedd  = sss.openSession();
		
		Transaction tt = opedd.beginTransaction();
		
		Employee e3 = new Employee();
		e3.setId(2);
		e3.setFirstName("shashi");
		e3.setLastName("Kumar");

		opedd.persist(e3);
		tt.commit();
		
	}
}
