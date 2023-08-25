package testProject;

public class MainStrart {
	public static void main(String[] args) {
		BankAccountPO choi1 = new BankAccountPO();
		BankAccountPO choi2 = new BankAccountPO(1000);
		BankAccountPO choi3 = new BankAccountPO(1000,"길동");
		
		choi2.deposit(1000);
		
		choi3.checkMyBalance();
	}
}
