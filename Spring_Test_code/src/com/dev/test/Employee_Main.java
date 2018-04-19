package com.dev.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Employee_Main {

	public static void main(String[] args) {
		
		Resource res =  new ClassPathResource("applicationContext.xml");
		BeanFactory bes = new XmlBeanFactory(res);
		
		Employee emp = (Employee)bes.getBean("emp");
		emp.display_data();
	}
}
