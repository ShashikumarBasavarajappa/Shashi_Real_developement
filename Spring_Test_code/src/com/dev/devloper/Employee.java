package com.dev.devloper;

public class Employee {
	private int id;
	private String nameing;
	private Address address;
	
	public Employee() {
		System.out.println("_---------_");
	}
	
	public Employee(int id, String nameing, Address address) {
		super();
		this.id =  id;
		this.nameing  = nameing;
		this.address = address;
	}
	
	public void display_data() {
		System.out.println("=========" +  id + " = " +  nameing + "= " + address);
	}
}
