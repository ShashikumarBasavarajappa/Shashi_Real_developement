package com.dev.Getter_Setter;

public class Test1 {
	private int id;
	private String name;
	private Address address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display_data() {
		System.out.println(id + " : " +  name + " "+ address.getAdd1() + " " +  address.getAdd2());
	}

}
