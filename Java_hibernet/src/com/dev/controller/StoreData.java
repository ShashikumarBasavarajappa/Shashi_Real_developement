package com.dev.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dev.model.Employee;  

public class StoreData {
	public static void main(String[] args) {
		System.out.println("*************");
		 Configuration cfg=new Configuration();  
		 cfg.configure("hibernate.cfg.xml");
		 
		 SessionFactory sfg = cfg.buildSessionFactory();
		 
		 Session ss = sfg.openSession();
		  Transaction t = ss.beginTransaction();
		  Employee e1 =  new Employee();
		  e1.setId(1);
		  e1.setFirstName("sssssss");
		  e1.setLastName("asdasd");
		  ss.persist(e1);
		 t.commit();
		 ss.close();
		 
		 System.out.println("=====================");
	}

}
