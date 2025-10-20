package com.company.bank;

import java.util.List;
import java.util.Scanner;

public class ChDelete implements MainController1 {

	@Override
	public int exec(List<UserInfo> users, int find) {
		// TODO Auto-generated method stub
		 if (find < 0 || find >= users.size()) {
	            System.out.println("❌ 삭제할 유저가 존재하지 않습니다.");
	            return find;
	        }

	        UserInfo user = users.get(find);

	        System.out.println("캐릭터를 삭제하시겠습니까? (Y/N)");
	        Scanner sc = new Scanner(System.in);
	        String confirm = sc.next();

	        if (confirm.equalsIgnoreCase("Y")) {
	            users.remove(find);
	            System.out.println("캐릭터가 삭제되었습니다.");
	            return -1;
	        } else {
	            System.out.println("삭제를 취소했습니다.");
	            return find;
	        }

	}

}
