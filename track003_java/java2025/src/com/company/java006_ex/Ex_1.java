package com.company.java006_ex;
import java.util.Scanner;

public class Ex_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch=' ';
		
		System.out.print("m, n, o 중 하나를 입력하세요 > ");
		ch = sc.next().charAt(0);
		
		if (ch=='m') {
			System.out.println("mango");
		}
		else if (ch=='n') {
			System.out.println("noodle");
		}
		else if (ch=='o') {
			System.out.println("orange");
		}
		else {System.out.println("m, n, o가 아닙니다.");}
	}
}
