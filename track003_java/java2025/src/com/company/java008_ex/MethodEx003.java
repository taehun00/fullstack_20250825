package com.company.java008_ex;

public class MethodEx003 {
	public static void printProfile(String a, int b, String c) {
		System.out.println("=== 사용자 프로필 ===");
		System.out.println("이름: " + a);
		System.out.println("나이: " + b);
		System.out.println("지역: " + c);
		System.out.println("==================");
	}
	
	public static void checkAge(int a) {
		if (a<20) {
			System.out.println("미성년자입니다.");
		}
		else {
			System.out.println("성인입니다.");
		}
	}
	
	public static void repeatMessage(String a, int b) {
		for(int i=0;i<b;i++) {
			System.out.println(a);
		}
	}
	
	public static void drawBox(int a, char c) {
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printProfile("홍길동", 25, "서울");
		checkAge(17);
		repeatMessage("안녕하세요!", 3);
		drawBox(5, '#');
	}
}
