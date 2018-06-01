package com.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValidatonDemo {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		final ApplicationContext context =new  ClassPathXmlApplicationContext("spring2.xml");
		final Person person = (Person)context.getBean("person");
		final PersonValidator pvalidator = (PersonValidator)context.getBean("personValidator");
		System.out.println(pvalidator.supports(person.getClass()));
		person.setAge(-1);
		person.setName("");
		pvalidator.validate(person);
		//		System.out.println(pvalidator.validate(person,new error));
	}

}
