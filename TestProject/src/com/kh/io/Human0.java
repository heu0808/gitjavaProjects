package com.kh.io;
//Human 추상클래스 작성
		//필드 값 : String name, int age
		//필드를 초기화하는 생성자 작성
		//추상메서드 MakeSound : 매개변수와 반환값(리턴값)이 없음
public abstract class Human0 {
	protected String name;
	protected int age;
	
	public Human0(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void MakeSound();
}
