package com.company.java005_ex;

import java.util.Scanner;

public class Repeat014_1 {
	public static void main(String[] args) {
		char ch = ' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 > ");
		ch = sc.next().charAt(0);
		
		if (ch == 'x') {
			System.out.println("x-ray");
		}else if ( ch == 'y') {
			System.out.println("yogurt");
		}else if ( ch == 'z') {
			System.out.println("zebra");
		}else {
			System.out.println("x, y, z가 아닙니다.");
		}
	}
}
