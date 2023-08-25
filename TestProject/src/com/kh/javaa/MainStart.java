package com.kh.javaa;

import com.kh.javaa.Human;

public class MainStart {
	
	public static void main(String[] args) {
		Human people = new Human();
		Human people1 = new Human(20,'여',"홍길동","서울");
		
		people1.Humanage(20);
		people1.Humangender('여');
		people1.Humanname("홍길동");
		people1.Humanaddr("서울");
	}
}
