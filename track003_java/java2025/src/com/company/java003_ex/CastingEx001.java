package com.company.java003_ex;
import java.util.Scanner;

public class CastingEx001 {
	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력1 >");
		num1 = sc.nextInt();
		System.out.print("숫자입력2 >");
		num2 = sc.nextInt();
		
		System.out.print(num1 + " / " + num2 + " = " + String.format("%.2f", (float)num1/num2));
	}
}
