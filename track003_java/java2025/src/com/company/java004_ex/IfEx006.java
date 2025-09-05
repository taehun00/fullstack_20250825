package com.company.java004_ex;
import java.util.Scanner;

public class IfEx006 {
	public static void main(String[] args) {
		/* int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력(1)");
		num1 = sc.nextInt();
		System.out.println("숫자 입력(2)");
		num2 = sc.nextInt();
		System.out.println("숫자 입력(3)");
		num3 = sc.nextInt();
		
		if (num1 >= num2 && num1 >= num3) 
		{System.out.printf("%d, %d, %d중의 최댓값 : %d",num1 ,num2, num3, num1);}
		else if (num2 >= num1 && num2 >= num3)
		{System.out.printf("%d, %d, %d중의 최댓값 : %d",num1 ,num2, num3, num2);}
		else
		{System.out.printf("%d, %d, %d중의 최댓값 : %d",num1 ,num2, num3, num3);}
		*/
		
		int num; String result = "여자";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 > ");
		num = sc.nextInt();
		/*
		if (num % 2 == 1) {result = "남자";}
		*/
		result = (num % 2 == 1 ? "남자" : "여자");
		
		System.out.println(result);
	}
}
