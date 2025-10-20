package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Deposit implements BankController {
	public int exec(List<UserInfo> users, int find) {
		
		Scanner sc = new Scanner(System.in);
		UserInfo userinfo = users.get(find);
		
		//
    	System.out.println("\n입금할 금액>");
    	double temp1 = sc.nextDouble();
        userinfo.setBalance(userinfo.getBalance() + temp1);
        System.out.println("입금이 완료되었습니다. 현재 잔액: " + userinfo.getBalance());
        
		
		return 0;
	}
}
