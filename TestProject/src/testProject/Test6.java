package testProject;
import java.util.*;
public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float kor;
		System.out.print("국어 : ");
		kor = sc.nextFloat();
		float eng;
		System.out.print("영어 : ");
		eng = sc.nextFloat();
		float math;
		System.out.print("수학 : ");
		math = sc.nextFloat();
		float total = (int)kor+eng+math;
		System.out.println("총점 : "+(int)total);
		float avg = (int)total/3;
		System.out.println("평균 : "+(int)avg);
	}

}
