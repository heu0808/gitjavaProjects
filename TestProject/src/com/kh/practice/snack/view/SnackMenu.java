package com.kh.practice.snack.view;
import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;
import com.kh.practice.snack.model.vo.Snack;
	public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		System.out.print("종류 : ");
		String type = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("맛 : ");
		String taste = sc.next();
		System.out.print("개수 : ");
		int count = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		String str = scr.saveData(type, name, taste, count, price);
		System.out.println(str);
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		char info = sc.next().charAt(0);
		if (info == 'y')
			System.out.println(scr.confirmData());
		
	}
	
}
