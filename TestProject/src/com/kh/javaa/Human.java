package com.kh.javaa;

public class Human {
	//필드
	int age;
	char gender;
	String name;
	String addr;
	
	//생성자
	public Human() {
		
	}
	public Human(int wo,char g,String n,String ad) {
		age = wo;
		gender = g;
		name = n;
		addr = ad;
	}
	
	//메서드
	public void Humanage(int number) {
		System.out.println("나이 : "+age);
	}
	
	public void Humangender(char gen) {
		System.out.println("성별 : "+gender);
	}
	
	public void Humanname(String na) {
		System.out.println("이름 : "+name);
	}
	
	public void Humanaddr(String ad) {
		System.out.println("주소 : "+addr);
	}
	
}
