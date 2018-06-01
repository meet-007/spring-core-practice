package com.spring.practice.practicenew;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean {
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(final List<Point> points) {
		this.points = points;
	}

	void draw() {
		// System.out.println("point A =" + "x is " + pointA.getX() +" , " + "y is " +
		// pointA.getX() );
		// System.out.println("point B =" + "x is " + pointB.getX() +" , " + "y is " +
		// pointB.getX() );
		// System.out.println("point C =" + "x is " + pointC.getX() +" , " + "y is " +
		// pointC.getX() );

		/** now iterate over list of points */

		for (final Point point : points) {
			System.out.println("point  =" + "x is " + point.getX() + " , " + "y is " + point.getY());
		}

	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("spring dependent method , triangle is now destroyed");
	}



	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("spring dependent method , triangle properties are set");
	}
	public void myDestroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("spring independent method , triangle is now destroyed");
	}



	public void myInit() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("spring	 independent method , triangle properties are set");
	}

	@PostConstruct
	public void jsrTriangleInit() {
		System.out.println("spring independent jsr-250 annotation inti method");
	}

	@PreDestroy
	public void jsrTriangleDestroy() {
		System.out.println("spring independent jsr-250 annotation destroy method");

	}
}
