package com.company.java010_bank;

import java.util.Scanner;

public class Withdraw {
	private UserInfo userinfo;

	public Withdraw() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Withdraw(UserInfo userinfo) {
		super();
		this.userinfo = userinfo;
	}
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
        System.out.println("\n출금할 금액>");
        double temp2 = sc.nextDouble();
        this.userinfo.setBalance(this.userinfo.getBalance() - temp2);
        System.out.println("출금이 완료되었습니다. 현재 잔액: " + this.userinfo.getBalance());
	}
        
}
