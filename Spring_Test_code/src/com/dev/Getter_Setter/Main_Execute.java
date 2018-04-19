package com.dev.Getter_Setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main_Execute {
	
	public static void main(String[] args) {
		
		Resource res =  new ClassPathResource("application_SETTER_GETTER.xml");
		BeanFactory bs =  new XmlBeanFactory(res);
		
		Test1 t1 =  (Test1)bs.getBean("a1");
		t1.display_data();
	}
	/*
	 * If we Have 3 Parameter then if we want pass those 3 paramters
	 *  then in constructor code we need to write seperate code for single two, three
	 *  paramter data
	 *  
	 *  But if YOur are Using the setter method, No need to Do Any Operation
	 *  
	 */
	
	/*
	 * Setter Method will Overide the Constructor method so that if you use both 
	 * Obviusly setter will execute.
	 * 
	 */
	
	
	/*
	 * Changes f you made anything then we need to do so much thing in constructor bean
	 * 
	 * But in the Setter mthod it will not create any new bean
	 * 
	 */

}
