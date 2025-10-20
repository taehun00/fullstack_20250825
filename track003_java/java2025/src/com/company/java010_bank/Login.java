package com.company.java010_bank;

import java.util.Scanner;

public class Login {
	private UserInfo userinfo;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(UserInfo userinfo) {
		super();
		this.userinfo = userinfo;
	}
	
	public int exec() {
		Scanner sc = new Scanner(System.in);
		int find=-1;  //find 인증할 번호
		System.out.print("[1]아이디 입력 > ");  String tempid = sc.next();
        System.out.print("[2]비밀번호입력 > ");  String temppass = sc.next();
        
        if(tempid.equals(this.userinfo.getId()) && temppass.equals(this.userinfo.getPass())) {
        	find = 1;
        }
        return find;
	}
}