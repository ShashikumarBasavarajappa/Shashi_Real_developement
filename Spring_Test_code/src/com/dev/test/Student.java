package com.dev.test;

public class Student {
	public String name;
	Addreses add;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	Student(Addreses add){
		this.add =  add;
	}
	
	public void setAdd(Addreses add) {
		this.add = add;
	}
	
	public void display() {
		System.out.println("========= Hello === " +  name + "==" + add.address1 + "==" +  add.address2);
	}

}
