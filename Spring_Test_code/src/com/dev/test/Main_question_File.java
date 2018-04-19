package com.dev.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main_question_File {

	public static void main(String[] args) {
		
		Resource res =  new ClassPathResource("applicationContext.xml");
		BeanFactory beean = new XmlBeanFactory(res);
		
		Question q = (Question)beean.getBean("q");
		q.display_info();
		
	}
}
