package testProject;
import java.util.*;
public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year;
		System.out.print("년 : ");
		year = sc.nextInt();
		int month;
		System.out.print("월 : ");
		month = sc.nextInt();
		int day;
		System.out.print("일 : ");
		day = sc.nextInt();
		int hour;
		System.out.print("시 : ");
		hour = sc.nextInt();
		int minute;
		System.out.print("분 : ");
		minute = sc.nextInt();
		String second;
		System.out.print("초 : ");
		second = sc.nextLine();
		System.out.println("지금은 "+ year+"년 " +month+"월 "+day+"일 "+hour+"시 "+minute+"분 "+second+"초입니다.");
	}

}
