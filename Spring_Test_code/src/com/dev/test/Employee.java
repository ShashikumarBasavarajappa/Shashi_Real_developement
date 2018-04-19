package com.dev.test;

public class Employee {
	
	private String name1;
	private int id;
	
	/*  Constructor way to design the code */
	
	public Employee() {
		System.out.println("=======");
	}
	
	public Employee(int id) {
		this.id = id;		
	}
	
	public Employee(String name1) {
		this.name1 =  name1;
	}
	public Employee(int id, String name1) {
		this.id = id;
		this.name1 = name1;
	}
	
	public void display_data() {
		System.out.println("====" + id + "====" +  name1);
	}

}
