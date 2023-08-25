package testProject;

public class Object {

	public static void main(String[] args) {
//		System.out.println(factorial(3));
		
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		BankAccount a = new BankAccount();
		a.balance = 3000;
		a.checkMyBalance();
		//기본생성자로 객체 생성 해서 이름, 잔액 출력
		BankAccount abc = new BankAccount(1000);
		//매개변수가 2개인 생성자로 객체 생성하고 이름,잔액 출력
		BankAccount apple = new BankAccount(5000);
		
		System.out.println(yoon.balance);
		System.out.println(park.balance);
		
		yoon.deposit(1000);
		park.deposit(2000);
		
		yoon.checkMyBalance();
		park = yoon;
		park.checkMyBalance();
		
		
		
//		System.out.println("프로그램의 시작");
//		hieveryone(12);
//		hieveryone(13);
//		System.out.println("프로그램의 끝");
//	}
//	public static void hieveryone(int age) {
//		System.out.println("좋은 아침입니다.");
//		System.out.println("제 나이는 " + age + "세 입니다.");
//		
//		double myHeight = 175.9;
//		hiEveryone(12, 12.5);
//		hiEveryone(13, myHeight);
//		byEveryone();
//		
//	}
//	public static void hiEveryone(int age, double height) {
//		System.out.println("제 나이는 " + age + "세 입니다.");
//		System.out.println("저의 키는 " + height + "cm 입니다.");
//	}
//	public static void byEveryone() {
//		System.out.println("다음에 뵙겠습니다.");
		
//		int result;
//		result = adder(4, 5);
//		System.out.println("4 + 5 =" + result);
//		System.out.println("3.5*3.5 ="+square(3.5));
//	}
//	public static int adder(int num1, int num2) {
//		int addResult = num1 + num2;
//		return addResult;
//		
//	}
//	public static double square(double num) {
//		return num*num;
//	}
	
//	메서드 설정값 리턴형식 메서드이름(매개변수) {
//		실행할 코드
//		return 값;
		
		
	}
//	public static int factorial(int n) {
//		if(n == 1) 
//			return 1;
//		 else {
//			return n * factorial(n-1);
//		
//		} 
//}

}
class BankAccount {
	int balance;
	
	//기본생성자로 객체 생성 해서 이름, 잔액 출력
	public BankAccount() {
		
	}
	public BankAccount(int a) {
		balance = a;
	}
	//매개변수가 2개인 생성자로 객체 생성하고 이름,잔액 출력
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
}

