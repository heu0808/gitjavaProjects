package com.kh.javas;
import java.util.*;
// pos의 전체적인 관리를 위한 class
public class POSSystem {
	
	//외부에서 접근이 불가능한 pos 객체 생성
	private final static Customer[] CUSTOMER_LIST = new Customer[10];
	private static POSSystem PosInstance = new POSSystem();
	Scanner sc = new Scanner(System.in);
//	외부에서 생성할 수 없도록 기본생성자의 접근을 private으로 설정
	private POSSystem() {
		
	}
	
	public static POSSystem getPosInstance() {
//		POSSystem 내부에 있는 메서드 영역으로 private한 posInstance에 접근 가능
		return PosInstance;
	}
//	pos 메뉴를 나타내주는 메서드
	public int printMenu() {
		System.out.println("----------------");
		System.out.print("1. 회원등록");
		System.out.print("2. 회원삭제");
		System.out.print("3. 회원목록출력");
		System.out.println("4. 로그인");
		System.out.println("----------------");
		System.out.print("원하시는 번호를 입력해 주세요.(이외번호를 입력하시면 프로그램을 종료합니다.");
		
		return sc.nextInt();
	}
//	회원가입 정보 입력받아 배열에 저장하는 메서드
	public void joinCustomer() {
		
			if(this.CUSTOMER_LIST[this.CUSTOMER_LIST.length - 1] != null) {
				System.out.println("더 이상 회원을 등록할 수 없습니다.");
				return;
			} 
			
			Customer newUser = insertCustomer();
			saveCustomer(newUser);
	}
	
//	회원가입 정보입력을 위한 메서드
	public Customer insertCustomer() {
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String password = sc.next();
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("이메일을 입력하세요 : ");
		String email = sc.next();
		return new Customer(id,password,name,email);
	}
	
//	회원을 실제로 배열에 저장하는 메서드
	public void saveCustomer(Customer user) {
		for(int i = 0; i < CUSTOMER_LIST.length; i++) {
			if(this.CUSTOMER_LIST[i] == null) {
				this.CUSTOMER_LIST[i] = user;
				
				
				System.out.println(this.CUSTOMER_LIST[i].toString());
				System.out.println("회원정보가 정상적으로 등록되었습니다.");
				break;
			}
		}
	}
	
//	맨 마지막으로 추가된 회원을 삭제한다.
	public void deleteLastCustomer() {
		for(int i = this.CUSTOMER_LIST.length-1; i >= 0; i++) {
			if(CUSTOMER_LIST[i] != null) {
				System.out.print(this.CUSTOMER_LIST[i].getName() + "회원을 삭제하였습니다.");
				CUSTOMER_LIST[i] = null;
				break;
			} 
		}
	}
	
	//회원목록을 출력해주는 메서드
	public void viewCustomerList() {
		System.out.println("이름\t아이디\t비밀번호\t이메일");
		for(int i = 0; i < this.CUSTOMER_LIST.length; i++) {
			if(CUSTOMER_LIST[i] == null)
				break;
			System.out.println(this.CUSTOMER_LIST[i].toString());
		}
	}
	
	public void login() {
		Customer loginCustomer;
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		String str ="아이디를 찾을 수 없습니다.";
		for(int i = 0; i < this.CUSTOMER_LIST.length; i++) {
			if(this.CUSTOMER_LIST[i] == null) {
				System.out.println("등록된 회원정보를 찾을 수 없습니다.");
				break;
			} else if(this.CUSTOMER_LIST[i].equals(id,password)) {
				loginCustomer = this.CUSTOMER_LIST[i];
				System.out.println("로그인 성공");
				break;
			} else if(this.CUSTOMER_LIST[i].idcheck(id)) {
				System.out.println("비밀번호가 틀렸습니다.");
				break;
			} else if(i == this.CUSTOMER_LIST.length - 1) {
				System.out.println("등록된 회원정보를 찾을 수 없습니다.");
			}
		}
	}
}
