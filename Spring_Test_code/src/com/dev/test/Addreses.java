package com.dev.test;

public class Addreses {
	
	String address1;
	String address2;
	
	
	public Addreses(String address1, String address2) {
		super();
		this.address1 =  address1;
		this.address2 = address2;
	}
	
	public String toString() {
		return address1+" "+ address2;
	}
}
