package com.kh.ArrayList;

import java.util.*;

public class main {
	
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		
//		list.add("Toy");
//		list.add("Box");
//		list.add("Robot");
//		
//		for(int i = 0; i < list.size(); i++)
//			System.out.print(list.get(i) + '\t');
//		System.out.println();
//		
//		list.remove(0);
//		
//		for(int i = 0; i < list.size(); i++)
//			System.out.print(list.get(i)+ '\t');
//		System.out.println();
		
//		Set<String> set = new HashSet();
//		
//		set.add("Toy");		set.add("Box");
//		set.add("Robot");	set.add("Box");
//		System.out.println("인스턴스 수 : " + set.size());
//		
//		for(Iterator<String> itr = set.iterator(); itr.hasNext();)
//			System.out.print(itr.next() + "\t");
//		System.out.println();
//		
//		for(String s : set)
//			System.out.print(s + "\t");
//		System.out.println();
	
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		System.out.println("23번: " + map.get(23));
		System.out.println("37번: " + map.get(37));
		System.out.println("45번: " + map.get(45));
		System.out.println();
		
		map.remove(37);
		
		System.out.println("37번 : "+map.get(37));
		
	}
}
