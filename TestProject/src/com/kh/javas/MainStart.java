package com.kh.javas;
import java.util.*;
//main 메서드를 실행해주기 위한 class
public class MainStart {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
		POSSystem pos = POSSystem.getPosInstance();
		pos.saveCustomer(new Customer("홍길동","myId","myPassword12","abc123@naver.com"));
		
		
		boolean isLoop = true;
		while(isLoop) {
		switch(pos.printMenu()) {
			case 1: { //회원등록
				pos.joinCustomer();
			}break;
			case 2:{ //회원삭제
				pos.deleteLastCustomer();
			}break;
			case 3:{ //회원목록출력
				pos.viewCustomerList();
			}break;
			case 4:{ //로그인
				pos.login();
			}break;
				default:
					isLoop = false;
			}
		}
		
//		길이가 10인 Customer 객체배열을 생성하고
//		0번째 인덱스값에 id : myId, password : myPassword12로 객체생성(이름 이메일 자유)
//		Customer[] ctArr = new Customer[10];
//		ctArr[0] = new Customer("홍길동","myId","myPassword12","abc123@naver.com");
		
		
		//아이디,비밀번호,이름,이메일을 입력받아 Customer 객체를 추가해보자
		/*
		 * 아이디를 입력하세요 :
		 * 비밀번호를 입력하세요 : 
		 * 이름을 입력하세요 :
		 * 이메일을 입력하세요 : 
		 * 
		 * 이름 : ooo / 이메일 : ooo / ID : ooo / Password : ooo
		 * 회원정보가 정상적으로 등록되었습니다. 
		 */
		
//		+++++++ 회원삭제 +++++++
//		마지막으로 등록된 회원을 삭제한다.
//		for(int i = ctArr.length-1; i >= 0; i++) {
//			if(ctArr[i] != null) {
//				ctArr[i] = null;
//				break;
//			} 
//		}
//		------ 회원삭제 ---------
		
//		+++++++ 모든 회원 출력 ++++++++
//		이름 아이디 비밀번호 이메일
//		System.out.println("이름\t아이디\t비밀번호\t이메일");
//		for(int i = 0; i < ctArr.length; i++) {
//			if(ctArr[i] == null)
//				break;
//			System.out.println(ctArr[i].toString());
//		}
//		------- 모든 회원 출력 --------
		
		
//		++++++ 회원 가입 ++++++
//		for(int i = 0; i < ctArr.length; i++) {
//			if(ctArr[i] == null) {
//				System.out.print("아이디를 입력하세요 : ");
//				String id = sc.next();
//				System.out.print("비밀번호를 입력하세요 : ");
//				String password = sc.next();
//				System.out.print("이름을 입력하세요 : ");
//				String name = sc.next();
//				System.out.print("이메일을 입력하세요 : ");
//				String email = sc.next();
//				ctArr[i] = new Customer(id,password,name,email);
//				
//				System.out.println(ctArr[i].toString());
//				System.out.println("회원정보가 정상적으로 등록 되었습니다.");
//				break;
//			} else if(i == ctArr.length - 1) {
//				System.out.println("더 이상 회원을 등록할 수 없습니다.");
//			}
//		}
//		------ 회원가입 -------
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		++++++++ 로그인 ++++++++
//		Customer loginCustomer;
//		System.out.print("아이디 : ");
//		String id = sc.next();
//		System.out.print("비밀번호 : ");
//		String password = sc.nextLine();
//		
//		String str ="아이디를 찾을 수 없습니다.";
//		for(int i = 0; i < ctArr.length; i++) {
//			if(ctArr[i] == null) {
//				System.out.println("등록된 회원정보를 찾을 수 없습니다.");
//				break;
//			} else if(ctArr[i].equals(id,password)) {
//				loginCustomer = ctArr[i];
//				System.out.println("로그인 성공");
//				break;
//			} else if(ctArr[i].idcheck(id)) {
//				System.out.println("비밀번호가 틀렸습니다.");
//				break;
//			} else if(i == ctArr.length - 1) {
//				System.out.println("등록된 회원정보를 찾을 수 없습니다.");
//			}
//		}
//		-------- 로그인 --------
		
