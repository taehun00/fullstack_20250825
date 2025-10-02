package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Delete implements BankController {
	public int exec(List<UserInfo> users, int find) {
		
		Scanner sc = new Scanner(System.in);
		UserInfo userinfo = users.remove(find);
		
		System.out.println("삭제하시겠습니까?(y)");
		//char a = sc.next().charAt(0);
    	if( sc.next().toLowerCase().equals("y") ) {
			/*
			 * userinfo.setId(null); userinfo.setPass(null); userinfo.setBalance((double)
			 * 0); System.out.println("삭제완료!");
			 */
    		System.out.println("삭제완료 > " + userinfo);
    	}
		
		
		return 0;
	}
}
