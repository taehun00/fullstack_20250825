package com.company.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkillSell implements MainController1 {

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

        if (userSkillBag.isEmpty()) {
            System.out.println("판매할 스킬이 없습니다.");
            return find;
        }

        System.out.println("=== 스킬 판매 ===");
        for (int i = 0; i < userSkillBag.size(); i++) {
            System.out.println("[" + i + "] " + userSkillBag.get(i));
        }

        System.out.print("판매할 스킬 번호 입력 > ");
        int choice = sc.nextInt();

        if (choice < 0 || choice >= userSkillBag.size()) {
            System.out.println("잘못된 선택입니다.");
            return find;
        }

        String selectedSkillName = userSkillBag.get(choice);

        // 스킬 가격 찾기
        Skill selectedSkill = null;
        for (Skill skill : storeSkills) {
            if (skill.getName().equals(selectedSkillName)) {
                selectedSkill = skill;
                break;
            }
        }

        if (selectedSkill == null) {
            System.out.println("해당 스킬의 가격 정보를 찾을 수 없습니다.");
            return find;
        }

        double refund = selectedSkill.getCost() * 0.8;
        currentUser.setMoney(currentUser.getMoney() + refund);
        userSkillBag.remove(choice);

        System.out.println("[" + selectedSkillName + "] 스킬을 판매했습니다!");
        System.out.println("입금된 금액: " + refund);
        System.out.println("현재 잔액: " + currentUser.getMoney());

        return find;


	}

}
