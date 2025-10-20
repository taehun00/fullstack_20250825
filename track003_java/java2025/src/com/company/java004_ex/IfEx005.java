package com.company.java004_ex;
import java.util.Scanner;

public class IfEx005 {
	public static void main(String[] args) {
		/* int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한개를 입력하세요> ");
		num = sc.nextInt();
		
		if (num>=0) {System.out.println(num);}
		else {System.out.println(num * -1);} */
		
		char text; String result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 한개를 입력하시오 > ");
		text = sc.next().charAt(0);
		/*
		if (text >= 'A' && text <= 'Z') {result = String.valueOf((char)(text + 32));}
		else {result = String.valueOf((char)(text - 32));}
		*/
		result = String.valueOf((char)((text >= 'A' && text <= 'Z') ? text + 32:text - 32));
		
		System.out.printf("변경된 문자는 %s 입니다.", result);
	}
}
