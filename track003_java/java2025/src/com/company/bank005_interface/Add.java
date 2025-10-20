package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Add implements BankController {
	public int exec(List<UserInfo> users, int find) {
		Scanner sc = new Scanner(System.in);
		UserInfo userinfo = new UserInfo();
		
		System.out.println("계좌 추가 기능입니다.");
		
		System.out.println("[1]아이디 입력 > "); userinfo.setId(sc.next());
		System.out.println("[2]비밀번호 입력 > "); userinfo.setPass(sc.next());
		System.out.println("[3]잔액 입력 > "); userinfo.setBalance(sc.nextDouble());
		
		users.add(userinfo);
		
		
		System.out.println("사용자 추가완료 : " + userinfo);
		return 0;
	}
}
