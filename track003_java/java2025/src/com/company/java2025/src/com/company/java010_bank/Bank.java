package com.company.java2025.src.com.company.java010_bank;

import java.util.Scanner;

//1. 클래스는 부품객체
//2. 상태와 행위
public class Bank {
	// 상태 : 멤버변수
	UserInfo userinfo; //정보보관용도 - model - db
	Add add;
	Show show;
	Deposit deposit;
	Withdraw withdraw;
	Delete delete;
	Login login;
	
	public Bank() {
		this.userinfo = new UserInfo();
		this.add = new Add( this.userinfo );
		this.show = new Show( this.userinfo );
		this.deposit = new Deposit( this.userinfo );
		this.withdraw = new Withdraw( this.userinfo );
		this.delete = new Delete( this.userinfo );
		this.login = new Login( this.userinfo );
	}
	
	public void run() {
		// 1. 무한반복
		Scanner sc = new Scanner(System.in);
		int num = -1;
		while(num!=9) {
			//System.out.println("Main :" + this.userinfo + "\t" + System.identityHashCode(this.userinfo));
			System.out.print("\n\n🌟💰 WELCOME TO BANK SYSTEM 💰🌟\n" + 
		             "\n[1] ➕ 계좌 추가" + "\n[2] 🔍 계좌 조회" + "\n[3] 💵 입금하기" + "\n[4] 💸 출금하기" + "\n[5] 🗑️ 계좌 삭제  "
		             + "\n[9] 🗑 종료  "+"\n\n👉 번호를 선택하세요:");
			num = sc.nextInt();
			
			switch(num) {
		    case 1:
		        this.add.exec(); // 로그인 없이 계좌 추가는 허용
		        break;

		    case 2: case 3: case 4: case 5:
		        if (this.login.exec() == 1) {
		            switch(num) {
		                case 2: this.show.exec(); break;
		                case 3: this.deposit.exec(); break;
		                case 4: this.withdraw.exec(); break;
		                case 5: this.delete.exec(); break;
		                
		            }
		        } else {
		            System.out.println("❌ 로그인 실패. 기능을 사용할 수 없습니다.");
		        }
		        break;
		    
		    case 9:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
                break;

            default:
                System.out.println("잘못된 번호입니다.");
                break;
                
			}
		}
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.run();
	}
	
	
}
