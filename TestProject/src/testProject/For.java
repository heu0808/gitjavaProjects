package testProject;
import java.util.*;
public class For {

	public static void main(String[] args) {
		
		//초기식 : 반복문을 시작할 때 한번 세팅을 위한 값
		//조건식 : 매번 반복하기 전에 조건을 부합하는지 확인 후 부합하면 반복진행
		//증감식 : 반복이 끝날 때마다 반복문 탈출을 위해 한번 연산을 진행
		
//		int dan = 2;
//		
//		for(int i = 1; i < 10; i++) {
//			System.out.println(dan + " * "+ i + " = " + (i * dan));
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		for(int i = 1; i < num; i++) {
//			System.out.println(i);
//			
//		} System.out.println("1 이상의 숫자를 입력해주세요.");
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		for(int i = 1; i <= num; i++) {
//			System.out.println(i);
//				
//			} System.out.println("1 이상의 숫자를 입력해주세요.");
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			int num1 = sc.nextInt();
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		for(int i = num; i >= 1; i--) {
//			System.out.println(i);
//		
//		} 
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0;
//		
//		while(num<1) { //num이 1이상의 숫자가 나올때 까지 반복
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			
//			if (num > 0) {
//				for(int i = num; i >= 1; i--) {
//					System.out.println(i + " ");
//				}
//			} else {
//				System.out.println("1이상의 숫자를 입력해주세요.");
//			}
//		}
		
//		-실습문제5-
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		int sum = 0;
//		
//		System.out.print("정수를 하나 입력하세요 : ");
//		num = sc.nextInt();
//		
//		for(int i = 1; i <= num; i++) {
//			sum += i;
//			if (i == num)
//				System.out.print(i+ " = " + sum);
//			else
//				System.out.print(i+ " + ");
//			
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num1, num2, min, max;
//		
//		System.out.print("첫 번째 숫자 : ");
//		num1 = sc.nextInt();
//		System.out.print("두 번째 숫자 : ");
//		num2 = sc.nextInt();
//		
//			if(num1 > 0 && num2 > 0) {
//				if(num1 > num2) {
//				   max = num1;
//				   min = num2;
//				} else {
//					max = num2;
//					min = num1;
//				}
//				for(int i = min; i <= max; i++) {
//					
//				}
//			} else {
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//			}
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num1, num2, min, max;
//		
//		System.out.print("첫 번째 숫자 : ");
//		num1 = sc.nextInt();
//		System.out.print("두 번째 숫자 : ");
//		num2 = sc.nextInt();
//		
//			if(num1 > 0 && num2 > 0) {
//				if(num1 > num2) {
//				   max = num1;
//				   min = num2;
//				} else {
//					max = num2;
//					min = num1;
//				}
//				for(int i = min; i <= max; i++) {
//					
//				}
//			} else {
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//			}
		
//		-반복문 실습문제1-
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		num = sc.nextInt();
//		
//		if(num <= 0) {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		}
//		for(int i = 1;i <= num; i++) {
//			System.out.print(i+" ");
//		}
		
//		-반복문 실습문제2-
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		num = sc.nextInt();
//		
//		if(num <= 1) {
//			
//			while(num < 1) {
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//				System.out.print("1이상의 숫자를 입력하세요 : ");
//				num = sc.nextInt();
//			}
//		} 
//			for(int i = 1; i <= num; i++) {
//				System.out.print(i+" ");
//			}	
		
//		-반복문 실습문제5-
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		System.out.print("정수를 하나 입력하세요 : ");
//		num = sc.nextInt();
//		
//		int sum = 0;
//		
//		for(int i = 1;i <= num; i++) {
//			sum += i;
//			if(i == 8) {
//				System.out.println(i + " = "+sum);
//			} else {
//			System.out.print(i+" "+" + ");
//		}
//			}
		
//		-반복문 실습문제7-
		
//			Scanner sc = new Scanner(System.in);
//			
//			int num1, num2, min, max;
//			
//			do {
//				System.out.print("첫 번째 숫자 : ");
//				num1 = sc.nextInt();
//				System.out.print("두 번째 숫자 : ");
//				num2 = sc.nextInt();
//			
//				if(num1 < 1 || num2 < 1)
//					System.out.println("1이상의 숫자를 입력하세요."); {
//					if(num1 > num2) {
//					   max = num1;
//					   min = num2;
//					} else {
//						max = num2;
//						min = num1;
//					}
//					for(int i = min; i <= max; i++) {
//						
//					}
//				} else {
//					System.out.println("1 이상의 숫자를 입력해주세요.");
//				}
			

		
//		-반복문 실습문제8-
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		System.out.print("숫자 : ");
//		num = sc.nextInt();
//		System.out.println("====== 4단 ======");
//		
//		for(int i = 1; i < 10; i++) {
//				System.out.println(num+" * "+i+" = "+(num*i));	
//				
//			}
	
//		-반복문 실습문제9-
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자 : ");
//		int dan = sc.nextInt();
//		
//		for(int j = 2; j <= dan; j++) {
//			for(int i = 1; i <= 9; i ++) {
//				System.out.println(j+" * "+i+" = "+(j*i));
//			}
//			System.out.println(" ");
//		}
		
//		-반복문 실습문제11-
		
//		Scanner sc = new Scanner(System.in);
//		
//		int start, tolerance;
//		
//		System.out.print("시작 숫자 : ");
//		start = sc.nextInt();
//		System.out.print("공차 : ");
//		tolerance = sc.nextInt();
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.print(start + " ");
//			start = start + tolerance;
//		}
		
//		-반복문 실습문제12-
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num1, num2;
//		String operator;
//		
//		while(true) {
//		System.out.print("연산자(+,-,*,/,%) : ");
//		operator = sc.next();
//		
//		if(operator.equals("exit")) {
//			System.out.println("프로그램을 종료합니다.");
//			break;
//		}
//		
//		System.out.print("정수1 : ");
//		num1 = sc.nextInt();
//		System.out.print("정수2 : ");
//		num2 = sc.nextInt();
//		
//		
//		if(operator.equals("+")) {
//			System.out.println(num1+" + "+num2+" = "+(num1+num2));
//		} else if(operator.equals("-")) {
//			System.out.println(num1+" - "+num2+" = "+(num1-num2));
//		} else if(operator.equals("*")) {
//			System.out.println(num1+" * "+num2+" = "+(num1*num2));
//		} else if(operator.equals("/")){
//			System.out.println(num1+" / "+num2+" = "+(num1/num2));
//		} else if(operator.equals("%")) {
//			System.out.println(num1+" % "+num2+" = "+(num1%num2));
//		} else {
//			System.out.println("없는 연산자입니다. 다시 입력해주세요.");
//		}
//		
//		}
		
//		-반복문 실습문제13-
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		for(int i = 1;i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			} 
			System.out.println();
		} 
		
	}
		
}

