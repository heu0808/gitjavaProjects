package com.kh.io;

public class Human {
	//name,age
	private String name;
	private int age;
	private String residentNumber;
	private char gender; 
	private Book[] bookList;
	
	//필드를 전부 초기화하는 매개변수를 가지고 있는 생성자
	//생성자 : 객체의 데이터들을 전부 초기화하기 위한 특수목적의 메서드
	//리턴값을 가지고 있지 않고 객체 생성시 1번만 호출된다.
	//오버로딩 가능,이름은 클래스와 동일하다.
	
	//오버로딩 : 메서드의 이름이 같아도 매개변수의 개수나 자료형이 다르면 구분이 가능
	
	
	public Human(String name, int age, String residentNumber, char gender) {
		this.name = name;
		this.age = age;
		this.residentNumber = residentNumber;
		this.gender = gender;
		bookList = new Book[10];
	}
	
	
	public Book[] getBookList() {
		return this.bookList;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getResidentNumber() {
		return residentNumber;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setResidentNumber(String residentNumber) {
		this.residentNumber = residentNumber;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return this.name + this.age + this.residentNumber + this.gender;
	}
	
	public String getyearAge() {
		return "제 10년 후 나이는 " + this.age + "살입니다.";
	}
}