package com.spring.spring_intro;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan(basePackages = "com.spring.spring_intro")
@Profile("prod")
public class AppJavaConfig {

	@Bean("triangle")
	Shape Triangle(final Point pointA,final Point pointB,final Point pointC) {
		final Triangle triangle = new Triangle();
		triangle.setPointA(pointA);
		triangle.setPointB(pointB);
		triangle.setPointC(pointC);
		return triangle;
	}

	@Bean
	public Point pointA() {
		final Point center = new Point();
		center.setX(3);
		center.setY(5);
		return center;
	}


	@Bean
	public Point pointB() {
		final Point center = new Point();
		center.setX(3);
		center.setY(6);
		return center;
	}


	@Bean
	public Point pointC() {
		final Point center = new Point();
		center.setX(4);
		center.setY(4);
		return center;
	}
}
