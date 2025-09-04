package com.company.java004_ex;
import java.util.Scanner;

public class IfEx002 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요> ");
		num = sc.nextInt();
		
		if(num>0)
			{System.out.println("양수");}
		else if(num==0)
			{System.out.println("zero");}
		else
			{System.out.println("음수");}
	}
}
