package com.company.java005_ex;

public class ForEx005 {
	public static void main(String[] args) {
		int a = 0;
		
		for (char i='a'; i<='z'; i++) {
			/*
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
				a++;
			}
			*/
			switch(i) {
			case 'a' : a++; break;
			case 'e' : a++; break;
			case 'i' : a++; break;
			case 'o' : a++; break;
			case 'u' : a++; break;
			}
		}
		System.out.println("소문자 a~z까지 모음의 갯수 : " + a + "개");
	}
}