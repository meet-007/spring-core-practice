package com.spring.spring_intro;

import org.springframework.core.PriorityOrdered;

public class Point2<num extends String> implements PriorityOrdered{
	private num x;
	private num y;
	public num getX() {
		return x;
	}
	public void setX(final num x) {
		this.x = x;
	}
	public num getY() {
		return y;
	}
	public void setY(final num y) {
		this.y = y;
	}
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}



}
