package com.company.java005_ex;
import java.util.Scanner;

public class Repeat013_2 {
	public static void main(String[] args) {
		char ch = ' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a,b,c 중 하나를 입력하세요 > ");
		ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'a' : System.out.println("apple"); break;
		case 'b' : System.out.println("banana"); break;
		case 'c' : System.out.println("coconut"); break;
		default : System.out.println("a,b,c가 아니다.");
		}
		
	}
}
