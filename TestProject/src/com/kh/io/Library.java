package com.kh.io;
import java.util.*;

//회원생성, 수정, 삭제
//도서 등록, 수정, 삭제
//및 도서대여 관리
public class Library {
	//책들을 저장한 공간
	ArrayList<Book> bookList;
	//회원들을 저장할 공간
	ArrayList<Human> humanList;
	Scanner sc = new Scanner(System.in);
	
	public Library() {
		bookList = new ArrayList<>();
		bookList.add(new Book("간디","홍길동",123));
		bookList.add(new Book("꿈","김길동",456));
		bookList.add(new Book("이순신","이길동",789));
		
		humanList = new ArrayList<>();
		humanList.add(new Human(1, "홍길동",20,"920325",'F'));
		humanList.add(new Human(2, "짱구",27,"910520",'M'));
		humanList.add(new Human(3, "유리",30,"980720",'F'));
	}
	
	//도서등록, 도서대여, 도서반납
	//을 선택하는 메인화면 출력
	public void mainMenu() {
		int number = 0;
		while(number != 9) {
			System.out.println("==========================");
			System.out.println("1.도서등록");
			System.out.println("2.도서대여");
			System.out.println("3.도서반납");
			System.out.println("4.회원등록");
			System.out.println("9.프로그램 종료");
			System.out.println("==========================");
			System.out.println("원하시는 서비스 번호를 입력하세요 : ");
			
			//원하는 서비스 번호 입력받기
			number = sc.nextInt();
			sc.nextLine();
			switch(number) {
			case 1 :
				printBookList();
				bookList.add(this.createBook());
				break;
			case 2 :
				rentBook();
				break;
			case 3 :
				break;
			case 4 : 
				printHumanList();
				humanList.add(this.createHuman());
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
		}
}
	//도서를 반납하기위한 메서드
	public void returnBook() {
		// 책을 빌린사람들을 추린다.
		ArrayList<Human> tmpHumanList = new ArrayList<>();
		//humanList -> 전체검사하면서 책을 대여한 사람만 tmpHumanList 추가
		
		//tmpHumanList 담긴 사람들을 보여준다.
		// 어떤 사람의 책을 반납할지 선택해준다.
		
		// 어떤책을 반납해야하는지 책을 가지고온다.
		
	}
	//도서 대여를 위한 메서드
	public void rentBook() {
		//대여가능한 책이 있는지 검사
		//없으면 없다고하고 리턴
		//대여를 할 수 있는 회원이 있는지 검사
		//없으면 없다고하고 리턴
		if(bookList.size() == 0) {
			System.out.println("도서등록이 필요합니다.");
			return;
		} else if(humanList.size() == 0) {
			System.out.println("회원등록이 필요합니다.");
			return;
		}
		
		//대여하는 사람을 선택하는 코드
		Human selectHuman = selectHuman();
		
		//대여할 book을 선택하는 코드
		Book selectBook = selectBook();
		
		//책을 대여해준다.
		//책에는 isRent상태를 false로 변경
		//사람은 대여책 코드를 등록시킨다.
		selectHuman.setRentBookCode(selectBook.getCode());
		selectBook.setIsRent(false);
	}
	
	//book을 선택해서 반환해주는 메서드
	public Book selectBook() {
		
		Book selectBook = null;
		while(selectBook == null) {
			printBookList();
			System.out.println("어떤 책을 대여하시겠습니까?(도서코드 입력) : ");
			
			int slectcode = sc.nextInt();
			sc.nextLine();
			
			for(int i = 0; i < bookList.size(); i++) {
				Book book = bookList.get(i);
				
				if(slectcode == book.getCode()) {
					if(!book.getIsRent()) {
						System.out.println("이미 대여중인 책입니다.");
					} else {
					selectBook = book;
					}
				}
			}
		}
		return selectBook;
	}
	
	//human을 선택해서 반환해주는 메서드
	public Human selectHuman() {
		Human selectHuman = null;
		while(selectHuman == null) {
			printHumanList();
			System.out.print("어떤 회원으로 대여하시겠습니까?(id입력) : ");
			int selectKey = sc.nextInt();
			sc.nextLine();
			
			
			for(Human human : humanList) {
				if(selectKey == human.getKey()) {
					if(human.getRentBookCode() != 0) {
						System.out.println("대여중인 책을 반납 후 이용 부탁드립니다.");
					} else {
					selectHuman = human;
					}
			}
		}
	}
		return selectHuman;
}
	
	
	//bookList의 목록을 보여주는 메서드
	public void printBookList() {
		System.out.println("---------------------------");
		if(bookList.size() > 0) {
			System.out.println("번호 \t 제목 \t 작가 \t 대여여부");
			for(Book book : bookList) {
				System.out.println(book.toString());
			}
		} else {
			System.out.println("등록된 도서 없음");
		}
		System.out.println("---------------------------");
	}
	
	//humanList의 목록을 보여주는 메서드
	public void printHumanList() {
		System.out.println("---------------------------");
		if(humanList.size() > 0) {
			System.out.println("ID \t 이름 \t 생년월일 \t 나이 \t 성별 \t 도서대여현황");
			for(Human human : humanList) {
				System.out.println(human.toString());
			}
		} else {
			System.out.println("등록된 회원 없음");
		}
		System.out.println("---------------------------");
	}
	
//	사용자에 입력에 따라 사람객체를 생성해서 반환한다.
	public Human createHuman() {
		
		String name, residentNumber;
		int age, key;
		char gender;
		
//		이름, 나이, 주민등록번호, 성별을 입력받아 사람객체 한개를 생성한다.
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("고객 고유코드를 입력하세요. : ");
		key = sc.nextInt();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("주민등록번호 앞 6자리를 입력하세요 : ");
		residentNumber = sc.nextLine();
		System.out.print("성별을 입력해주세요.(남 : M, 여자는 : F) : ");
		gender = sc.next().toUpperCase().charAt(0);
		
		Human human = new Human(key,name,age,residentNumber,gender);
		System.out.println(human.toString() + "생성완료");
		
		return human;
		
		
	}
	
//	사용자에 입력에 따라 책객체를 생성해서 반환한다.
	public Book createBook() {
		
		String title, author;
		int code;
		
		System.out.print("책 제목을 입력하세요 : ");
		title = sc.nextLine();
		System.out.print("작가 이름을 입력하세요 : ");
		author = sc.nextLine();
		System.out.print("코드를 입력하세요 : ");
		code = sc.nextInt();
		sc.nextLine();
		
		Book book = new Book(title,author,code);
		System.out.println(book.toString() + "생성완료");
		
		return book;
	}
	
}
