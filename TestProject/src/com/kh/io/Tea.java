package com.kh.io;

public class Tea {
	String type;
	int price;
	String efficacy;
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setEfficacy(String efficacy) {
		this.efficacy = efficacy;
	}
	
	public String getType() {
		return type;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getEfficacy() {
		return efficacy;
	}
	
	public String toString() {
		return type + price + efficacy;
	}
}
