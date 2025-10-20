package com.company.java005_ex;
import java.util.Scanner;

public class Bank_Project {
    public static void main(String[] args) {
        String[] wizardName = new String[3];       // 마법사 이름
        String targetName;
        String findName;
        double[] mana = new double[3];       // 마나 아직 사용x
        double[] money = new double[3];      // 골드
        int count = 0;
        int menu = 0;
        String confirm;
        String[] skillList = {"파이어볼", "아이스쉴드", "라이트닝스트라이크"};
        double[] skillCost = {50.0, 70.0, 200.0};
        int[] skillDamage = {1, 2, 5};
        String[][] skillBag = new String[3][10]; // 최대 3명의 마법사, 각자 최대 10개의 스킬 보유
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("====== RPG CHARACTER MANAGER ======");
            System.out.println("1. 캐릭터 생성");
            System.out.println("2. 캐릭터 조회");
            System.out.println("3. 스킬 구매");
            System.out.println("4. 스킬 판매");
            System.out.println("5. 보스 잡기");
            System.out.println("6. 캐릭터 삭제");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 >>> ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("캐릭터 이름 입력: ");
                    targetName = sc.next();

                    int duplicateCheck = -1;
                    for (int i = 0; i < wizardName.length; i++) {
                        if (wizardName[i] != null && targetName.equals(wizardName[i])) {
                            System.out.println("이미 존재하는 캐릭터 이름입니다.");
                            duplicateCheck = 0;
                            break;
                        }
                    }
                    if (duplicateCheck == 0) break;

                    wizardName[count] = targetName;
                    
                    System.out.print("돈 입력: ");
                    money[count] = sc.nextInt();

                    if (money[count] < 0) {
                        System.out.println("골드는 음수가 될 수 없습니다.");
                        money[count] = 0;
                        break;
                    }

                    count++;
                    System.out.println("캐릭터 생성 완료!");
                    break;

                case 2: case 3: case 4: case 5: case 6:
                    System.out.print("캐릭터 이름 입력: ");
                    findName = sc.next();

                    int found = -1;
                    for (int i = 0; i < wizardName.length; i++) {
                        if (findName.equals(wizardName[i])) {
                            found = i;
                            break;
                        }
                    }

                    if (found == -1) {
                        System.out.println("캐릭터를 찾을 수 없습니다.");
                        break;
                    }

                    switch (menu) {
                        case 2:
                            System.out.println("== 캐릭터 정보 ==");
                            System.out.println("이름: " + wizardName[found]);
                            System.out.println("돈: " + money[found]);
                            System.out.println("== 보유 스킬 ==");
                            int hasSkill = -1;
                            for (int i = 0; i < skillBag[found].length; i++) {
                                if (skillBag[found][i] != null) {
                                    System.out.println("- " + skillBag[found][i]);
                                    hasSkill = 1;
                                    break;
                                }
                            }
                            if (hasSkill == -1) {
                                System.out.println("보유한 스킬이 없습니다.");
                            }
                            break;

                        case 3:
                            System.out.println("현재 내 돈: " + money[found]);
                            for(int i=0;i<skillList.length;i++) {
                                System.out.print((i + 1) + ". " + skillList[i] + " (비용: " + skillCost[i] + ", 데미지: " + skillDamage[i] + ")" + "\t");
                            }
                            System.out.println();
                            System.out.print("무슨 마력을 구매하시겠습니까?(번호 입력): ");
                            int choice = sc.nextInt();
                            
                            if (choice < 1 || choice > skillList.length) {
                                System.out.println("잘못된 선택입니다.");
                                break;
                            }
                            
                            if(money[found] < skillCost[found]) {
                                System.out.println("골드가 부족합니다. 구매할 수 없습니다.");
                                break;
                            }
                            
                            // 가방 슬롯
                            int slot = -1;
                            for (int i=0; i < skillBag[found].length; i++) {
                                if (skillBag[found][i] == null) {
                                    slot = i;
                                    break;
                                }
                            }
                            
                            if (slot == -1) {
                                System.out.println("가방이 가득 찼습니다. 더 이상 스킬을 구매할 수 없습니다.");
                                break;
                            }
                            
                            skillBag[found][slot] = skillList[choice-1];
                            money[found] -= skillCost[choice-1];
                            
                            System.out.println(skillList[choice-1] + " 마력을 구매했습니다.");
                            System.out.println("남은 골드: " + money[found]);
                            break;

                            
                            
                        case 4:
                            System.out.println("== 보유 스킬 목록 ==");
                            int skillCount = 0;
                            for (int i = 0; i < skillBag[found].length; i++) {
                                if (skillBag[found][i] != null) {
                                    String skillName = skillBag[found][i];
                                    double sellPrice = 0;

                                    for (int j = 0; j < skillList.length; j++) {
                                        if (skillList[j].equals(skillName)) {
                                            sellPrice = skillCost[j] * 0.8;
                                            break;
                                        }
                                    }

                                    System.out.println((skillCount + 1) + ". " + skillName + " (판매가: " + sellPrice + " 골드)");
                                    skillCount++;
                                }
                            }

                            if (skillCount == 0) {
                                System.out.println("판매할 스킬이 없습니다.");
                                break;
                            }

                            System.out.print("판매할 스킬 번호를 입력하세요: ");
                            int sellChoice = sc.nextInt();

                            // 유효성 검사
                            int isSkill = -1;
                            int countIndex = 0;
                            for (int i = 0; i < skillBag[found].length; i++) {
                                if (skillBag[found][i] != null) {
                                    countIndex++;
                                    if (countIndex == sellChoice) {
                                        isSkill = i;
                                        break;
                                    }
                                }
                            }

                            if (isSkill == -1) {
                                System.out.println("잘못된 선택입니다.");
                                break;
                            }

                            // 스킬 이름으로 원가 찾기
                            String skillToSell = skillBag[found][isSkill];
                            int priceIndex = -1;
                            for (int i = 0; i < skillList.length; i++) {
                                if (skillList[i].equals(skillToSell)) {
                                    priceIndex = i;
                                    break;
                                }
                            }

                            if (priceIndex == -1) {
                                System.out.println("판매 오류: 스킬 정보를 찾을 수 없습니다.");
                                break;
                            }

                            double refund = skillCost[priceIndex] * 0.8;
                            money[found] += refund;
                            skillBag[found][isSkill] = null;

                            System.out.println(skillToSell + " 스킬을 판매했습니다. 환급된 골드: " + refund);
                            System.out.println("현재 골드: " + money[found]);
                            break;

                        case 5:
                            int bossHp = 10;
                            int totalDamage = 0;

                            System.out.println("=== 1단계 보스 ===");
                            System.out.println("보스 체력: " + bossHp);

                            while (totalDamage < bossHp) {
                                System.out.println("== 사용 가능한 스킬 목록 ==");
                                int skillCount1 = 0;
                                for (int i = 0; i < skillBag[found].length; i++) {
                                    if (skillBag[found][i] != null) {
                                        String skillName = skillBag[found][i];
                                        int damage = 0;

                                        for (int j = 0; j < skillList.length; j++) {
                                            if (skillList[j].equals(skillName)) {
                                                damage = skillDamage[j];
                                                break;
                                            }
                                        }

                                        System.out.println((skillCount1 + 1) + ". " + skillName + " (데미지: " + damage + ")");
                                        skillCount1++;
                                    }
                                }

                                if (skillCount1 == 0) {
                                    System.out.println("사용 가능한 스킬이 없습니다. 전투를 진행할 수 없습니다.");
                                    break;
                                }

                                System.out.print("사용할 스킬 번호를 입력하세요: ");
                                int skillChoice = sc.nextInt();						// 사용할 스킬 번호

                                // skillBag에서 사용할 스킬 인덱스 찾기
                                int actualIndex = -1;								// 사용할 스킬 위치 
                                int countIndex1 = 0;								// 배열 안에서만 사용되는 변수
                                for (int i = 0; i < skillBag[found].length; i++) {
                                    if (skillBag[found][i] != null) {
                                        countIndex1++;
                                        if (countIndex1 == skillChoice) {
                                            actualIndex = i;						// 사용할 스킬 리스트 번호(0 1 2 ...)
                                            break;
                                        }
                                    }
                                }

                                if (actualIndex == -1) {
                                    System.out.println("잘못된 선택입니다.");
                                    break;
                                }

                                // 데미지 계산
                                String selectedSkill = skillBag[found][actualIndex];
                                int damage = 0;
                                for (int i = 0; i < skillList.length; i++) {
                                    if (skillList[i].equals(selectedSkill)) {		// 스킬 리스트에 있는 스킬 이름과 내가 가방에서 선택한 스킬 이름이 같으면
                                        damage = skillDamage[i];					
                                        break;
                                    }
                                }
                                
                                totalDamage += damage;
                                System.out.println(selectedSkill + " 스킬을 사용했습니다! 보스에게 " + damage + " 데미지를 입혔습니다.");
                                System.out.println("누적 데미지: " + totalDamage + " / " + bossHp);

                                // 스킬 사용 후 제거
                                skillBag[found][actualIndex] = null;

                                if (totalDamage >= bossHp) {
                                    System.out.println("🎉 보스를 처치했습니다!");
                                    double reward = 300.0;
                                    money[found] += reward;
                                    System.out.println("보상으로 골드 " + reward + "를 획득했습니다.");
                                    System.out.println("현재 골드: " + money[found]);
                                    break;
                                }
                            }
                            break;
                            
                        
                        case 6:
                            System.out.println("캐릭터를 삭제하시겠습니까? (Y/N)");
                            confirm = sc.next();
                            if (confirm.equals("Y")) {
                                wizardName[found] = null;
                                money[found] = 0;
                                count--;
                                System.out.println("캐릭터가 삭제되었습니다.");
                            } else {
                                System.out.println("삭제를 취소했습니다.");
                            }
                            break;
                    }
                    break;
                    
                

                case 9:
                    System.out.println("게임을 종료합니다.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("잘못된 메뉴 번호입니다.");
                    break;
            }
        }
    }

}
