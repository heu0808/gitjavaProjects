package com.kh.khanun;

public class Cat extends Animal {

	public Cat(String name,int age, String gender) {
		super(name,age,gender);
	}
	
	public void welcomeHome() {
		System.out.println("조용합니다.");
	}
	
	void makeSound() {
		System.out.println("야옹");
	}
}
