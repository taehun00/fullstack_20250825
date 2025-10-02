package com.company.bank005_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank_Main {
	//멤버변수
	private List<UserInfo> users; //add, get, size, remove, contains
	private BankController[] controller;
	
	public Bank_Main() {
		users = new ArrayList<>();
		controller = new BankController[]{
				new Login() , new Add(), new Show(), new Deposit(), new WithDraw(), new Delete()
		};
	}
	
	//멤버함수
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		int num=-1;
		while(num!=9) {
			System.out.print("\n\n🌟💰 WELCOME TO BANK SYSTEM 💰🌟\n" + 
		             "\n[1] ➕ 계좌 추가" + "\n[2] 🔍 계좌 조회" + "\n[3] 💵 입금하기" + "\n[4] 💸 출금하기" + "\n[5] 🗑️ 계좌 삭제  "
		             +"\n\n👉 번호를 선택하세요:");
			num = sc.nextInt();
			
			if (num == 9) {
		    	System.out.println("종료");
		    	break;
		    }
			
			if (num < 1 || num > 5) {
	            System.out.println("잘못된 입력");
	            continue;
	        }
			
			int find = 0;
			if (num >= 2 && num <= 5) {
				find = controller[0].exec(users, 1);
				if(find < 0) {
					System.out.println("❌ 아이디가 존재하지 않습니다.");
		            continue;
				}
				
		    }
			
			controller[num].exec(users, find);

		    if (num == 9) {
		    	System.out.println("종료");
		    	break;
		    }
		}
		
		//start
		//1. 유저추가
		//2,3,4,5,
		//1) Login 2) 2,3,4,5 각각에서 처리해야할 
	
	}
	
	public static void main(String[] args) {
		new Bank_Main().menu();
	}
}
