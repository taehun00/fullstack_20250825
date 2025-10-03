package com.company.java010_bank;

//1. 부품객체
//2. 상태와 행위
public class Show {
	// 상태 : 멤버변수
	private UserInfo userinfo;

	public Show() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Show(UserInfo userinfo) {
		super();
		this.userinfo = userinfo;
	}
	
	public void exec() {
		
		System.out.println("\nID> " + this.userinfo.getId()
							+ "\nPASS> " + this.userinfo.getPass()
							+ "\nBALANCE> " + this.userinfo.getBalance());
	}
	

}

// 유저정보 보여주기