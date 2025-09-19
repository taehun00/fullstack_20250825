package com.company.java008_ex;

public class Repeat022 {
	public static void dog() {
		System.out.println("멍멍");
	}
	
	public static void disp(int a, char ch) {
		String result = "";
		for(int i=0; i<a; i++) {
			result+=ch;
		}
		System.out.println(result);
	}
	public static String stdId(int a) {
		return "G"+a ;
		
	}
	
	public static void main(String[] args) {
		dog();
		disp(7,'*');
		System.out.println("당신의 학번은? " + stdId(1111));
	}
}
