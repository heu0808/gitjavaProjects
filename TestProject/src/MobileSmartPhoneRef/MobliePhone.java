package MobileSmartPhoneRef;

public class MobliePhone {
	protected String number;
	
	public MobliePhone(String num) {
		number = num;
	}
	public void answer() {
		System.out.println("Hi~from " + number);
	}
}
