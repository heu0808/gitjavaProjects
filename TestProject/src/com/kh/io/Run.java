package com.kh.io;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Library lb = new Library();
		lb.mainMenu();
		//library 객체 안에 createBook 메서드를 작성해보세요.
		
		
//		String name, residentNumber;
//		int age;
//		char gender;
//		
////		이름, 나이, 주민등록번호, 성별을 입력받아 사람객체 한개를 생성한다.
//		System.out.print("이름을 입력하세요 : ");
//		name = sc.nextLine();
//		System.out.print("나이를 입력하세요 : ");
//		age = sc.nextInt();
//		sc.nextLine();
//		System.out.print("주민등록번호 앞 6자리를 입력하세요 : ");
//		residentNumber = sc.nextLine();
//		System.out.print("성별을 입력해주세요.(남 : M, 여자는 : F) : ");
//		gender = sc.next().toUpperCase().charAt(0);
//		
//		Human gildong = new Human(name,age,residentNumber,gender);
//		System.out.println(gildong.toString());
		
		
//		Human gildong = new Human("choi",21,"123456-456789",'m');
//		Book[] gildongBookList = gildong.getBookList();
////		gildongBookList[0] = new Book("꿈꾸는 다락방");
//		String gildongName = gildong.getName();
		
//		Human[] arr = new Human[10];
//		ArrayList<Human> list = new ArrayList<>();
//		
//		arr[0] = new Human("choi",21,"123456-123456",'m');
//		arr[1] = new Human("kim",23,"123456-123456",'m');
//		arr[2] = new Human("jin",25,"123456-123456",'m');
//		
//		arr[1] = null;
//		arr[1] = arr[2];
//		arr[2] = null;
//		
//		System.out.println(arr[1].getAge());
//		
//		list.add(new Human("choi",21,"123456-123456",'m'));
//		list.add(new Human("kim",23,"123456-123456",'m'));
//		list.add(new Human("jin",25,"123456-123456",'m'));
//	
//		list.remove(1);
//		
//		list.get(0);
		
		
//		 String filePath = "myFile.txt";
//
//	      try {
//	         File file = new File(filePath);
//	         boolean isFileCreated = file.createNewFile();
//
//	         if (isFileCreated) {
//	            System.out.println("파일 생성 완료 : " + filePath);
//	         } else {
//	            System.out.println("파일 생성 실패");
//	         }
//	      } catch (IOException e) {
//	         e.printStackTrace();
//	      }

//	      try (OutputStream out = new FileOutputStream(filePath)){
//	         //-----------------------
//	         String data = "n";
//	         out.write(data.getBytes());
//	         //-----------------------
//	      } catch(IOException e) {
//	         e.printStackTrace();
//	      }
//	      
//	      try(InputStream in = new FileInputStream(filePath)) {
//	         //-----------------------
//	            int readByte = in.read();
//	            System.out.println((char) readByte);
//	            //-------------
//	      } catch (IOException e) {
//	         e.printStackTrace();
//	      }

//	      try (FileWriter fw = new FileWriter(filePath, true)){
//	         fw.append("hi");
//	         fw.append("jiwon");
//	      } catch (IOException e) {
//	         e.printStackTrace();
//	      }
//	      
//	      try {
//	         BufferedReader br = new BufferedReader(new FileReader(filePath));
//	          String line = br.readLine();
//	          while (line != null) {
//	              System.out.println(line);
//	              line = br.readLine();
//	          }
//	      } catch (IOException e) {
//	          e.printStackTrace();
//	      }


		
//		Scanner sc = new Scanner(System.in);
//		
//		//Human 클래스 내부에 나이에 +10을 더해서
//		//"제 10년 후 나이는 oo살입니다."의 스트링값을 반환하는
//		//메서드를 만들어주세요
//		Human kim = new Human("홍길동",20,"123456-456789",'f');
//		Human choi = new Human("김길동",30,"245678-159753",'f');
//		//크기가 3인 Human형 객체배열 arr을 만들고
//		//kim과  choi와 똑같은 데이터로 0번,1번째 인덱스에서 생성해라
//		Human[] arr = new Human[3];
//		arr[0] = new Human("홍길동",20,"123456-456789",'f');
//		arr[1] = new Human("김길동",30,"245678-159753",'f');
		
		
//		Human h = new Human();
//		Car c = new Car();
//		c.setType("SUV");
//		System.out.println(c.getType());
//		
//		Student s = new Student();
//		s.setName("홍길동");
//		System.out.println(s.getName());
//		
//		Tea t = new Tea();
//		t.setPrice(5000);
//		System.out.println(t.getPrice());
		//num이라는 변수에 int형 값을 하나 입력받아 출력해라
		
		//입력받은 값 num이 10보다 작은 정수이면 small을 출력
		//아니면 big을 출력
//		if(num < 10) {
//			System.out.println("small");
//		} else {
//			System.out.println("big");
//		}
		
		//입력한 값 num이 1,2,3이면 1,2,3중에 하나입니다.
		//아니면 예외입니다.
//		switch(num) {
//			case 1 : 
//				System.out.println("1,2,3중에 하나입니다.");
//				break;
//			case 2 :
//				System.out.println("1,2,3중에 하나입니다.");
//				break;
//			case 3 :
//				System.out.println("1,2,3중에 하나입니다.");
//				break;
//			default :
//				System.out.println("예외입니다.");
//		}
		
		//1부터 num까지 반복하면서 홀수(2로 나눴을 때 나머지가 1) 출력
//		for(int i = 1; i <= num; i++) {
//			if(num % 2 == 1) {
//				System.out.println("홀수");
//			}
//		}	
		//String str변수를 만들고 값을 입력받아라
		//만약 값이 "멈춰"일때 까지 반복해서 입력받아라
		//"멈춰"가 아니라면 다시 입력해주세요 출력
		//특정 조건이 성립될때까지 반복해라 -> while
			
		
//		while(true) {
//			String str = sc.nextLine();
//			if(str.equals("멈춰")) {
//				break;
//			}
//			System.out.println("다시 입력해주세요");
//		}
		
		//문자열을 하나 입력받고 길이가 10이상일 때까지 반복해서 입력받아라
		//문자열을 입력해주세요 : asd
		//문자열을 입력해주세요 :
				
//		while(true) {
//			String str = sc.nextLine();
//			if(str.length() >= 10) {
//				break;
//			}
//		}
		
		//int형 자료형 num을 하나 입력받아
		//길이가 num인 int형 1차원 arr을 생성하고
		//arr[0] ~ arr의 길이 끝까지 1부터 1씩 커지면서 순차적으로 저장시키고
		//출력해라
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//			System.out.println(arr[i]);
//		}
	}

}
