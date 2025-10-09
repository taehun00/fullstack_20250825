package com.company.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Add1 implements MainController1 {

	@Override
	public int exec(List<UserInfo> users, int find) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		UserInfo userinfo = new UserInfo();

		
		System.out.println("[1]아이디 입력 > "); userinfo.setId(sc.next());
		System.out.println("[2]비밀번호 입력 > "); userinfo.setPw(sc.next());
		System.out.println("[3]잔액 입력 > "); userinfo.setMoney(sc.nextDouble());
		
		// SkillInfo는 null로 시작
        userinfo.setSkillInfo(null);

		
		users.add(userinfo);
		
		
		System.out.println("사용자 추가완료 : " + userinfo);
		return 0;
	}

}
