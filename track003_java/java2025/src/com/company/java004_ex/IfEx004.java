package com.company.java004_ex;
import java.util.Scanner;

public class IfEx004 {
	public static void main(String[] args) {
		char ch = ' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 한개를 입력하세요> ");
		ch = sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {System.out.println("대문자입니다.");}
		else if (ch>='a' && ch<='z') {System.out.println("소문자입니다.");}
		else {System.out.println("대문자, 소문자가 아닙니다.");
		}
	}
}
