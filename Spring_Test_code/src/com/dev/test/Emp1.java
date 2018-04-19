package com.dev.test;

import javax.mail.Address;

public class Emp1 {
	private String name1;
	private String name2;
	private Addreses addr;
	
	public Emp1() {
		System.out.println("+=========+");
	}
	
	public Emp1(String name1, String name2, Addreses addr){
		super();
		this.name1 =  name1;
		this.name2 =  name2;
		this.addr  =   addr;
	}
	
	public void display() {
		System.out.println("=====" +  name1 + " " +  name2 + " " + addr.toString());
	}
	
}
