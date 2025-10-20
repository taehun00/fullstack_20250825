package com.company.java004_ex;
import java.util.Scanner;

public class Repeat011 {
	public static void main(String[] args) {
		int num1; int num2;
		char ch1;
		String result = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 정수를 하나 입력해주세요 > ");
		num1 = sc.nextInt();
		System.out.print("2. 정수를 하나 입력해주세요 > ");
		num2 = sc.nextInt();
		System.out.print("3. 연산자를 입력해주세요(+,-,*ㅡ/) > ");
		ch1 = sc.next().charAt(0);
		
		if (ch1=='+') {result += (num1 + num2);}
		else if (ch1=='-') {result += (num1 - num2);}
		else if (ch1=='*') {result += (num1 * num2);}
		else if (ch1=='/') {result += (double)num1 / num2;}
		
		System.out.printf("%d %c %d = s",num1,ch1,num2,String.format("%.2f", result));
		
		}
}
