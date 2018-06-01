package com.spring.practice;

import org.springframework.beans.factory.annotation.Required;

public class Tiger implements Animal {
	String type;
	Integer weight;
	Integer speed;

	public String getType() {
		return type;
	}
	public void setType(final String type) {
		this.type = type;
	}
	public Integer getWeight() {
		return weight;
	}

	@Required
	public void setWeight(final Integer weight) {
		this.weight = weight;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(final Integer speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Tiger asdsdf [type=" + type + ", weight=" + weight + ", speed=" + speed + "]";
	}
}
