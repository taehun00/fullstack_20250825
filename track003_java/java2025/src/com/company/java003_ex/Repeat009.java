package com.company.java003_ex;
import java.util.Scanner;

public class Repeat009 {
	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력1> ");
		num1 = sc.nextInt();
		System.out.print("숫자입력2> ");
		num2 = sc.nextInt();
		
		System.out.printf("%d / %d = %.2f", num1, num2, (double)num1/num2);
	}
}