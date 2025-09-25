package com.company.java010_bank;

import java.util.Scanner;

//1. 부품객체
//2. 상태와 행위
public class Add {
	// 상태 : 멤버변수
	private UserInfo userinfo;

	public Add(UserInfo userinfo) {
		super();
		this.userinfo = userinfo;
	}

	public Add() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		//System.out.println("[1]아이디 입력 > "); String id = sc.next();
		//System.out.println("[2]비밀번호 입력 > "); String pw = sc.next();
		//System.out.println("[3]잔액 입력 > "); double balance = sc.nextDouble();
		//this.userinfo = new UserInfo(id, pw, balance);
		//System.out.println("사용자 추가완료 : " + this.userinfo);
		System.out.println("[1]아이디 입력 > "); this.userinfo.setId(sc.next());
		System.out.println("[2]비밀번호 입력 > "); this.userinfo.setPass(sc.next());
		System.out.println("[3]잔액 입력 > "); this.userinfo.setBalance(sc.nextDouble());
		
		System.out.println("사용자 추가완료 : " + this.userinfo);
	}
}
