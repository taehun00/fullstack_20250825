package com.company.java005_ex;

public class ForEx006_1 {
	public static void main(String[] args) {
		String str = "12345";
		int result = 0;
		
		//int a = str.charAt(0) - '0';
		for (int i=0; i<str.length(); i++) {
			int a = str.charAt(i)-'0';
			result += a;
		}
		System.out.println(result);	
	}
}
