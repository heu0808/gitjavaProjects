package com.kh.javas;

public class Car {
	//색상, 제조회사,타입, 엔진, 제조날짜, 최대속도
	String color; //색상
	String company; //제조회사
	String type; //타입(소형,중형,경차,준중형,SUV)
	String engine; //엔진
	String date; //제조날짜
	int maxspeed; //최대속도
	int zero100; //제로백
	int speed; //속도
	int maxCc; //최대 주유량
	int cc; //주유량
	
	//색상, 제조회사, 타입,엔진,제조날짜를 넘겨받아 초기화하는 생성자를 생성,zero100,maxCc
    //나머지 값들은 알맞은 방식으로 초기화
	public Car() {
		
	}
	
	public Car(String color,String company,String type,
				String engine,String date,int maxspeed,
				int zero100,int maxCc) {
		this.color = color;
		this.company = company;
		this.type = type;
		this.engine = engine;
		this.date = date;
		this.maxspeed = maxspeed;
		this.zero100 = zero100;
		this.maxCc = maxCc;
		this.cc = 0;
		this.speed = 0;
		
	}
	
	public int onAxel() {
		if((speed + 5) >= maxspeed) {
			speed = maxspeed;
		} else {
			speed += 5;
		}
		return speed;
	}
	
	public int onBreak() {
		if((speed - 5) <= 0) {
			speed = 0;
		} else {
			speed = -5;
		}
		return speed;
	}
	
	//넣은 기름만큼 추가 남은 양 반환
	public int insertCc(int plusCc) {
		if(cc + plusCc >= maxCc) {
			int tmpCc = (cc+ plusCc -maxCc);
			cc = maxCc;
			return tmpCc;
		} else {
			cc += plusCc;
			return 0;
		}
	}
	
	//statusDisplay 차량상태 확인
	public void statusDisplay(int type) {
		switch(type) {
		case 1:
		System.out.println("색상은 "+color+" 회사는 "+company+" 타입은"+type+
				"\n엔진은 "+engine+"제조일자는 "+date+" 최대속도는 "+maxspeed+
				"\n제로백은 "+zero100+" 최대 주유량은 "+maxCc+" 주유량은 "+cc+" 속도는 "+speed);
		break;
		case 2: 
			System.out.println("속도 : "+speed);
			System.out.println("잔여 기름 : "+ cc);
		}
	}
	
}
