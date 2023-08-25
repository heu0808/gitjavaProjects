package testProject;
import java.util.*;
public class If {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		
//		if(num > 0) {
//			System.out.println("양수입니다.");
//		} else if (num == 0) {
//				System.out.println("0입니다.");
//			} else {
//				System.out.println("음수입니다.");
//			}
			
			
//			String season;
//			int month = sc.nextInt(), temperature = sc.nextInt();
//			
//			if(month == 1 || month == 2 || month == 12) {
//				season = "겨울 ";
//				if(temperature <= -15) {
//							season += "한파 경보";
//				} else if(temperature <= -12) {
//							season += "한파 주의보";
//				}
//			} else if(month >= 3 && month <= 5) { 
//				season = "봄";
//			} else if(month >= 6 && month <= 8) {
//				season = "여름";
//				if(temperature >= 35) {
//							season += "폭염 경보";
//				} else if(temperature >= 33) {
//					season += "폭염 주의보";
//				}
//			} else if(month >= 9 && month <= 11) { 
//				season = "가을";
//			} else {
//				season = "해당하는 계절이 없습니다.";
//			}
//			
//			System.out.println(season);
		
		//숫자를 하나 입력받고 해당숫자가 100보다 크면 "3자리 수 이상입니다." 출력
//		100보다 작으면 "3자리수 이하입니다"출력
		
//		int num = sc.nextInt();
//		
//		if(num>=100) {
//			System.out.println("3자리 수 이상입니다.");
//		} else {
//			System.out.println("3자리 수 이하입니다.");
//		
//			}
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		
//		if(num>0) {
//			System.out.println("양수다");
//		} else if(num == 0) {
//			System.out.println("0입니다");
//		} else {
//			System.out.println("양수가 아니다");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 입력 : ");
//		int num = sc.nextInt();
//		
//		if(num % 2 == 0) {
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("인원 수 : ");
//		int people = sc.nextInt();
//		System.out.print("사탕 개수 : ");
//		int candy = sc.nextInt();
//		
//			System.out.println("\n1인당 사탕 개수 : "+ (candy/people));
//		
//			System.out.println("남는 사탕 개수 : "+ (candy%people));
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름 : ");
//		String name = sc.nextLine();
//		System.out.print("학년(숫자만) : ");
//		int grade = sc.nextInt();
//		System.out.print("반(숫자만) : ");
//		int num1 = sc.nextInt();
//		System.out.print("번호(숫자만) : ");
//		int number = sc.nextInt();
//		System.out.print("성별(M/F) : ");
//		String gender = sc.next();
//		System.out.print("성적(소수점 아래 둘째자리까지) : ");
//		Float sexual = sc.nextFloat();
//		
//		if(gender.equals("M")) {
//			System.out.println("남");
//		} else {
//			System.out.println("여");
//		}
//	
//		System.out.printf("%d 학년 %d반 %d번 %s %s의 성적은 %.2f이다.",grade,num1,number,name,gender,sexual);
//		System.out.print(grade + "학년" + num1 + "반" + number +"번"+gender+"학생의 성적은"+sexual+"이다.");
		
//		Scanner sc = new Scanner(System.in);
//		
//		
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		
//		
//		if(age >= 20) {
//			System.out.println("성인");
//		} else if(age >= 13 && age <= 19 ) {
//			System.out.println("청소년");
//		} else {
//			System.out.println("어린이");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국어 : ");
//		int kor = sc.nextInt();
//		System.out.print("영어 : ");
//		int eng = sc.nextInt();
//		System.out.print("수학 : ");
//		int math = sc.nextInt();
//		System.out.println();
//		
//		int total = kor+eng+math;
//		float avg = total/3;
//		System.out.println("합계 : "+total);
//		System.out.println("평균 : "+avg);
//		
//		
//		if(avg >=40 && avg >= 60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
//		
//		Scanner sc = new Scanner(System.in);
//	
//		System.out.print("주민번호를 입력하세요(- 포함) : ");
//		String number = sc.nextLine();
//		
//		char gender = number.charAt(7);
//		if(gender == '2' || gender =='1') {
//			System.out.println("여자");
//		} else {
//			System.out.println("남자");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("A사원의 연봉 : ");
//		int A = sc.nextInt();
//		System.out.print("B사원의 연봉 : ");
//		int B = sc.nextInt();
//		System.out.print("C사원의 연봉 : ");
//		int C = sc.nextInt();
//		System.out.println();
//		
//		float Aincentive =0.4f;
//		System.out.println("A사원 연봉/연봉+a : "+A+"/"+(float)A*1.4+"/");
//		if((float)A*1.4 >= 3000) {
//			System.out.println("3000 이상");
//		} else {
//			System.out.println("3000 미만");
//		}
//		int Bincentive = 0;
//		System.out.println("B사원 연봉/연봉+a : "+B+"/"+(float)B+"/");
//		if((float)B >= 3000) {
//			System.out.println("3000 이상");
//		} else {
//			System.out.println("3000 미만");
//		}
//		double Cincentive = 0.15f;
//		System.out.println("C사원 연봉/연봉+a : "+C+"/"+C*1.15+"/");
//		if(C*1.15 >= 3000) {
//			System.out.println("3000 이상");
//		} else {
//			System.out.println("3000 미만");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("1.입력");
//		System.out.println("2.수정");
//		System.out.println("3.조회");
//		System.out.println("4.삭제");
//		System.out.println("7.종료");
//		System.out.print("메뉴 번호를 입력하세요 : ");
//		int number = sc.nextInt();
//		
//		if(number == 1) {
//			System.out.println("입력 메뉴입니다.");
//		}else if(number == 2) {
//			System.out.println("수정 메뉴입니다.");
//		}else if(number == 3) {
//			System.out.println("조회 메뉴입니다.");
//		}else if(number == 4) {
//			System.out.println("삭제 메뉴입니다.");	
//		}else if(number == 7) {
//			System.out.println("프로그램이 종료됩니다.");
//		}else {
//			System.out.println("다시 입력해주세요.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 한 개 입력하세요 : ");
//		int number = sc.nextInt();
//		
//		if(number > 0 && number % 2 == 0) {
//			System.out.println("짝수다");
//		} else if(number > 0 && number % 2 != 0){
//			System.out.println("홀수다");
//		}  else {
//			System.out.println("양수만 입력해주세요.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국어점수 : ");
//		int kor = sc.nextInt();
//		System.out.print("수학점수 : ");
//		int math = sc.nextInt();
//		System.out.print("영어점수 : ");
//		int eng = sc.nextInt();
//		System.out.println();
//		
//		int total = kor + math + eng;
//		float avg = total/3.0f;
//		System.out.println("국어 : "+kor);
//		System.out.println("수학 : "+math);
//		System.out.println("영어 : "+eng);
//		System.out.println("합계 : "+total);
//		System.out.println("평균 : "+avg);
//		
//		if(kor > 40 && math > 40 && eng > 40 && avg >= 60) {
//			System.out.println("축하합니다, 합격입니다!");
//		} else {
//			System.out.println("불합격입니다.");
//		} 
			
//		Scanner sc = new Scanner(System.in);
//		
//		
//		System.out.print("아이디 : ");
//		String id = sc.nextLine();
//		System.out.print("비밀번호 : ");
//		String password = sc.nextLine();
//		
//		
//		if(id.equals("myId") && password.equals("mypassword")) {
//			System.out.println("로그인 성공");
//		} else if(!id.equals("myId")) {
//			System.out.println("아이디가 틀렸습니다.");
//		} else {
//			System.out.println("비밀번호가 틀렸습니다.");
//		}
//			}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("입력 : ");
//		String season;
//		int month = sc.nextInt();
//		
//		
//		if(month == 1 || month == 2 || month == 12)
//		{
//			season = "겨울";
//		} else if (month >= 3 && month <= 5) {
//				season = "봄";
//		} else if (month >= 6 && month <= 8) {
//			season = "여름";
//		} else if (month >= 9 && month <= 11) {
//			season = "가을";
//		} else {
//			season = "해당하는 계절이 없습니다.";
//		}
//		System.out.println(season);
		
//		-실습문제6-
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
//		String str = sc.nextLine();
//	
//		
//		if (str.equals("관리자")) {
//			System.out.println("회원관리, 게시글 관리, 게시글 작성,댓글 작성,게시글 조회");
//		} else if(str.equals("회원")) {
//			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//		} else if(str.equals("비회원")) {
//			System.out.println("게시글 조회");
//	    } else {
//	    	System.out.println("잘못 입력하셨습니다.");
//	    }
		
//		-실습문제7-
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("키(m)를 입력해 주세요 : ");
//		double height = sc.nextDouble();
//		System.out.print("몸무게(kg)를 입력해 주세요 : ");
//		double kg = sc.nextDouble();
//		
//		double BMI = kg / (height*height);
//		
//		System.out.println("BMI 지수 : "+BMI);
//		if(BMI <= 18.5) {
//			System.out.println("저체중");
//		} else if(BMI >= 18.5 && BMI <= 23) {
//			System.out.println("정상체중");
//		} else if(BMI >= 23 && BMI <= 25) {
//			System.out.println("과체중");
//		} else if(BMI >= 25 && BMI <= 30) {
//			System.out.println("비만");
//		} else {
//			System.out.println("고도 비만");
//		}
		
//		-실습문제8-
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("피연산자1 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.print("피연산자2 입력 : ");
//		int num2 = sc.nextInt();
//		System.out.print("연산자를 입력(+,-,*,/,%) : ");
//		String num3 = sc.next();
//		
//
//		if(num1 < 0 && num2 <0 ) {
//			if(num3.equals("+")) {
//				System.out.println(num1+" + "+num2+" = "+(num1+num2));
//				System.out.printf("%d+%d = %d",num1,num2,(num1+num2));
//		} 	else if(num3.equals("-")) {
//				System.out.println(num1+" - "+num2+" = "+(num1-num2));
//		} 	else if(num3.equals("*")) {
//				System.out.println(num1+" * "+num2+" = "+(num1*num2));
//		} 	else if(num3.equals("/")) {
//				System.out.println(num1+" / "+num2+" = "+((double)num1/num2));
//		} 	else if(num3.equals("%")) {
//				System.out.println(num1+" % "+num2+" = "+(num1%num2));
//		} 	else {
//				System.out.println("잘못 입력하셨습니다.프로그램을 종료합니다.");
//		}
//	}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("중간 고사 점수 : ");
//		int midterm = sc.nextInt();
//		System.out.print("기말 고사 점수 : ");
//		int finals = sc.nextInt();
//		System.out.print("과제 점수 : ");
//		int assignment = sc.nextInt();
//		System.out.print("출석 회수 : ");
//		int attendance = sc.nextInt();
//		System.out.println("=============== 결과================");
//		
//		System.out.println("중간 고사 점수(20) : "+midterm*0.2);
//		System.out.println("기말 고사 점수(30) : "+finals*0.3);
//		System.out.println("과제 점수    (30) : "+assignment*0.3);
//		System.out.println("출석 점수    (20) : "+(float)attendance);
//		float total = (midterm*0.2f)+(finals*0.3f)+(assignment*0.3f)+(attendance);
//		System.out.println("총점 : "+total);
//		
//		if(total < 70) {
//			System.out.println("Fail[점수 미달]");
//		} else if (attendance >= (20*0.7)) {
//			System.out.println("Fail[출석횟수 미달]");
//		} else {
//			System.out.println("Pass");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("1.권한 확인");
//		System.out.println("2.BMI");
//		System.out.println("3.계산기");
//		System.out.println("4.P/F");
//		
//		System.out.println("선택 : ");
//		int number = sc.nextInt();
		
		
	}
}

