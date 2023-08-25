package com.kh.javas;

//class에 접근제한자를 설정하지 않으면
//default로 설정되고 다른 패키지에서 사용 할 수 없다.
public class Student {
	//필드(데이터 집합)
	//이름, 나이, 성별, 수학점수, 영어점수, 국어점수
	static int count = 0; // 총 학생의 수
	public String name;
	private int age;
	private String gender;
	private int mathScore;
	private int engScore;
	private int korScore;
	
	//생성자
	//인스턴스 객체를 생성할 때 데이터를 초기화하기 위해
	//자동으로 한번만 실행하는 특별한 메서드
	//메서드처럼 접근해서 실행 할 수 없으며 class의 이름과 동일한 이름을 가진다.
	//초기화를 위한 메서드이기 때문에 반환값은 없다.
	/* 기본생성자
	 * 생성자를 아무것도 작성하지 않았을 때
	 * 컴파일러가 기본적으로 생성해주는 생성자(아무 기능이 없다.)
	 * public Student(){}
	 */
	
	public Student() {
		count++;
		System.out.println("student의 기본생성자");
	}
	public Student(String tName,int tAge,String tGender) {
		count++;
		name = tName;
		age = tAge;
		gender = tGender;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("학생이 추가되었습니다.");
	
	}
	
	//생성자는 여러개 생성이 가능하다.
	//생성자가 여러개 일때는 매개변수를 통해서 식별한다.
	//애매한 생성자는 사용을 지양한다.
	
	
	//메서드(기능 집합)
	//info메서드 생성
	//저는 oo살의 상oo ooo입니다.
	public void info() {
		System.out.println(name + "\t" + age + "\t" + gender);
	}
	
	//set메서드(setter) -> 필드데이터에 값을 저장하기 위한 메서드
	public void setEnScore(int tEnScore) {
		if(tEnScore < 0) {
			engScore = 0;
			return;
		}
		engScore = tEnScore;
	}
	public void setMaScore(int tMaScore) {
		if(tMaScore < 0) {
			mathScore = 0;
			return;
		}
		mathScore = tMaScore;
	}
	public void setkoScore(int tKorScore) {
		if(tKorScore < 0) {
			korScore = 0;
			return;
		}
		korScore = tKorScore;
	}
	
	//get메서드(getter) -> 필드데이터에 값을 사용하기 위한 메서드
	public int getEnScore() {
		return engScore;
	}
	public int getMaScore() {
		return mathScore;
	}
	public int getKorScore() {
		return korScore;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// 기능을 담당하는 메서드
	// 토탈값을 반환하는 메서드
	
	public int getTotal() {
		return (engScore + mathScore + korScore);
	}
	public float getAvg() {
		return (int)(engScore + mathScore + korScore/3.0f);
	}
	
	// 합격인지 불합격인지 결과를 출력해주는 메서드
	public void checkPass() {
		if(engScore >= 40 && mathScore >= 40 && 
				korScore >= 40 && 
						getAvg() >= 60) {
			
			System.out.println("합격입니다."); 
			} else {
				System.out.println("불합격입니다.");
			}
	}
		
		public boolean checkPassIsnum() {
			if(engScore >= 40 && mathScore >= 40 && 
					korScore >= 40 && 
							getAvg() >= 60) {
				return true; 
				} else {
					return false;
				}
	
	}
	
	// displayMyInfo 메서드를 만들어보자
	// 매개변수는 없고 리턴값도 존재하지 않는다.
	// 실행결과로 저는 oo살의 ooo입니다.
	// 국어 : oo점 , 영어 : oo점, 수학 : oo점, 합계 : oo점, 평균 : oo점
	// 으로 시험에 합격하였습니다.
	
	public void displayMyInfo() {
		System.out.println("저는 "+age+"살 "+name+"입니다.");
		System.out.println("영어 : "+engScore);
		System.out.println("수학 : "+mathScore);
		System.out.println("국어 : "+korScore);
		System.out.println("합계 : "+ getTotal());
		System.out.println("평균 : "+getAvg());
		
		if(checkPassIsnum()) {
			System.out.println("시험에 합격하였습니다.");
		} else {
			System.out.println("시험에 불합격하셨습니다.");
		}
	}
//	매개변수 값과 객체의 데이터가 동일하다면 true,아니면 false를 반환
	public boolean equals(String name,int age, String gender) {
		if(this.name.equals(name) && this.age == age && this.gender.equals(gender)) {
		return true;
	} else 
		return false;
	}
	public static int showCount() {
		return count;
	}
}
