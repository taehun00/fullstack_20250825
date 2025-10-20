package com.company.java008_ex;

public class Repeat018 {
	public static String dog() {
		return "멍멍";
	}
	
	public static void disp(int a, char b) {
		for(int i=0; i<a; i++) {
			System.out.print(b);
		}
	}
	
	public static String stdAvg(int a) {
		if(a>=90) {
			return "A";
		}
		else if(a>=80) {
			return "B";
		}
		else if(a>=70) {
			return "C";
		}
		else return "D";

	}
	
	
	public static void main(String[] args) {
		System.out.println("강아지가 등장합니다!");
		System.out.println(dog());
		
		System.out.println("\n강아지가 시험을 봤습니다. 점수를 공개합니다!");
		disp(7, '*');
		
		System.out.println("\n평가 결과는?");
		System.out.println("당신의 평균은? " + stdAvg(88));
	}
}
