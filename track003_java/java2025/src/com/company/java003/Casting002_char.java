package com.company.java003;

public class Casting002_char {
	public static void main(String[] args) {
		// #1. 문자 초기화
		// 문자는 저장시 숫자 / 출력시 문자
		char ch1 = ' ';  // 공백 한개라도 있어야 오류가 안남.
		char ch2 = '\u0000';
		
		System.out.println("step1 : " + ch1 + "\t" + ch2);
		System.out.println("step2 : " + (int)ch1 + "\t" + (int)ch2);
		
		// #2. 문자의 연산
		char c = 'A';
		System.out.println("step3 : " + c + "\t" + (int)c);
		System.out.println("step4 : " + (c+1));
		
		System.out.println("step5 : " + (char)(c+1));
		
		char q1 = 'A';
		System.out.println("대문자 'A'를 소문자 'a'로 변환시키기 : " + (char)(q1+32));
		
		// #3. 문자열
		// 자료형의 분류는 기본형(값)과 참조형(주소)
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
	}
}
