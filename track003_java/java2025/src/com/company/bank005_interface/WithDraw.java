package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class WithDraw implements BankController {
	public int exec(List<UserInfo> users, int find) {
		
		UserInfo userinfo = users.get(find);
		
		Scanner sc = new Scanner(System.in);
        System.out.println("\n출금할 금액>");
        double temp2 = sc.nextDouble();
        userinfo.setBalance(userinfo.getBalance() - temp2);
        System.out.println("출금이 완료되었습니다. 현재 잔액: " + userinfo.getBalance());

		return 0;
	}
}
