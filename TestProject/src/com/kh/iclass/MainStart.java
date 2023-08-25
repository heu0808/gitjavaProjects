package com.kh.iclass;
import java.util.Scanner;

public class MainStart {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		CafePos pos = CafePos.getInstance();
		//메뉴 생성, 삭제, 수정, 조회, 전체출력
		
		
//		while(pos.getisRun()) {
//			int number = pos.printMenu();
//			
//			switch(number) {
//				case 1: { //생성
//					pos.insertMenu();
//				}break;
//					
//				case 2:{ //수정
//					pos.updateDrinkUnit();
//				}break;
//					
//				case 3:{ //조회
//					pos.searchDrinkUnit();
//				}break;
//					
//				case 4:{ //삭제
//					pos.deleteDrinkUnit();
//				}break;
//					
//				case 5:{ //전체메뉴확인
//					pos.printDrinkArr();
//				}break;
//					default:
//						pos.setisRun(false);
//			}
//		}
		
//		final int MAX = 20;
//		product[] menuArr = new product[MAX];
//		menuArr[0] = new product("아메리카노",1000,"시원함");
		
		//음료명,금액,설명을 입력받아 menuArr에 추가해 보아라
//		System.out.print("음료명 : ");
//		String name = scan.next();
//		System.out.print("금액 : ");
//		int price = scan.nextInt();
//		System.out.print("설명 : ");
//		String descripation = scan.next();
//		
////		객체배열이름[index] = new 클래스이름(매개변수);
//		menuArr[0] = new product(name,price,descripation);
//		for(int i = 0; i < menuArr.length; i++) {
//			if(menuArr[i] == null) { //객체에 자리가 비어있니?
//				menuArr[i] = new product(name,price,descripation);
//				System.out.println(menuArr[i].getName()+"가 메뉴에 추가되었습니다.");
//				break;
//			} else if(menuArr[i].getName().equals(name)) { //객체에 이름데이터의 값이 입력받은 이름과 똑같은가?
//				System.out.println(name + "는(은) 이미 등록되어 있습니다.");
//				break;
//			} else if(i == (menuArr.length -1 )) { //마지막까지 확인이 끝났나?
//				System.out.println("더 이상 메뉴를 추가할 수 없습니다.");
//			} 
//		}
//		
//		//음료목록 출력해주세요.
//		//메뉴명 가격 설명
//		System.out.println("번호\t메뉴명\t가격\t설명");
//		for(int i = 0;  i < menuArr.length; i++) {
//			if(menuArr[i] == null) {
//				System.out.println(i + "-\t-\t-");
//			} else {
//				System.out.println(i + "\t" + menuArr[i].toString());
//			}
//			System.out.println(menuArr[i].toString());
//		}
//		
//		//가장 최신으로 저장된 목록 1개 삭제
////		for(int i = (menuArr.length-1); i >= 0; i--) {
////			if(menuArr[i] != null) {
////			System.out.println(menuArr[i].getName() + "가 메뉴가 삭제되었습니다.");
////			menuArr[i] = null;
////			break;
////			} else if(i == 0) {
////				System.out.println("삭제할 메뉴가 존재하지 않습니다.");
////			}
////		}
//		
//		//조회
//		//조회할 메뉴의 이름을 입력하세요 : 아메리카노
//		//0 아메리카노 1000 시원함
//		//해당메뉴가 목록에 존재하지 않습니다.
//		
////		System.out.print("조회할 메뉴의 이름을 입력하세요 : ");
////		String menu = scan.next();
////		
////		for(int i = 0; i < menuArr.length; i++) {
////			if(menuArr[i] == null) {
////				System.out.println("해당메뉴가 목록에 존재하지 않습니다.");
////				break;
////			}else if(menuArr[i].getName().equals(menu)) {
////				System.out.println(i + "\t" + menuArr[i].toString());
////				
////				break;
////			} else if(i == (menuArr.length - 1)) {
////				System.out.println("해당메뉴가 목록에 존재하지 않습니다.");
////			}
////	
////		}
//		
//		//수정할 메뉴의 번호를 입력하세요 : (번호)
//		//수정할 정보를 입력하세요 : (이름, 가격, 설명)
//		//새로운 oo을 입력하세요 :
//		// (번호) 아메리카노 1000 시원함
//		
//		product selectMenu;
//		int number;
//		
//		System.out.print("수정할 메뉴의 번호를 입력하세요 : (번호)");
//		number = scan.nextInt();
//		
//		selectMenu = menuArr[number];
//		if(selectMenu != null) {
//			System.out.print("해당 번호의 메뉴가 존재하지 않습니다.");
//		} else {
//			System.out.println("수정할 정보를 입력하세요 : ");
//			switch(scan.next()) {
//			case "이름" :
//				System.out.println("새로운 이름을 입력하세요 : ");
//				selectMenu.setName(scan.nextLine());
//				System.out.println(number + "\t" + selectMenu.toString());
//				break;
//			case "가격" :
//				System.out.println("가격을 입력하세요 : ");
//				selectMenu.setPrice(scan.nextInt());
//				System.out.println(number + "\t" + selectMenu.toString());
//				break;
//			case "설명" :
//				System.out.println("설명 : ");
//				selectMenu.setDescripation(scan.nextLine());
//				System.out.println(number + "\t" + selectMenu.toString());
//				break;
//			default:
//				System.out.println("잘못 입력했습니다.");
//			}
//		}
//		
//	

//		
//		
//		//아이스 아메리카노,카페라떼, 핫초코
////		product iceA = new product("아이스아메리카노",1000,"고소한 맛");
////		product iceL = new product("카페라떼",2000,"다크한 맛");
////		product hotch = new product("핫초코",3500,"단맛");
//		
////		System.out.println(iceA.toString());
////		System.out.println(iceL.toString());
////		System.out.println(hotch.toString());
//		
////		product[] drinkarr = new product[3];
////		drinkarr[0] = new product("아이스아메리카노",1000,"고소한 맛");
////		drinkarr[1] = new product("카페라떼",2000,"다크한 맛");
////		drinkarr[2] = new product("핫초코",3500,"단맛");
////		
////		//객체에 들어간 내용 출력
////		System.out.println(drinkarr[0].toString());
////		System.out.println(drinkarr[1].toString());
////		System.out.println(drinkarr[2].toString());
//		
////		//클래스 사용해서 객체배열 만드는 방법
////		//1.클래스이름[] 객체배열이름 = new 클래스이름[크기(길이)];
////		//->위처럼 작성시 객체배열이 생성은 되지만 비어있는 상태;
//
////		//실제 객체를 만드는 방법
////		//2.객체배열이름[index] = new 클래스이름(매개변수);
//
////		
//		//클래스이름 객체이름 = new 클래스이름();
//		//내가 사용하고 싶으면 만드는 거.
////		//참조변수만 만들어진 상태(리모컨만 들고 있는 상태)
////		//참조변수가 메모리공간의 주소값을 가지고 있는 상태(리모컨을 제품에 연결한 상태)


	}
}