		// 인스턴스 객체생성 방법
		// 클래스 객체이름 = new 생성자(클래스와 이름이 동일한 메서드);
//		Student choi = new Student("펭수", 10, "남자");
//		Student kim = new Student("홍길동", 30, "여자");
		//아래 두 코드를 실행되면 각기 다른 결과값이 나타난다.
		//이를 통해 각기 다른 메모리공간을 확보하고 사용한다는 것을 알수 있다.
//		choi.info();
//		kim.info();
		
		
//		영어점수 수학점수 국어점수를 입력받아
//		각 과목이 40점이상이고 평균이 60점 이상일 때 합격
//		조건을 충족하지 못하면 불합격을 나타내주는 프로그램 작성
//		ex) 영어점수 : 40, 국어점수 : 70, 수학점수 : 60
//		총 합 : 180 , 평균 : 60.0 합격입니다.
		
//		Scanner sc = new Scanner(System.in);
		
//		Student choi = new Student("펭수", 10, "남자");
////		
////		System.out.print("영어점수 : ");
////		choi.setEnScore(sc.nextInt());
////		System.out.print("수학점수 : ");
////		choi.setMaScore(sc.nextInt());
////		System.out.print("국어점수 : ");
////		choi.setkoScore(sc.nextInt());
////		
////		System.out.println("총 합 : "+ choi.getTotal());
////		System.out.println("평 균 : "+ choi.getAvg());
////		
////		System.out.println("영어점수 : " + choi.getEnScore());
////		System.out.println("수학점수 : "+ choi.getMaScore());
////		System.out.println("국어점수 : "+ choi.getKorScore());
////		
////		choi.checkPass();
////		
////		choi.displayMyInfo();
//		
//		
//		Car choi = new Car("검정","bmw","SUV","하이브리드",
//							"2023-08-05",150,5,100);
////		choi.statusDisplay();
//		
//		//행동을 입력받고 진행하는 프로그램을 작성하세요
//		//1.달린다.
//		//2.멈춘다.
//		//3. 기름을 충전한다.
//		//4. 속도와 잔여기름양을 확인한다.
//		//다른버튼을 누르면 종료
//		boolean isFinish = false;
//		while(!isFinish) {
//			int num;
//			System.out.println("원하는 행동의 버튼을 클릭하세요.");
//			System.out.println("-------------------------");
//			System.out.println("1.달린다.");
//			System.out.println("2.멈춘다.");
//			System.out.println("3.기름을 충전한다.");
//			System.out.println("4.속도와 잔여기름양을 확인한다.");
//			System.out.println("다른버튼을 누르면 종료");
//			System.out.println("--------------------------------");
//			
//			num = sc.nextInt();
//			switch(num) {
//			case 1:
//				choi.onAxel();
//				choi.statusDisplay(2);
//				break;
//			case 2:
//				choi.onBreak();
//				choi.statusDisplay(2);
//				break;
//			case 3:
//				System.out.println("얼마나 충전하시겠습니까?");
//				int cc = sc.nextInt();
//				choi.insertCc(cc);
//				break;
//			case 4:
//				choi.statusDisplay(2);
//				break;
//			default:
//				isFinish = true;
//			}
//		}
		
//		Student choi = new Student("소망",26,"남자");
//		Student kim = new Student("사랑",23,"여자");
//		Student yoon = new Student("희망",24,"남자");
//		Student.showCount();
		
