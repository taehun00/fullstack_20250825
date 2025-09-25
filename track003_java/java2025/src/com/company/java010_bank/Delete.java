package com.company.java010_bank;

import java.util.Scanner;

public class Delete {
	private UserInfo userinfo;

	public Delete() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Delete(UserInfo userinfo) {
		super();
		this.userinfo = userinfo;
	}
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
    	
    	if( sc.next().toLowerCase().equals("y") ) {
    		this.userinfo.setId(null);
    		this.userinfo.setPass(null);
    		this.userinfo.setBalance((double) 0);
    		System.out.println("삭제완료!");
    	}
        
	}
}
