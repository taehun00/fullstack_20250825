package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Login implements BankController {
	public int exec(List<UserInfo> users, int find) {
		Scanner sc = new Scanner(System.in);
		
		
		int find1=-1;
		System.out.print("[1]아이디 입력 > ");
		String tempid = sc.next();
	    System.out.print("[2]비밀번호입력 > ");
	    String temppass = sc.next();
	    
	    for (int i=0; i<users.size(); i++) {
	    	UserInfo userinfo = users.get(i);
		    if(tempid.equals(userinfo.getId()) && temppass.equals(userinfo.getPass())) {
		    	
		    	return i;
		    }
	    }
	    
		return -1;
	}
}
