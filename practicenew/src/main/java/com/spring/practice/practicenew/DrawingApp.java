package com.spring.practice.practicenew;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(final String[] args) {

		final AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/*/*/spring.xml");
		final Triangle triangle = (Triangle)context.getBean("triangle1");
		context.registerShutdownHook();
		//		System.out.println(System.getProperty("java.class.path"));
		//		final ClassLoader cl = DrawingApp.class.getClassLoader();
		//		System.out.println(cl.getResource(".").toString());
		triangle.draw();

	}

}
