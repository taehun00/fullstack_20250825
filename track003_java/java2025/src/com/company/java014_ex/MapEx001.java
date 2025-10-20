package com.company.java014_ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapEx001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		map.put("피구왕", "통키");
		map.put("제빵왕", "김탁구");
		map.put("요리왕", "비룡");
		
		System.out.println("KING의 정보를 제공중입니다.");
		System.out.print("이름을 입력하세요> ");
		String name = sc.next();
		
		for(Entry<String, String> a : map.entrySet()) {
			if(a.getKey().equals(name)) {
				System.out.println("ㅁ" + a.getKey() + " : " + a.getValue());
				break;
			}
		}
		
		if (map.containsKey(name)) {
			System.out.println("ㅁ" + name + " : " + map.get(name));
		}
		else {
			System.out.println("이름 없음");
		}
	}
}
