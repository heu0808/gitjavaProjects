package testProject;
import java.util.*;
import java.util.Arrays;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		
		/*
		 * 1. 배열형식의 참조변수 선언 -> 예)int[] ref;
		 * 2. 배열객체 할당 -> 예) ref = new int[6];
		 * 3. 배열 데이터 초기화 -> 예) ref[0] =1; ref[1] = 2; .......
		 * 예) <반복문을 이용해서 배열 초기화>
		 * 	for(int i = 0; i < ref.length; i++)
		 * 	   ref[i] = i + 1;
		 * 4. 배열 데이터 활용 
		 * 예) for(int i = 0; i < ref.length; i++)
		 * 		  System.out.print(ref[i]);
		 */
		
//		int형 변수 num을 생성하고 값을 10으로 초기화
//		int num = 10;		
//		
////		String형 변수 str을 생성하고 값을 "hi"로 초기화
//		String str = "hi";
//		
////		num과 str을 출력
//		System.out.println(num);
//		System.out.println(str);
//		
//		만약 num이 5보다 크다면 "num은 5보다 큰 수입니다"출력
//		더 작아면 "num은 5보다 작은 수 입니다"출력
//		5라면 "num은 5입니다"출력
//		
//		if(num > 5) {
//			System.out.println("num은 5보다 큰 수입니다.");
//		} else if(num < 5){
//			System.out.println("num은 5보다 작은 수 입니다.");
//		} else {
//			System.out.println("num은 5입니다.");
//		}
//		
//		반복문을 활용하여 1~num까지 숫자를 순차적으로 출력
//		ex) num = 3일때 1 2 3 출력
//		for while 각각 작성
//		for(int i = 1; i < num; i++) {
//			System.out.println(i);
//		}
//		
//		int i = 1;
//		while(i < num) {
//			System.out.println(i);
//			i++;
//		}
//		
//		길이가 20인 int형 배열 arr생성 후 반복문을 이용하여 값을 1~20까지 순차적으로 초기화
//		int[] arr = new int[20];
//		
//		for(int j = 0; j < arr.length; j++) {
//			arr[j] = j+1;
//		}
//		반복문을 이용하여 arr 요소 전체출력
//		for(int a = 0; a < arr.length; a++) {
//			System.out.println(arr[a]);
//		}
//		String형 길이가 5인 배열 arr2 생성하고 생성과 동시에 {"사과","포도","귤","파인애플","바나나"}로 초기화
//		String[] arr2 = {"사과","포도","귤","파인애플","바나나"};
//		반복문을 이용하여 arr2 요소 전체출력
//		for(int i = 0; i < arr2.length; i++) {
//			arr2[i] = i+1;
//		}
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2);
//		}
		
//		int[] ar = new int[3]; 
//		
//		ar[0] = 7;
//		ar[1] = 8;
//		ar[2] = 9;
//		
//		int num = ar[0] + ar[1] + ar[2];
//		System.out.println(num);
		
//		길이가 5인 int형 1차원 배열 생성
//		int[] arr = new int[5];
		
//		길이가 7인 double형 1차원배열 ar2 생성
//		double[] ar2 = new double[7];
		
		//배열의 변수선언과 메모리할당을 분리하여 길이가 9인 float형 배열 ar3 생성
//		float[] ar3;
//		ar3 = new float[9];
//		
//		System.out.println("arr의 길이 : "+ arr.length);
//		System.out.println("ar2의 길이 : "+ ar2.length);
//		System.out.println("ar3의 길이 : "+ ar3.length);
//		
//		String str = "abc";
//		System.out.println("str의 길이 : "+str.length());
		
//		String str[] = new String[5];
//		str[0] = "abc";
//		str[1] = new String("abcdef");
//		str[4] = "hello";
//		str[2] = "bye";
//		str[3] = "good";
//		
//		int count = 0;
//		
//		for(int i = 0; i < str.length; i++) {
//			count += str[i].length();
//			
//			
//		} System.out.println("총 문자의 수는 "+count);
		
		//얕은 복사
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = arr1;
//		arr2[2] = 0;
//		System.out.println(arr1[2]);
		
		//완전한 복사
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = new int[5];
				
//		for(int i = 0; i < arr1.length; i++) {
//			arr2[i] = arr1[i];
//			
//		}
//		//반복문을 통해서 arr2에 있는 모든 요소 출력
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println("arr1[" + i + "] :"+arr1[i]);
//		}
//		
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println("arr2[" + i + "] :"+arr2[i]);
//		}
		
		//보편적인 배열 복사방법
