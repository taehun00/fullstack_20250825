package com.company.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkillBuy implements MainController1 {

	@Override
	public int exec(List<UserInfo> users, int find) {
        Scanner sc = new Scanner(System.in);
        UserInfo currentUser = users.get(find);
     // SkillInfo가 null이면 초기화
        if (currentUser.getSkillInfo() == null) {
            SkillInfo newSkillInfo = new SkillInfo(SkillData.getDefaultSkills(), new ArrayList<>());
            currentUser.setSkillInfo(newSkillInfo);
        }

        
        SkillInfo userSkillInfo = currentUser.getSkillInfo();

        List<Skill> storeSkills = SkillData.getDefaultSkills(); // 상점 스킬 목록
        List<String> userSkillBag = userSkillInfo.getSkillBag(); // 유저가 가진 스킬 이름 목록

        System.out.println("=== 스킬 상점 ===");
        for (int i = 0; i < storeSkills.size(); i++) {
            Skill skill = storeSkills.get(i);
            System.out.println("[" + i + "] " + skill.getName() + "가격 : " + skill.getCost() + "데미지 : " +skill.getDamage());
        }

        System.out.print("구매할 스킬 번호 입력 > ");
        int choice = sc.nextInt();

        if (choice < 0 || choice >= storeSkills.size()) {
            System.out.println("잘못된 선택입니다.");
            return find;
        }

        Skill selectedSkill = storeSkills.get(choice);

        // 돈 확인
        if (currentUser.getMoney() >= selectedSkill.getCost()) {
            currentUser.setMoney(currentUser.getMoney() - selectedSkill.getCost());
            userSkillBag.add(selectedSkill.getName());
            System.out.println("[" + selectedSkill.getName() + "] 스킬을 구매했습니다!");
            System.out.println("남은 돈: " + currentUser.getMoney());
        } else {
            System.out.println("돈이 부족합니다. 구매할 수 없습니다.");
        }

        return find;
    }


}
