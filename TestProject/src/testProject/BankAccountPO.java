package testProject; //클래스를 묶어놓은것

public class BankAccountPO { //클래스(설계도)는 데이터+기능으로 이루어져 있다.
	int balance = 0;
	String name;
	
	public BankAccountPO()  { //생성자
		
	}
	public BankAccountPO (int money) {
		balance = money;
	}
	public BankAccountPO(int money,String a) {
		balance = money;
		name = a;
	}
	
	
	
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
