package com.company.java008_ex;

public class MethodEx004 {
	public static int return_num() {
		return 1;
	}
	public static String return_float() {
		
		return String.format("%.4f",10/3.0);
	}
	public static String mycolor() {
		return "PURPLE";
	}
	public static String jangsu() {
		return "★★★★★";
	}
	public static int myadd(int a, int b) {
		return a+b;
	}
	public static String myban(char a) {
		if(a=='A') return "나는 노랑조";
		else if (a=='B') return "나는 주황조";
		else return null;
	}
	public static String stdid(int a) {
		return "G" + a;
	}
	public static String stdAvg(int a) {
		if(a>=90) return "A";
		else if(a>=80) return "B";
		else if(a>=70) return "C";
		else return null;
	}
	public static void main(String[] args) {
		System.out.println("1. 내가 좋아하는 숫자 :" + return_num());
		System.out.println("2. 10/3.0을 실수로 표현 :" + return_float());
		System.out.println("3. BEST COLOR :" + mycolor());
		System.out.println("4. 장수돌침대 별이 :" + jangsu());
		System.out.println("5. 10+20=" + myadd(10,20));
		System.out.println("6. 반(노랑조/주황조)=" + myban('B'));
		System.out.println("7. 당신의 학번은?" + stdid(1111));
		System.out.println("8. 당신의 평균은?" + stdAvg(88));
	}
}
