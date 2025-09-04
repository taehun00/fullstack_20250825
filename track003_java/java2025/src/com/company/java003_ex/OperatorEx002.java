package com.company.java003_ex;

public class OperatorEx002 {
	public static void main(String[] args) {
		int x = 5;
		boolean result = (3 < x && x < 10) ? true : false;
		System.out.println(result);
		
		char ch = '5';
		boolean result2 = ( ch == 'a' || ch == 'A') ? true : false;
		System.out.println(result2);
		
		boolean result3 = (0<= ch && ch <=9) ? true : false;
		System.out.println(result3);
		System.out.println((int)ch);
		
		boolean result4 = (65<= (int)ch && (int)ch <=90 || 97 <= (int)ch && (int)ch <= 122) ? true : false;
		System.out.println(result4);
	}
}
