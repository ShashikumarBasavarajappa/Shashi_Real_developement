package com.dev.test;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String qname;
	private List<String> answers;

	public Question() {
		System.out.println("++++ default code here Man=====");
	}
	
	public Question(int id, String qname, List<String> answers) {
		this.id=id;
		this.qname =  qname;
		this.answers =  answers;
	}
	
	public void display_info() {
		System.out.println("Q:" + id + "Question = " + qname);
		Iterator itr = answers.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Check : " + itr.next());
		}		
	}
}
