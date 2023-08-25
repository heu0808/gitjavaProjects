package com.kh.io;

public class Car {
	int speed;
	String type;
	int price;
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public String getType() {
		return type;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return speed + type + price;
	}
}