//		arr2 = arr1.clone();
		
		//배열 arr1을 전부 7로 초기화
//		Arrays.fill(arr1, 7);
		
//		-배열 실습문제1-
		
//		int[] arr = new int[10];
//		
//		for(int i = 1; i <= 10; i++) {
//			arr[i - 1] =i;
//			System.out.print(arr+" ");
//		}
		
//		-배열 실습문제2-
		
//		int[] arr = new int[10];
//		 
//		for(int i = 0; i < 10; i++) {
//			arr[i] = (10-i);
//			System.out.print(arr[i]+" ");
//		}
		
//		-배열 실습문제3-
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("양의 정수 : ");
//		int num = sc.nextInt();
//		
//		int[] arr = new int[num];
//		
//		//배열의 1~n까지의 값 초기화
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//		} 
		
//		배열의 1~n까지의 값 출력
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
//		-배열 실습문제4-
		
//		String[] str = new String[5];
//		
//		str[0] = "사과";
//		str[1] = "귤";
//		str[2] = "포도";
//		str[3] = "복숭아";
//		str[4] = "참외";
//		
//		System.out.println(str[1]);
		
//		-배열 실습문제5-
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문자열 : ");
//		String str = sc.next();
//		int[] str1 = new int[str.length()];
//		System.out.print("문자 : ");
//		char ch = sc.next().charAt(0);
//		int count = 0;
//		
//		System.out.print("application에 i가 존재하는 위치(인덱스) : ");
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == ch) {
//				System.out.print(i+" ");
//				count++;
//				System.out.println();
//			}
//		}
//		
//		System.out.println("i 개수 : "+count);
		
//		-배열 실습문제6-
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("0 ~ 6 사이 숫자 입력 : ");
//		int day = sc.nextInt();
//		
//		String[] day1 = {"월","화","수","목","금","토","일"};
//		
//		switch(day) {
//		case 0:
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//		case 6:
//			System.out.println(day1[day] + "요일");
//			break;
//		default:
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
//		-배열 실습문제7-
		
//		Scanner sc = new Scanner(System.in);
//		
//		int[] index;
//		int sum;
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		index = new int[num];
//		
//		for(int i = 0; i < index.length; i++) {
//			System.out.println("배열 "+i+"번째 인덱스에 넣을 값 : ");
//			index[i] = sc.nextInt();
//		}
//		for (int i = 0; i < index.length; i++) { 
//			sum += index[i];
//			System.out.println(index[i]+ " ");
//		}
//		System.out.println("/n총 합 : "+ sum);
		
//		-배열 실습문제8-
		
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arr;
//		int count = 0;
//		int num;
//		
//		while(true) {
//	 		System.out.print("정수 : ");
//			num = sc.nextInt();
//		
//			if(num % 2== 1 && num >= 3) {
//			arr = new int[num];
//		
//		//0~ (n-1)까지 단 반복중간값까지는 1부터 1씩 늘려 저장 중간이후는 1씩 빼서 저장
//			for(int i = 0; i < arr.length; i++) {
//				if(arr.length / 2 < i) {
//					count--;
//				} else {
//					count++;
//				}
//				arr[i] = count;
//			}
//		
//			for(int i = 0; i < arr.length; i++) {
//				System.out.print(arr[i] + " ");
//			}
//			break;
//			}else {
//				System.out.println("다시 입력하세요.");
//			}
//		}
		
//		-배열 실습문제9-
		
//		Scanner sc = new Scanner(System.in);
//		
//		String str, result = null;
//		
//		String[] arr = {"후라이드","양념","간장","파닭"};
//		
//		System.out.print("치킨 이름을 입력하세요 : ");
//		str = sc.next();
//		result = str + "치킨은 없는 메뉴입니다.";
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(str.equals(arr[i])) {
//				result = str + "치킨 배달 가능";
//				break;
//			}
//		} System.out.println(result);
		
//		-배열 실습문제10-
		
//		Scanner sc = new Scanner(System.in);
//		
//		char[] st;
//		
//		System.out.print("주민등록번호(-포함) : ");
//		String num = sc.next();
//		st = new char[num.length()];
//		
//		for(int i = 0; i < num.length(); i++) {
//			if(i >= 8) {
//				st[i] = '*';
//			} else {
//				st[i] = num.charAt(i);
//			}
//			
//		} for(int i = 0; i < num.length(); i++) {
//			System.out.print(st[i]);
//		}
		
//		-배열 실습문제11-
		
		//Math.random() : 0보다 크고 1보다 작은 난수 발생
		//값을 곱하고 int형으로 변환해서 정수형 난수를 발생시킬 수 있다.
		
//		System.out.println((int)(Math.random() * 10 + 1));
		
//		int[] num = new int[10];
//		
//		for(int i = 0; i < num.length; i++) {
//			num[i] = (int)(Math.random() * 10 + 1);
//		}
//		for(int i = 0; i < num.length; i++) {
//			System.out.print(num[i]+ " ");
//		}
		
//		-배열 실습문제12-
		
//		int max = 0;
//		int min = 11;
//		
//		int[] num = new int[10];
//		
//		for(int i = 0; i < num.length; i++) {
//			num[i] = (int)(Math.random()* 10 + 1);
//			System.out.println(num[i]);
//			
//			if(num[i] > max) {
//				max = num[i];
//			} else if(num[i] < min) {
//				min = num[i];
//			}
//		} System.out.println("최대값 : "+max);
//		System.out.println("최소값 : "+min);
	
//		-배열 실습문제13-
		
//		int[] num = new int[10]; //배열선언
//		
//		int i = 0;
		//[4,5,0,0]
//		while(i < num.length) {
//		
//			//난수 입력받기
//			int nan = (int)(Math.random()*10+1);
//			
//			//난수 검사
//			for(int j = 0; j < num.length; j++) {
//				if(num[j] == nan) {
//					nan = 0;
//					break;
//				}
//			}
//			if(nan == 0)
//				continue;
//			else {
//				num[i] = nan;
//				i++;
//			}
//		}
//		for(i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
		
//		-배열 실습문제14-
		
//		int[] num = new int[6];
//		
//		int i = 0;
//	
//		while(i < num.length) {
//		
//			//난수 입력받기
//			int nan = (int)(Math.random()*45+1);
//			
//			//난수 검사
//			for(int j = 0; j < num.length; j++) {
//				if(num[j] == nan) {
//					nan = 0;
//					break;
//				}
//			}
//			if(nan == 0)
//				continue;
//			else {
//				num[i] = nan;
//				i++;
//			}
//		}
//		Arrays.sort(num);
//		for(i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
		
//		-배열 실습문제15-
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문자열 : ");
//		String str = sc.next(); //application
//		
//		char[] ch = new char[str.length()];
//		int i = 0, j = 0;
//		
//		while(i < str.length()) {
//			ch[j] = str.charAt(i);
//			//중복검사
//			for(int k = 0; k < j; k++) {
//				if(ch[j] == ch[k]) {
//					j--;
//					break;
//				}
//			}
//			i++;
//			j++;
//		}
//		
//		System.out.print("문자열에 있는 문자 : ");
//		for(int h = 0; h < str.length(); h++) {
//			
//			if(h == (ch.length -1) || ch[h+1] == 0) {
//				System.out.print(ch[h]);
//				System.out.print("\n문자 개수 : " + (h+1));
//				break;
//			} else {
//				System.out.print(ch[h] +  ", ");
//			}
//		} 
		
//		-배열 실습문제16-
		
//		Scanner sc = new Scanner(System.in);
//		
//		String[] strArray,strArray2;
//		int num;
//		int i = 0;
//		
//		System.out.print("배열의 크기를 입력하세요 : ");
//		num = sc.nextInt();
//		
//		strArray = new String[num];
//		
//		while(true) {
//			//문자열을 입력받는 부분
//			for(; i < strArray.length; i++) {
//				System.out.print((i+ 1)+ "번째 문자열 : ");
//				strArray[i] = sc.nextLine();
//				sc.next();
//			}
//			
//			//더 입력할지 안할지 확인부분
//			System.out.print("더 값을 입력하시겠습니까?(Y/N)");
//			
//			//더 입력하겠다.
//			if('Y' == sc.next().charAt(0)) {
//				System.out.print("배열의 크기를 입력하세요 : ");
//				num = sc.nextInt();
//				
//				strArray2 = new String[strArray.length + num];
//				
//				for(i = 0; i < strArray.length; i++) {
//					strArray2[i] = strArray[i];
//				}
//				strArray = strArray2;
//			} else { //그만 입력하겠다.
//				System.out.print("[");
//				for(i = 0; i < strArray.length; i++) {
//					if(i == strArray.length -1)
//					System.out.print(strArray[i] + "] ");
//					else 
//					System.out.print(strArray[i] + ", ");
//				
//				break;
//				}
//			}
//		}
		
//		<2차원배열>
		
		//크기가 4인 1차원 배열 3개를 담고 있는 2차원 배열을 만들어라(자료형 : int)
//		int[][] num = new int[3][4];
//		num[0][0] = 1;
//		num[0][1] = 2;
//		num[0][2] = 3;
//		num[0][3] = 4;
//		num[1][0] = 5;
//		num[1][1] = 6;
//		num[1][2] = 7;
//		num[1][3] = 8;
//		num[2][0] = 9;
//		num[2][1] = 10;
//		num[2][2] = 11;
//		num[2][3] = 12;

//		num[0][0] =5;
//		num[1][0] =5;
//		num[2][0] =5;
//		
//		for(int i = 0; i < num.length;i++) {
//			num[i][0] = 5;
//		}
//		for(int i = 0; i < num[1].length; i++) {
//			num[1][i] = 5;
//		}
		
//		for(int i = 0; i < num[0].length; i++)
//			num[0][i] = 5;
//		
//		for(int i = 0; i < num[1].length; i++)
//			num[1][i] = 5;
//		
//		for(int i = 0; i < num[2].length; i++)
//			num[2][i] = 5;
//		
//		//2차원 배열 전체 출력
//		for(int j = 0; j < num.length; j++) {
//			for(int i = 0; i < num[j].length; i++) {
//				System.out.println(num[j][i]);
//			}
//				
//		}
		
		//크기가 각각 4,3,5,2인 1차원 배열들로 생성된 2차원 배열을 만들고 값을 전부 10으로 초기화

//		int[][] num = {
//					{10,10,10,10},
//					{10,10,10},
//					{10,10,10,10,10},
//					{10,10}
//					};
		
//		int[] arr = {1,2,3};
//		int[][] arr = {
//						{5,5,5,5},
//						{5,5},
//						{5,5,5}
//					  };
		
//		-2차원배열 실습문제1-
		
//		String[][] num = new String[3][3];
		
//		num[0][0] = "(0, 0)";
//		num[0][1] = "(1, 0)";
//		num[0][2] = "(2, 0)";
//		num[1][0] = "(0, 1)";
//		num[1][1] = "(1, 1)";
//		num[1][2] = "(2, 1)";
//		num[2][0] = "(0, 2)";
//		num[2][1] = "(1, 2)";
//		num[2][2] = "(2, 2)";
//		
//		String[][] num = {
//						{"(0,0)","(0,1)","(0,2)"},
//						{"(1,0)","(1,1)","(1,2)"},
//						{"(2,0)","(2,1)","(2,2)"}
//						};
		
//		for(int i = 0; i < num.length; i++) {
//			
//		}
		
//		char[][] num = new char[3][3];
//		
//		char ch = 'a';
//		num[0][0] = ch++;
//		num[0][1] = ch++;
//		num[0][2] = ch++;
//		num[1][0] = ch++;
//		num[1][1] = ch++;
//		num[1][2] = ch++;
//		num[2][0] = ch++;
//		num[2][1] = ch++;
//		num[2][2] = ch++;
//		
////		char[][] num = {
////						{'a','b','c'},
////						{'d','e','f'},
////						{'g','h','i'}
////					   };
//		
//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j < num[i].length; j++)
//			num[i][j] = ch++;
//		}
//		
//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j < num[i].length; j++)
//			System.out.println(num[i][j] + " ");
//		}
//		System.out.println();
		
//		-2차원배열 실습문제2-
		
//		int[][] num = new int[4][4];
//		
//		int num1 = 1;
//		num[0][0] = num1++;
//		num[0][1] = num1++;
//		num[0][2] = num1++;
//		num[0][3] = num1++;
//		num[1][0] = num1++;
//		num[1][1] = num1++;
//		num[1][2] = num1++;
//		num[1][3] = num1++;
//		num[2][0] = num1++;
//		num[2][1] = num1++;
//		num[2][2] = num1++;
//		num[2][3] = num1++;
//		num[3][0] = num1++;
//		num[3][1] = num1++;
//		num[3][2] = num1++;
//		num[3][3] = num1++;
//		
////		int[][] num = {{1,2,3,4},
////					   {5,6,7,8},
////					   {9,10,11,12},
////					   {13,14,15,16}
////					  };
//		num1 = 1;
//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j < num[i].length; j++)
//				num[i][j] = num1++;
//		}
//		
//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j < num[i].length; j++)
//				System.out.println(num[i][j] + " ");
//		}		
//		System.out.println();
		
		
//		-2차원배열 실습문제3-
		
//		int[][] num = new int[4][4];
//		
////		int num1 = 16;
////		num[0][0] = num1--;
////		num[0][1] = num1--;
////		num[0][2] = num1--;
////		num[0][3] = num1--;
////		num[1][0] = num1--;
////		num[1][1] = num1--;
////		num[1][2] = num1--;
////		num[1][3] = num1--;
////		num[2][0] = num1--;
////		num[2][1] = num1--;
////		num[2][2] = num1--;
////		num[2][3] = num1--;
////		num[3][0] = num1--;
////		num[3][1] = num1--;
////		num[3][2] = num1--;
////		num[3][3] = num1--;
////		
////		int[][] num = {{16 15 14 13},
////				{12 11 10 9},
////				{8 7 6 5},
////				{4 3 2 1} 
////				};
//		
//		int num1 = 16;
//		for(int i = 0; i < num.length; i--)
//			for(int j = 0; j < num.length; i--) {
//				num[i][j] = num1--;
//			}
//		
//		for(int i = 0; i < num.length; i--) {
//			for(int j = 0; j < num[i].length; j--)
//				System.out.println(num[i][j] + " ");
//		}		
//		System.out.println();
		
//		-2차원배열 실습문제4-
		
		int[][] arr = new int[4][4];
		
		arr[0][0] = 6;
		arr[0][1] = 6;
		arr[0][2] = 1;
		arr[0][3] = arr[0][0]+arr[0][1]+arr[0][2];
		
		arr[1][0] = 4;
		arr[1][1] = 10;
		arr[1][2] = 8;
		arr[1][3] = arr[1][0]+arr[1][1]+arr[1][2];
		
		arr[2][0] = 8;
		arr[2][1] = 6;
		arr[2][2] = 5;
		arr[2][3] = arr[2][0]+arr[2][1]+arr[2][2];
		
		arr[3][0] = arr[0][0]+arr[1][0]+arr[2][0];
		arr[3][1] = arr[0][1]+arr[1][1]+arr[2][2];
		arr[3][2] = arr[0][2]+arr[1][2]+arr[2][2];
		arr[3][3] = arr[3][0] + arr[3][1] + arr[3][2] +
				arr[0][3] + arr[1][3] + arr[2][3];
		
		
//		int[][] arr = {{6 6 1 13},
//					   {4 10 8 22},
//					   {8 6 5 19} 
//					   };
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < (arr[i].length-1); j++) {
				arr[i][j] = (j+1+(i*3));
				arr[i][3] += arr[i][j];
				arr[3][3] += arr[i][j];
			}
			arr[3][0] += arr[i][0];
			arr[3][1] += arr[i][1];
			arr[3][2] += arr[i][2];
			arr[3][3] += arr[i][0];
			arr[3][3] += arr[i][1];
			arr[3][3] += arr[i][2];
		}
		
