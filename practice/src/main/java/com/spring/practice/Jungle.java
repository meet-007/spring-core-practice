package com.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Jungle
{
	public static void main( final String[] args )
	{
		final ApplicationContext context = new  ClassPathXmlApplicationContext("spring.xml");
		final Animal animal = (Animal)context.getBean("tiger");
		System.out.println(animal);
	}
}
