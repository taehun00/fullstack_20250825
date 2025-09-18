package com.company.java008_ex;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx010 {
	
	public static void menu() {
		System.out.println("1. 진료 항목 조회");
		System.out.println("2. 진료 항목 변경");
		System.out.println("3. 종료");
		System.out.println("메뉴 번호를 선택해주세요: ");
		
	}
	
	public static void jhj(String [][]pets) {
		Scanner sc = new Scanner(System.in);
		System.out.print("동물 이름을 입력해주세요 > ");
		String name = sc.next();
		
		int find = -1;
		for(int i=0;i<pets.length;i++) {
			if(pets[i][0].equals(name)) {
				find = i;
				System.out.println(pets[i][0] + "는 예방접종 예약이 되어 있어요.");
			}
		}
		
		if (find == -1) {
			System.out.println(name + "는 예방접종 예약이 안되어 있어요.");
		}
	}
	
	public static void jhb(String [][]pets) {
		Scanner sc = new Scanner(System.in);
		System.out.print("동물 이름을 입력해주세요 > ");
		String name = sc.next();
		System.out.print("보호자 전화번호를 입력해주세요 > ");
		String phone = sc.next();
		
		int find = -1;
		for(int i=0;i<pets.length;i++) {
			if(pets[i][0].equals(name) && pets[i][1].equals(phone)) {
				find = i;
				
				System.out.print("변경하실 진료 항목을 입력해주세요 > ");
				String change = sc.next();
				pets[i][2] = change;
				System.out.println("예약 정보 확인: " + Arrays.toString(pets[i]));
			}
		}
		
		if (find == -1) {
			System.out.println("등록 정보를 확인해주세요!");
		}
	}

	public static void j() {
		
		System.out.println("시스템을 종료합니다. 안녕히 가세요!");
		System.exit(0);
	}
	
	
	public static void main(String[] args) {
		String[][] pets = {
			    {"콩이", "010-1234-5678", "예방접종"},
			    {"초코", "010-2345-6789", "건강검진"},
			    {"보리", "010-3456-7890", "치아관리"}
			};
		while(true) {
			Scanner sc = new Scanner(System.in);
			menu();
			int sel = sc.nextInt();
			switch(sel) {
			case 1 : jhj(pets); break;
			case 2 : jhb(pets); break;
			case 3 : j(); break;
			}
		}
		//jhj(pets);
		//jhb(pets);
		//j();
	}
}
