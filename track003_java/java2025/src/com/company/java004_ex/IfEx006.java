package com.company.java004_ex;
import java.util.Scanner;

public class IfEx006 {
	public static void main(String[] args) {
		int num1, num2, num3;
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
		
	}
}
