package com.company.java005_ex;
import java.util.Scanner;

public class Bank_Miniporject {
	public static void main(String[] args) {
		String id = "";
		String pw = "";
		int age;
		int money;
		int a;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("======BANK======");
			System.out.println("1.추가");
			System.out.println("2.조회");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.삭제");
			System.out.println("9.종료");
			System.out.println("입력>>> ");
			a = sc.nextInt();
			
			switch(a) {
			case 1 :
				System.out.println("아이디 입력 : ");
				id = sc.nextLine();
				System.out.println("비밀번호 입력 : ");
				pw = sc.nextLine();
				System.out.println("나이 입력 : ");
				age = sc.nextInt();
				System.out.println("잔액 입력 : ");
				money = sc.nextInt();
			case 2 :
				
			}
		}
	}
}
