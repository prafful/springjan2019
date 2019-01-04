package com.spring.multiple.pojo;

public class Friend {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void initilizeMethod() {
		System.out.println("I am in init-method of Friend. I can do any intializations here!");
		
	}
	
	public void destroyMethod() {
		System.out.println("I am in destroy method of Friend.");
	}
	

}