		//객체이름이 각각 yoon, choi, kim이라는 Student 객체를 생성해라
//		Student yoon = new Student("윤길동", 20, "남자");
//		Student choi = new Student("최길동",25,"여자");
//		Student kim = new Student("김길동",30,"남자");
		
//		iban[0] = new Student("윤길동", 20, "남자");
//		iban[1] = new Student("최길동",25,"여자");
//		iban[2] = new Student("김길동",30,"남자");
		
//		Scanner sc = new Scanner(System.in);
//		char classRoom;
//		int choice;
//		
//		//최대 학생에 수는 30인 클래스(i, h, j)를 3개 만들어라
//		Student[] iban = new Student[30];
//		Student[] jban = new Student[30];
//		Student[] hban = new Student[30];
//		//선택한 반의 주소값을 가지고 있는 참조변수
//		Student[] selectBan;
//		
////		관리할 클래스를 선택해 주세요.(i, j, k) : 
//		while(true) {
//			System.out.println("관리할 클래스를 선택해 주세요.(i, j, h반 중 선택 다른 키워드 입력시 종료) : ");
//			classRoom = sc.next().charAt(0);
//			
//			switch(classRoom) {
//				case 'i':
//					selectBan = iban;
//					break;
//				case 'j':
//					selectBan = jban;
//					break;
//				case 'h':
//					selectBan = hban;
//					break;
//				default:
//					selectBan = null;
//			}
//			if(selectBan == null)
//				break;
//			
//	//		1.학생추가
//	//		2.학생제거
//	//		3.학생목록 확인
//	//		기타입력시 뒤로 그 전까지 반복
//			
//			boolean isTrue = true;
//			while(isTrue) {
//			System.out.println("1.학생추가");
//			System.out.println("2.학생제거");
//			System.out.println("3.학생목록 확인");
//			System.out.println("4.학생조회");
//			System.out.println("기타입력시 뒤로");
//			choice = sc.nextInt();
//			
//			
//			switch(choice) {
//				case 1:{
//					int age;
//					String name, gender;
//					name = sc.next();
//					age = sc.nextInt();
//					gender = sc.next();
//					
//					
//					//selectBan의 마지막 빈자리를 찾는다.
//					int index = 0;
//					while(index < selectBan.length && selectBan[index] != null) {
//						index++;
//					}
//					
//					//selectBan에 자리가 있을 시 학생을 추가해준다.
//					if(index == 30)
//						System.out.println("더이상 해당반에는 학생을 추가할 수 없습니다.");
//					else {
//						System.out.println("추가할 학생의 이름, 나이, 성별을 입력해 주세요.");
//						selectBan[index] = new Student(name, age, gender);
//					}
//				}break;
//				case 2: {
//					int index = 0;
//					while(index < selectBan.length && selectBan[index] != null) {
//						index++;
//					}
//					if(index == 0)
//						System.out.println("삭제할 학생이 없습니다.");
//					else {
//						selectBan[index - 1] = null;
//						Student.count--;
//					}
//				} break;
//				case 3: {
//					System.out.println("---------------------");
//					System.out.println("이름\t나이\t성별");
//					for(int i = 0; i < selectBan.length; i++) {
//						if(selectBan[i] == null)
//							break;
//						selectBan[i].info();
//					}
//					System.out.println("---------------------");
//				}break;
//				
//				case 4: {
//					//조회할 학생의 정보를 입력하세요(이름,나이,성별)
//					System.out.println("조회할 학생의 정보를 입력하세요(이름,나이,성별) :");
//					String name = sc.next();
//					int age = sc.nextInt();
//					String gender = sc.next();
//					Student tmp = null;
//					//selectBan에 해당 정보와 동일한 학생조회
//					for(int i = 0; i < selectBan.length; i++) {
//						if(selectBan[i] == null)
//							break;
//						else if(selectBan[i].equals(name,age,gender)) {
//							tmp = selectBan[i];
//							break;
//						}
//					}
//					
//					if(tmp != null)
//						//해당 학생은 이미 등록 완료되었습니다.
//						System.out.println("해당 학생은 이미 등록 완료되었습니다.");
//					else
//						//or 해당학생을 찾을 수 없습니다.
//						System.out.println("해당학생을 찾을 수 없습니다.");
//				}
//				default:
//					isTrue = false;
//				}	
//			}
//			System.out.println("총 학생 : "+ Student.count + "명을 등록 완료하였습니다.");
//		}
//		
	}
}
