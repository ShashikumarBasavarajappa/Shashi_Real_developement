package com.dev.test;

import java.util.Iterator;
import java.util.List;

public class Example2 {

	private int q1;
	private String qname;
	private List<Example1> l1;
	
	public Example2() {
		System.out.println("chekcing Main code");
	}
	
	public Example2(int q1, String qname, List<Example1> l1) {
		super();
		this.q1 =  q1;
		this.qname =  qname;
		this.l1 =  l1;
	}
	
	public void final_display_data() {
		System.out.println("Q:"+q1);
		System.out.println("Q Name :" + qname);
		
		Iterator ire = l1.iterator();
		while(ire.hasNext()) {
			System.out.println("C : " + ire.next());
		}
		
	}
}
