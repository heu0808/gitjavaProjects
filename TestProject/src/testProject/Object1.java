package testProject;
import java.util.*;
public class Object1 {

	public static void main(String[] args) {
//		//double형 변수 num을 생성하고 3.75를 대입해라
//		double num = 3.75;
//		//int형 변수 num2를 생성하고 숫자를 하나 입력받아라
//		Scanner sc = new Scanner(System.in);
//		int num2;
//		num2 = sc.nextInt();
//		//입력받은 num2를 활용하여 1차원배열을 arr을 하나 만들고 모든 수를 5로 초기화한다.
//		int[] arr = new int[num2];
//		for(int i = 0; arr.length; i++)
//			arr[i] =5;
//		
//		//arr배열의 2 인덱스 값에 0을 넣어준다.
//		arr[2] = 0;
//		//arr배열을 처음부터 끝까지 아래와 같은 방식으로 출력한다.
//		//배열안에 값이 5일때 5출력
//		//배열안에 값이 0일때 "5가 아닙니다"
//		for(int i = 0; arr.length; i++)
//			if() {
//			
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국어 : ");
//		int kor = sc.nextInt();
//		System.out.print("영어 : ");
//		int eng = sc.nextInt();
//		System.out.print("수학 : ");
//		int math = sc.nextInt();
//		
//		int total = kor+eng+math;
//		float avg = total/3;
//		
//		System.out.print("합계 : "+total+"\n");
//		System.out.print("평균 : "+avg+"\n");
//		
//		if(kor >= 50 && eng >= 50 && math >= 50) {
//		} else if(avg >= 70) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		for(int i = 1; i <= num; i++) {
//			System.out.print(i + " ");
//		}
//		if()
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//		System.out.print("행 크기 : ");
//		int h = sc.nextInt();
//		System.out.print("열 크기 : ");
//		int y = sc.nextInt();
//		
//		char[][] num = new char[h][y];
//		
//		if(h < 1 || h > 10)
//			System.out.println("반드시 1 ~10 사이의 정수를 입력해야 합니다.");
//			
//			
//			
//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j < num[i].length; j++) {
//				num[i][j] = (char)(Math.random()*26+65);
//			}
//		}
//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j < num[i].length; j++) {
//				System.out.println(num[i][j] + " ");
//				}
//			
//			}
//		}
		
//		String[][] strArr = {{"이","까","왔","앞","힘"},
//				  			 {"차","지","습","으","냅"},
//				  			 {"원","열","니","로","시"},
//				  			 {"배","심","다","좀","다"},
//				  			 {"열","히","!","더","!! "}};
//		
//		for(int i = 0; i < strArr[i].length; i++) {
//			for(int j = 0; j < strArr.length; j++) {
//				System.out.print(strArr[j][i] + " ");
//			}
//			System.out.println();
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("행의 크기 : ");
//		int num = sc.nextInt();
//		
//		char[][] h = new char[num][];
//		
//		for(int i = 0; i < h.length; i++) {
//			System.out.print(i+"행의 열 크기 : ");
//			int y = sc.nextInt();
//			
//			h[i] = new char[num];
//			
//		}
//		
//		char a = 'a';
//		for (int i = 0; i < h.length; i++) {
//			for(int j = 0; j < h[i].length; j++) {
//				h[i][j] = a++;
//				System.out.println(h[i][j]);
//			}
//		}
		
		
//		String[] st = {"강건강","남나나","도대담","류라라","문미미","박보배",
//						"송성실","윤예의","진재주",
//						"차천축","피풍표","홍하하"};
//		
//		String[][] bun1 = new String[3][2];
//		String[][] bun2 = new String[3][2];
//		
//		int index = 0;
//		for(int i = 0; i < bun1.length; i++) {
//			for(int j = 0; j < bun1[i].length; j++) {
//				bun1[i][j] = st[index];
//				index += 1;
//			}
//		}
//		for(int i = 0; i < bun2.length; i++) {
//			for(int j = 0; j < bun2[i].length; j++) {
//				bun1[i][j] = st[index];
//				index += 1;
//		
//		
//			}
//		} 
//		for(int i = 0; i < bun1.length; i++) {
//			for(int j = 0; j < bun1[i].length; j++) {
//				bun1[i][j] = st[index];
//				System.out.println(bun1[i][j] + " ");
//			}		
//		}
//		for(int i = 0; i < bun2.length; i++) {
//			for(int j = 0; j < bun2[i].length; j++) {
//				bun1[i][j] = st[index];
//				System.out.println(bun2[i][j] + " ");
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		String[] st = {"강건강","남나나","도대담","류라라","문미미","박보배",
//				"송성실","윤예의","진재주",
//				"차천축","피풍표","홍하하"};
//		
//		String[][] bun1 = new String[3][2];
//		String[][] bun2 = new String[3][2];
//		
//		int index = 0;
//		
//		for(int i = 0; i < bun1.length; i++) {
//			for(int j = 0; j < bun1[i].length; j++) {
//				bun1[i][j] = st[index];
//				index += 1;
//			}
//		} 
//		for(int i = 0; i < bun2.length; i++) {
//			for(int j = 0; j < bun2[i].length; j++) {
//				bun2[i][j] = st[index];
//				index += 1;
//			} 
//		} 
//		
//		System.out.println("=== 1분단 ===");
//		for(int i = 0; i < bun1.length; i++){
//			
//			for(int j = 0; j < bun1[i].length; j++) {
//				System.out.print(bun1[i][j] + " ");
//			}System.out.println();
//		} 
//		
//		System.out.println("=== 2분단 ===");
//		for(int i = 0; i < bun2.length; i++) {
//			for(int j = 0; j < bun2[i].length; j++) {
//				System.out.print(bun2[i][j] + " ");
//			}System.out.println();
//		} 
//		System.out.println("========================");
//		
//		System.out.print("검색할 학생 이름을 입력하세요 : ");
//		String stu = sc.next();
//		int bun,line,isR;
//		boolean isTrue = false;
//		
//		for(int i = 0; i < bun1.length && !isTrue; i++){
//			for(int j = 0; j < bun1[i].length && !isTrue; j++) {
//				if(bun1[i][j].equals(stu)) {
//					bun = 1;
//					line = i;
//					isR = j;
//					isTrue = true;
//				}
//				
//			}
//		} 
//		
//		if(!isTrue) {
//		for(int i = 0; i < bun2.length && isTrue; i++) {
//			for(int j = 0; j < bun2[i].length && !isTrue; j++) {
//				if(bun2[i][j].equals(stu)) {
//					bun = 1;
//					line = i;
//					isR = j;
//					isTrue = true;
//				}
//			}
//		}
//	}
//		if(isTrue) {
//			System.out.println("검색하신 "+ stu + "학생은 " + bun + "분단 " + 
//							    (line == 0 ? ("첫번째") : (line == 1 ? ("두번째") : ("세번째")) )+ "줄" +
//							    " " + (isR == 0 ? "왼쪽" : "오른쪽")+"에 있습니다.");
//		} else {
//			System.out.println("검색하신 " + stu + "학생은 찾지 못했습니다.");
//		}
	}
}
