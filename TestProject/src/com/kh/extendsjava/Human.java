package com.kh.extendsjava;

public class Human {
	//필드 데이터
	//이름 성별 나이 몸무게(소수점 포함)
//	String name;
//	String gender;
//	int age;
//	double weight;
//	
//	//전체 데이터 초기화하는 생성자
//	public Human(String name,String gender,int age,double weight) {
//		this.name = name;
//		this.gender = gender;
//		this.age = age;
//		this.weight = weight;
//	}
//	
//	//getter
//	public String getName() {
//		return this.name;
//	}
//	
//	public String getGender() {
//		return this.gender;
//	}
//	
//	public int getAge() {
//		return this.age;
//	}
//	
//	public double getWeight() {
//		return this.weight;
//	}
//	
//	
//	//setter
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
//	
//	//toString
//	public String toString() {
//		return " " + name + " " + gender + " " + age +" " + weight + " ";
//	}
	
	//필드 데이터
	//이름 성별 나이 몸무게(소수점 포함)
	String name;
	String gender;
	int age;
	double weight;
	
	//전체 데이터 초기화하는 생성자
	public Human(String name,String gender,int age,double weight) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	public String getGender() {
		return this.gender;
	}
	public int getAge() {
		return this.age;
	}
	public double getWeight() {
		return this.weight;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWight(double weight) {
		this.weight = weight;
	}
	
	//toString
	public String toString() {
		return name+"\t"+gender+"\t"+age+"\t"+weight;
	}
}
