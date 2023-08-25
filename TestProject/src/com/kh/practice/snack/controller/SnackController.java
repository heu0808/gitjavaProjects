package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	private Snack s;
	
	public SnackController() {
		s = new Snack();
	}
	
	public String saveData(String kind,String name,String flavor,int numOf,int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumof(numOf);
		s.setPrice(price);
		return "저장 완료";
	}
	
	public String confirmData() {
		return s.information();
	}
	
	
	
}
