package com.company.java006_ex;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("1, 2, 3 중 하나를 입력하세요 > ");
		num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("mango"); break;
		case 2 : System.out.println("noodle"); break;
		case 3 : System.out.println("orange"); break;
		default : System.out.println("1, 2, 3이 아닙니다."); break;
		}
	}
}
