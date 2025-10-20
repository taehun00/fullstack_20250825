package com.company.java008_ex;

import java.util.Scanner;
public class Repeat020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.print("+,-,*,/ 중 하나를 골라 쓰시오 > ");
			char ch = sc.next().charAt(0);
			
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {System.out.println("완료"); break;}
			
		}
		
		while(true) {
			System.out.print("+,-,*,/ 중 하나를 골라 쓰시오 > ");
			char ch = sc.next().charAt(0);
			
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {System.out.println("완료"); break;}
		}
		
		do{
			System.out.print("+,-,*,/ 중 하나를 골라 쓰시오 > ");
			char ch = sc.next().charAt(0);
			
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {System.out.println("완료"); break;}
		}while(true);
	}
}
