package com.company.java010_bank;

import java.util.Scanner;

public class Deposit {
	private UserInfo userinfo;

	public Deposit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deposit(UserInfo userinfo) {
		super();
		this.userinfo = userinfo;
	}
	
	public void exec() {{
		Scanner sc = new Scanner(System.in);
	
    	System.out.println("\n입금할 금액>");
    	double temp1 = sc.nextDouble();
        this.userinfo.setBalance(this.userinfo.getBalance() + temp1);
        System.out.println("입금이 완료되었습니다. 현재 잔액: " + this.userinfo.getBalance());
        }
	}
}
