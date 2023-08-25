package com.kh.OOP1;
//Animal 추상클래스 작성
		//필드 값 : String name
		//필드를 초기화하는 생성자 작성
		//추상메서드 makeSound : 매개변수와 반환값(리턴값)이 없음

//추상클래스는 일반클래스와 동일하지만
//추상 메서드를 포함할 수 있어 객체생성이 되지 않는다.
//상속받아 추상메서드를 모두 구현해서 사용할 수 있다.
public abstract class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void makeSound();
	
}
