package com.spring.spring_intro;

import org.springframework.beans.factory.BeanNameAware;
public class Circle implements Shape,BeanNameAware {
	private Point center;

	//
	//	@Autowired
	//	public void settingCircle(final Point center1) {
	//		// TODO Auto-generated constructor stub
	//		center = center1;
	//	}
	public Point getCenter() {
		return center;
	}

	//	@Qualifier("cirleRelated")
	public void setCenter(final Point center) {
		this.center = center;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawn circle with center "+center.getX()+","+center.getY());

	}

	public void setBeanName(final String name) {
		// TODO Auto-generated method stub
		System.out.println("bean name is ="+name);
	}

}
