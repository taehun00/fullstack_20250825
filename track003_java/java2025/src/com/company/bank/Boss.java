package com.company.bank;

import java.util.List;
import java.util.Scanner;

public class Boss implements MainController1 {

	@Override
	public int exec(List<UserInfo> users, int find) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        UserInfo user = users.get(find);

        // 보스 초기 체력
        int bossHp = 100;
        int totalDamage = 0;

        SkillInfo skillInfo = user.getSkillInfo();
        if (skillInfo == null || skillInfo.getSkillBag().isEmpty()) {
            System.out.println("❌ 사용할 스킬이 없습니다. 먼저 스킬을 구매하세요.");
            return find;
        }

        List<String> skillBag = skillInfo.getSkillBag();
        List<Skill> storeSkills = SkillData.getDefaultSkills();

        System.out.println("\n=== 🐉 보스 전투 시작! ===");
        System.out.println("보스 체력: " + bossHp);

        while (bossHp > 0) {
            System.out.println("\n⚔️ 사용 가능한 스킬:");
            for (int i = 0; i < skillBag.size(); i++) {
                String name = skillBag.get(i);
                Skill skill = null;
                for (Skill s : storeSkills) {
                    if (s.getName().equals(name)) {
                        skill = s;
                        break;
                    }
                }


                if (skill != null) {
                    System.out.printf("[%d] %s | 데미지: %d\n", i, skill.getName(), skill.getDamage());
                }
            }

            System.out.print("사용할 스킬 번호 입력 > ");
            int choice = sc.nextInt();

            if (choice < 0 || choice >= skillBag.size()) {
                System.out.println("❌ 잘못된 선택입니다.");
                continue;
            }

            String selectedName = skillBag.get(choice);
            Skill selectedSkill = null;

            for (Skill s : storeSkills) {
                if (s.getName().equals(selectedName)) {
                    selectedSkill = s;
                    break;
                }
            }


            skillBag.remove(choice);

            
            if (selectedSkill == null) {
                System.out.println("⚠️ 해당 스킬 정보를 찾을 수 없습니다.");
                continue;
            }

            int damage = selectedSkill.getDamage();
            bossHp -= damage;
            totalDamage += damage;

            System.out.printf("💥 [%s] 스킬 사용! 보스에게 %d 데미지!\n", selectedSkill.getName(), damage);
            System.out.println("🩸 남은 보스 체력: " + Math.max(bossHp, 0));
        }

        System.out.println("\n🎉 보스를 처치했습니다!");
        System.out.println("💰 골드 +500 획득!");
        user.setMoney(user.getMoney() + 500);
        System.out.println("현재 잔액: " + user.getMoney());

        return find;

	}

}
