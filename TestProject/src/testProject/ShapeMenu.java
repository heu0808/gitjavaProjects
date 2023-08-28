package testProject;
import java.util.*;
public class ShapeMenu {
	
	Scanner sc = new Scanner(System.in);
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		
		while(true) {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3.삼각형");
		System.out.println("4.사각형");
		System.out.println("9.프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
			case 3 :
				triangleMenu();
				break;
			case 4 :
				squareMenu();
				break;
			case 9 :
				System.out.println("프로그램 종료");
				break;
				default :
					System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
	}
	
	public void triangleMenu() {
		
		System.out.println("===== 삼각형 =====");
		System.out.println("1.삼각형 면적");
		System.out.println("2.삼각형 색칠");
		System.out.println("3.삼각형 정보");
		System.out.println("9.메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		switch(menuNum) {
		case 1 :
			System.out.print("삼각형 면적 : " + tc.calcArea(height, width));
			break;
		case 2 :
			
		case 3 :
		case 9 :
		}
		
	}
	
	public void squareMenu() {
		System.out.println("===== 사각형 =====");
		System.out.println("1.사각형 둘레");
		System.out.println("2.사각형 면적");
		System.out.println("3.사각형 색칠");
		System.out.println("4.사각형 정보");
		System.out.println("9.메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		System.out.print("사각형 둘레 : " + scr.calcPerimeter(height, width));
	}
	
	public void inputSize() {
		
	}
	
	public void printInformation() {
		
	}
}
