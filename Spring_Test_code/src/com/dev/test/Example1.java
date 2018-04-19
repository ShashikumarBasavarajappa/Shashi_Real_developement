package com.dev.test;

public class Example1 {
	
	String q1;
	String q2;
	String q3;
	
	public Example1() {
		System.out.println("==== default===");
	}
	
	public Example1(String q1, String q2, String q3) {
		super();
		this.q1 =  q1;
		this.q2 =  q2;
		this.q3 =  q3;
	}
	
	public String toString() {
		return q1 +" " + q2 + " " + q3;
	}

}
