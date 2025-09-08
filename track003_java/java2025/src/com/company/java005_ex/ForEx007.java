package com.company.java005_ex;
import java.util.Scanner;

public class ForEx007 {
	public static void main(String[] args) {
		String before = "";
		String after = "";
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자를 입력하세요 > ");
			before = sc.nextLine();
			
			// 문자열 뒤집기
	        after = new StringBuilder(before).reverse().toString();
	        
	        if (before.equals(after)) {
	        	System.out.println("회문수 O");
	        }
	        else System.out.println("회문수 X");
		}
	}
}
