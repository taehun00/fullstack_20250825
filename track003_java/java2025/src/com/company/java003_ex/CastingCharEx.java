package com.company.java003_ex;
import java.util.Scanner;

public class CastingCharEx {
	public static void main(String[] args) {
		//변수
		char upper = ' ';
		char lower = ' ';
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.print("알파벳 대문자 입력 : ");
		upper = sc.next().charAt(0);
		
		//처리
		lower = (char)(upper + 32);
		
		//출력
		System.out.println("입력받은 대문자 " + upper + "에 소문자는 " + lower + "입니다.");
	}

}
