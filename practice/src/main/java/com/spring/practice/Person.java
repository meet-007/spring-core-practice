package com.spring.practice;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(final int age) {
		this.age = age;
	}

	// the usual getters and setters...


}