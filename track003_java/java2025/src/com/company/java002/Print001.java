package com.company.java002;

public class Print001 {
	public static void main(String[] args) {
		//1. println
		System.out.println("1. 줄바꿈");
		
		//2. print
		System.out.print("2. 줄바꿈 안됨.");
		System.out.print("줄바꿈 특수 \n이용\n");
		
		//3. printf       %s는 문자열, %d는 정수, %f는 실수
		System.out.printf("3. 정수 %d, 실수 %f, 문자열 %s\n", 1, 1.2, "abc");
		
		//4. +의 의미
		System.out.println(10+3);
		System.out.println(10+3 + "+" + 1+2); // 13+12
		System.out.println(10+3 + "+" + (1+2) ); // 13+3
		
		System.out.println(1+"+"+2+"="+3);
		System.out.printf("%d + %d = %d", 1, 2, 3);
	}
}
