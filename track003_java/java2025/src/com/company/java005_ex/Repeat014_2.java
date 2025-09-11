package com.company.java005_ex;

import java.util.Scanner;

public class Repeat014_2 {
	public static void main(String[] args) {
		char ch = ' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 > ");
		ch = sc.next().charAt(0);
		
		switch(ch) {
		case('x') : System.out.println("x-ray"); break;
		case('y') : System.out.println("yogurt"); break;
		case('z') : System.out.println("zebra"); break;
		default : System.out.println("x, y, z가 아닙니다."); break;
		}
	}
}
