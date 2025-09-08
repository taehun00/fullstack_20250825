package com.company.java004_ex;
import java.util.Scanner;

public class SwitchEx003 {
	public static void main(String[] args) {
		int num1, num2;
		char ch1;
		String result = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 정수를 하나 입력해주세요 > ");
		num1 = sc.nextInt();
		System.out.print("2. 정수를 하나 입력해주세요 > ");
		num2 = sc.nextInt();
		System.out.print("3. 연산자를 입력해주세요(+,-,*,/) > ");
		ch1 = sc.next().charAt(0);
		
		
		
		// result = num1 + " " + ch1 + " " + num2 + " " + "=" + " ";
		result = String.format("%d %c %d = ", num1, ch1, num2);
		
		switch(ch1) {
		case '+' : result += num1+num2; break;
		case '-' : result += num1-num2; break;
		case '*' : result += num1*num2; break;
		case '/' : result += String.format("%.2f", (double)num1/num2); break;
		}
		
		System.out.println(result);
	}
}
