package com.company.java004_ex;
import java.util.Scanner;

public class IfEx007 {
	public static void main(String[] args) {
		/* int year; String result= "평년";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 년도를 입력해주세요> ");
		year = sc.nextInt();
		
		if(year%4==0 && year%100 != 0) result = "윤년";
		
		System.out.printf("%d는 %s입니다.", year, result);
		*/
		
		int d1; int d2; double result; String show;
		char operator;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력해주세요 > ");
		d1 = sc.nextInt();
		System.out.print("정수를 하나 입력해주세요 > ");
		d2 = sc.nextInt();
		System.out.print("연산자를 입력해주세요 > ");
		operator = sc.next().charAt(0);
		
		/*
		if (operator == '+') {result = d1 + d2;}
		else if (operator == '-') {result = d1 - d2;}
		else if (operator == '*') {result = d1 * d2;}
		else if (operator == '/') {result = d1 / d2;}
		*/
		
		result = (operator == '+') ? d1 + d2:
				 (operator == '-') ? d1 - d2:
				 (operator == '*') ? d1 * d2: (double)d1 / d2;
		
		show = (operator == '/' ? String.format("%.2f", result) : String.valueOf((int)result));
		
		System.out.println(""+d1+operator+d2+"="+show);
		
	}
}
