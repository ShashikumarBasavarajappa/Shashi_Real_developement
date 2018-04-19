package com.dev.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Emp1_Impl {
	public static void main(String[] args) {
		
		Resource rr =  new ClassPathResource("applicationContext.xml");
		BeanFactory bb =  new XmlBeanFactory(rr);
		Emp1 mp = (Emp1)bb.getBean("Check");
		mp.display();
	}
}
