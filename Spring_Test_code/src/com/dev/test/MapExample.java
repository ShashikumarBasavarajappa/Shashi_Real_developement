package com.dev.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.security.web.savedrequest.Enumerator;

public class MapExample {
	
	private int qid;
	private String qname;
	private Map<String, String> answers;
	
	public MapExample() {
		System.out.println("=====");
	}
	
	public MapExample(int qid, String qname, Map<String, String> answers) {
		super();
		this.qid =  qid;
		this.qname =  qname;
		this.answers = answers;
	}
	
	public void Map_display() {
		System.out.println("Q :" + qid);
		System.out.println("Q-Name : " +  qname);
		Set<Entry<String, String>> sss = answers.entrySet();
		Iterator<Entry<String, String>> test = sss.iterator();
		
		while(test.hasNext()) {
			Entry<String, String> enu = test.next();
			System.out.println(enu.getKey() + " " + enu.getValue());
		}
	}

}
