package com.company.bank005_interface;

import java.util.List;

public class Show implements BankController {
	public int exec(List<UserInfo> users, int find) {
		
		UserInfo userinfo = users.get(find);
		
		System.out.println("\nID> " + userinfo.getId()
						+ "\nPASS> " + userinfo.getPass()
						+ "\nBALANCE> " + userinfo.getBalance());
		
		return 0;
	}
}

