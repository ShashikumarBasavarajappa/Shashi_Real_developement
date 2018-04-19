package com.dev.test;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class Student_Main {
	public static void main(String[] args) {
		
		System.out.println("----------------");
		
		Resource res =  new ClassPathResource("applicationContext.xml");
		BeanFactory bn = new XmlBeanFactory(res);
		
		Student st = (Student)bn.getBean("stud");
		st.display();
	}

}