//		String str = "안녕하세요";
//		
//		if(str.equals("안녕하세요")) {
//			System.out.println(str);
//		} else {
//			System.out.println("hi");
//		}
//		
//		int[] arr = new int[8];
//		arr[0] = 5;
//		arr[1] = 5;
//		arr[2] = 5;
//		arr[3] = 5;
//		arr[4] = 5;
//		arr[5] = 5;
//		arr[6] = 5;
//		arr[7] = 5;
//		
//		for(int i = 0; i < arr.length; i++)
//			System.out.print(arr[i]+" ");
		
//		char[][] arr2 = new char[3][2];
//		
//		
//		arr2[0][0] = 'a';
//		arr2[0][1] = 'b';
//		arr2[1][0] = 'c';
//		arr2[1][1] = 'd';
//		arr2[2][0] = 'e';
//		arr2[2][1] = 'f';
//		
//		
//		char ch = 'a';
//		for(int i = 0; i < arr2.length; i++) { 
//			for(int j = 0; j < arr2[i].length; j++) {
//				arr2[i][j] = ch++;
//			}
//		}
//		
//		for(int i = 0; i < arr2.length; i++) { 
//			for(int j = 0; j < arr2[i].length; j++) {
//				System.out.print(arr2[i][j]+" ");
//			}
//		}
		
		
	}
}
