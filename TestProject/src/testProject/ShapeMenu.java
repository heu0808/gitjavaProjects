package testProject;
import java.util.*;
public class ShapeMenu {
	
	Scanner sc = new Scanner(System.in);
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	
	public void inputMenu() {
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
	
	public void triangleMenu() {
		
	}
	
	public void squareMenu() {
		
	}
	
	public void inputSize() {
		
	}
	
	public void printInformation() {
		
	}
}
