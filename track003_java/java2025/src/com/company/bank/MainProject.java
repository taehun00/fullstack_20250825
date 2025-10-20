package com.company.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.company.bank005_interface.Add;
import com.company.bank005_interface.Login;
import com.company.bank005_interface.Show;


public class MainProject {
	private List<UserInfo> users;
	private MainController1[] con;
	private List<SkillInfo> sk;
	
	public MainProject() {
		users = new ArrayList<>();
		con = new MainController1[] {
				new Login1(), new Add1(), new Show1(), new SkillBuy(), new SkillSell(), new Boss(), new ChDelete()
		};
	}
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		int num = -1;
		while(num!=9) {
			System.out.print("\n\n🌟💰 WELCOME💰🌟\n" + 
		             "\n[1] ➕ 캐릭터 추가" + "\n[2] 🔍 캐릭터 조회" + "\n[3] 💵 스킬 구매 " + "\n[4] 💸 스킬 판매 "
					 + "\n[5] 보스 잡기 " +"\n[6] 🗑️ 캐릭터 삭제  "
		             +"\n\n👉 번호를 선택하세요:");
			num = sc.nextInt();
			
			if (num == 9) {
		    	System.out.println("종료");
		    	break;
		    }
			
			if (num < 1 || num > 6) {
	            System.out.println("잘못된 입력");
	            continue;
	        }
			
			int find = 0;
			
			if (num >= 2 && num <= 6) {
				find = con[0].exec(users, 1);
				if(find < 0) {
					System.out.println("❌ 아이디가 존재하지 않습니다.");
		            continue;
				}
				
		    }
			
			con[num].exec(users, find);
			
		}
	}
	
	
	public static void main(String[] args) {
		new MainProject().menu();
	}
}
