package com.spring.practice;

public class Lion implements Animal {
	String type;
	Integer weight;
	Integer speed;

	//	Lion(final String type,final int weight,final int speed){
	//		this.type=type;
	//		this.weight=weight;
	//		this.speed=speed;
	//	}
	//	Lion(final int weight,final int speed){
	//		type="carnivorousssssssss";
	//		this.weight=weight;
	//		this.speed=speed;
	//	}
	public String getType() {
		return type;
	}
	public void setType(final String type) {
		this.type = type;
	}
	public Integer getWeight() {
		return weight;
	}
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
		return "Lion [type=" + type + ", weight=" + weight + ", speed=" + speed + "]";
	}


}
