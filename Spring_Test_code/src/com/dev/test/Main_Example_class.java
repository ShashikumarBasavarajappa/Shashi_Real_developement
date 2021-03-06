package com.dev.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main_Example_class {

	public static void main(String[] args) {
		Resource res =  new ClassPathResource("applicationContext.xml");
		BeanFactory bes =  new XmlBeanFactory(res);
		Example2 emp3 = (Example2)bes.getBean("exam2");
		emp3.final_display_data();
	}
}
