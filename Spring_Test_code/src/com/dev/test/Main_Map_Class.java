package com.dev.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main_Map_Class {
	public static void main(String[] args) {
		Resource res =  new ClassPathResource("applicationContext.xml");
		BeanFactory b =  new XmlBeanFactory(res);
		
		MapExample mp = (MapExample)b.getBean("m");
		mp.Map_display();
		
	}
}
