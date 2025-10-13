package com.company.bank;

import java.util.List;


public class Show1 implements MainController1 {

	@Override
	public int exec(List<UserInfo> users, int find) {
		// TODO Auto-generated method stub
		UserInfo userinfo = users.get(find);
		
		System.out.println("\nID> " + userinfo.getId()
						+ "\nPASS> " + userinfo.getPw()
						+ "\nMONEY> " + userinfo.getMoney());
		
		// SkillInfo가 null일 수 있으므로 체크
        SkillInfo skillInfo = userinfo.getSkillInfo();
        if (skillInfo == null || skillInfo.getSkillBag().isEmpty()) {
            System.out.println("SKILLINFO> 보유한 스킬 없음");
        } else {
            System.out.print("SKILLINFO> ");
            for (String skillName : skillInfo.getSkillBag()) {
                System.out.print(skillName + " ");
            }
            System.out.println();
        }

		
		return 0;
	}

}
