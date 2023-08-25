package com.kh.OOP1;
import java.util.*;
public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int sum = 0;
		//int형 변수 num을 입력받으세요
//		int num = sc.nextInt();
		//num이 홀수이면 홀수입니다.짝수면 짝수입니다를 출력
//		if(num % 2 == 0) {
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}
		//1부터 num까지 모두 더한 합을 구해서 출력
//		for(int i = 1; i <= num; i++) {
//			System.out.println(sum += i);	
//		}
		//num크기의 int형 배열을 만들고 0~(num-1)까지의 인덱스에 1~num까지의 숫자를 저장하고
		//모든 배열에 저장이 잘 되었는지 출력
//		int[] numArr = new int[num];
//		for(int i = 0; i < numArr.length; i++) {
//			numArr[i] = i+1;
//		}
//		for(int i = 0; i < numArr.length; i++) {
//			System.out.println(numArr[i]);
//		}
		
		//Animal 추상클래스 작성
		//필드 값 : String name
		//필드를 초기화하는 생성자 작성
		//추상메서드 makeSound : 매개변수와 반환값(리턴값)이 없음
		
		//인터페이스 Swimmable 작성
		//추상메서드 swim : 매개변수와 반환값(리턴값)이 없음
		
		//인터페이스 Flyable 작성
		//추상메서드 fly : 매개변수와 반환값(리턴값)이 없음
		
		//Bird 클래스 작성
		//Animal을 상속받고, Flyable를 구현함
		//fly 메서드에서는 "oo는 하늘을 날아다닌다" 출력
		//makeSound메서드 "oo이 하늘에서 울고 있습니다."출력
		
		//Fish 클래스 작성
		//Animal을 상속받고, Swimmable를 구현함
		//swim메서드에서는 "oo는 물을 헤엄친다"출력
		//makeSound메서드 "oo이 물에서 울고있습니다."출력

		//메인문에서  각각 객체를 하나 만들고 테스트 실행
		
//		Animal bird = new Bird("파랑새");
//		bird.makeSound();
//		((Flyable)bird).fly();
//		
//		Animal fish = new Fish("연어");
//		fish.makeSound();
//		((Fish)fish).swim();
		
		//int형 변수 num을 입력받으세요
		int num = sc.nextInt();
		//num이 10보다 크면 "10초과" 작거나 같으면 "10이하" 출력
		if(num < 10 || num >= 10) {
			System.out.println("10초과");
		} else {
			System.out.println("10이하");
		}
		//1000에서 1부터 num까지 순서대로 전부 뺀 값을 출력
		int sum = 1000;
		 for(int i = 1; i < num; i++) {
			System.out.println();
		 }
		//num크기의 int형 배열을 만들고 모든 인덱스에 num의 숫자를 저장하고
		//모든 배열에 저장이 잘 되었는지 출력
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num;
			System.out.println(arr[i]);
		}
		
		//Human 추상클래스 작성
		//필드 값 : Stringg name, int age
		//필드를 초기화하는 생성자 작성
		//추상메서드 MakeSound : 매개변수와 반환값(리턴값)이 없음
		
		//인터페이스 Swimmable 작성
		//추상메서드 swim : 매개변수와 반한값(리턴값)이 없음
		 
		//인터페이스 sleepable 작성
		//추상메서드 sleep : 매개변수와 반한값(리턴값)이 없음
		 
		//Student 클래스 작성
		//Human을 상속받고, Swimmable, sleepable를 구현함
		//swim메서드에서는 "ooo님은 수영을 합니다." 출력
		//sleep메서드에서는 "ooo님은 잠을 잡니다." 출력
		//makeSound메서드 "저는 ooo이고 oo살 입니다" 출력
		 
		//메인문에서 각각 객체를 하나 만들고 테스트 실행
	}

}
