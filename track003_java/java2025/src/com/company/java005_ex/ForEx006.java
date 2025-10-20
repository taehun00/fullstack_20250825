package com.company.java005_ex;

import java.util.Scanner;

public class ForEx006 {
	public static void main(String[] args) {
		int num1=-1, num2=-1;
		char a = 0;
		double result = 0;
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			if(num1<0 || num1>100){
				System.out.print("정수를 하나 입력해주세요 > ");
				num1 = sc.nextInt();
				continue;
			}
			//if (num1 <0 || num1>100) continue;
			
			if(num2<0 || num2>100){
				System.out.print("정수를 하나 입력해주세요 > ");
				num2 = sc.nextInt();
				continue;
			}
			//if (num2 <0 || num2>100) continue;
			if(!(a == '+' || a == '-' || a == '*' || a== '/')) {
				System.out.print("연산자를 입력해주세요(+,-,*,/) > ");
				a = sc.next().charAt(0);
				continue;
			}
			//if (a == '+' || a == '-' || a == '*' || a== '/') break;
			break;
		}
		
		switch(a) {
		case '+' : result = num1 + num2; break;
		case '-' : result = num1 - num2; break;
		case '*' : result = num1 * num2; break;
		case '/' : result = (double)num1 / num2; break;
		}
		
		
		System.out.println("" + num1 + a + num2 + "=" + 
				(a != '/' ? (int)result : String.format("%.2f", result)));
	}
}
