package com.dev.devloper;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main_class {
 public static void main(String[] args) {
	
	 Resource res =  new ClassPathResource("applicationContext.xml");
	 BeanFactory bes =  new XmlBeanFactory(res);
	 
	 Employee emp = (Employee)bes.getBean("a3");
	 emp.display_data();
}
}
