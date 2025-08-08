package com.tnsif.springcore2;

import org.springframework.stereotype.Component;

@Component

public class Student {
	private String name ="Rags";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void showStudent() {
		System.out.println("Student Name:" + name);
	}
		
	}


