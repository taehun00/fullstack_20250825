package com.company.java002;

public class Var {
	public static void main(String[] args) {
		//1. 변수
		int a = 0;
		System.out.println("1:"+ a);
		
		a = 100000;
		System.out.println("2:"+ a);
		
		a = a - 90000;
		System.out.println("3:"+ a);
		//2. 변수의 범위
		{int b = 20; System.out.println(b);}
		// b = 1000;  b cannot be resolved to a variable
		
		//3. 변수명  $ , _ , 소문자
		//오픈박스(변수)
		int $1 = 1; int _2 = 2; int a3bc=3;
		//밀봉박스(상수)
		int HOME = 4;
		// int static; //Syntax error on token "static", invalid
	}
	
}
