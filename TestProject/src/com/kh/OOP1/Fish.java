package com.kh.OOP1;
//Fish 클래스 작성
		//Animal을 상속받고, Swimmable를 구현함
		//swim메서드에서는 "oo는 물을 헤엄친다"출력
		//makeSound메서드 "oo이 물에서 울고있습니다."출력
public class Fish extends Animal implements Swimmable{
	
	public Fish(String name) {
		super(name);
	}
	
	public void swim() {
		System.out.println(this.name + "는 물을 헤엄친다");
	}
	
	public void makeSound() {
		System.out.println(this.name + "이 물에서 울고 있습니다.");
	}
}
