package com.kh.extendsjava;
import java.util.Scanner;
public class MainStart1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Human h = new Human("이길동","남자",30,50.5);
//		
//		System.out.println(h.toString());
//		
//		Human[] Humanarr = new Human[10];
//		
//		Humanarr[0] = new Human("홍길동","여자",20,40.5);
//		
//		//Humanarr[1] 입력받아서 생성해라
//		//이름을 입력하세요 :
//		//성별을 입력하세요 :
//		//나이를 입력하세요 :
//		//몸무게를 입력하세요 :
//		System.out.print("이름을 입력하세요 : ");
//		String name = sc.next();
//		System.out.print("성별을 입력하세요 : ");
//		String gender = sc.next();
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		System.out.print("몸무게를 입력하세요 : ");
//		double weight = sc.nextDouble();
//		
//		Humanarr[1] = new Human(name,gender,age,weight);
//		
//		//전체출력
//		System.out.println("이름\t성별\t나이\t몸무게");
//		for(int i = 0; i < Humanarr.length; i++) {
//			if(Humanarr[i] == null) {
//				break;
//			}
//			System.out.println(Humanarr[i].toString());
//		}
		
		//맨 뒤에 있는(가장 마지막으로 넣은) 객체 삭제
//			for(int i = 0; i < Humanarr.length; i++) {
//				if(Humanarr[0] == null) {
//					System.out.println("삭제할 데이터 없습니다.");
//					break;
//				}
//				else if(Humanarr[i] == null) {
//					 Humanarr[i - 1] = null;
//					 break;
//				}
//				System.out.println(Humanarr[i].toString());
//			}
		
//			for(int i = Humanarr.length - 1; i >= 0; i--) {
//				if(Humanarr[i] != null) {
//					Humanarr[i] = null;
//					break;
//				}
//			}
		
		//생성자 생성
		Human h = new Human("홍길동","여자",20,40.5);
		//객체배열 만들기
		Human[] harr = new Human[3];
		//harr[1] 입력받아서 생성해라
		//이름을 입력하세요 :
		//성별을 입력하세요 :
		//나이를 입력하세요 :
		//몸무게를 입력하세요 :
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("성별을 입력하세요 : ");
		String gender = sc.next();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("몸무게를 입력하세요 : ");
		double weight = sc.nextDouble();
		harr[0] = new Human(name,gender,age,weight);
		//전체출력
		System.out.println("이름\t성별\t나이\t몸무게");
		for(int i = 0; i < harr.length; i++) {
			if(harr[i] == null) {
				break;
			}
			System.out.println(harr[i].toString());
		}
		//맨 뒤에 있는(가장 마지막으로 넣은) 객체 삭제
		for(int i = 0; i < harr.length; i++) {
			if(harr[0] == null) {
				System.out.println("삭제할 내용이 없습니다.");
				break;
			} else if(harr[i] == null) {
				harr[i - 1] = null;
			} System.out.println(harr[i].toString());
		}
		
	}

}
