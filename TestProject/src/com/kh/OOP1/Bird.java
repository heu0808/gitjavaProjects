package com.kh.OOP1;
//Bird 클래스 작성
		//Animal을 상속받고, Flyable를 구현함
		//fly 메서드에서는 "oo는 하늘을 날아다닌다" 출력
		//makeSound메서드 "oo이 하늘에서 울고 있습니다."출력
public class Bird extends Animal implements Flyable {
	
	public Bird(String name) {
		super(name);
	}
	
	public void fly() {
		System.out.println(this.name+"는 하늘을 날아다닌다");
	}
	
	public void makeSound() {
		System.out.println(this.name + "이 하늘에서 울고 있습니다");
	}
	
}
