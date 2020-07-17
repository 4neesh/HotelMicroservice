package com.aneesh;

public class Customer {

	String name;
	String room;
	int age;
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", room=" + room + ", age=" + age + "]";
	}

	public Customer(String name, String room, Integer age) {
		super();
		this.name = name;
		this.room = room;
		this.age = age;
	}
	
}
