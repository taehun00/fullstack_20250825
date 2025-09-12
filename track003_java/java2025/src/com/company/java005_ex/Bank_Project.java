package com.company.java005_ex;
import java.util.Scanner;

public class Bank_Project {
    public static void main(String[] args) {
        String[] wizardName = new String[3];       // 마법사 이름
        String targetName;
        String[] element = new String[3];        // 속성(불, 얼음, 번개)
        String findName;
        String findJob;
        int[] level = new int[3];            // 캐릭터 레벨
        double[] mana = new double[3];       // 마나
        double[] money = new double[3];      // 골드
        int count = 0;
        int menu = 0;
        double chargeMana = 0; 					// 마력 충전
        double useMana = 0;
        String confirm;
        String[] skillList = {"파이어볼", "아이스쉴드", "라이트닝스트라이크"};
        double[] skillCost = {50.0, 70.0, 100.0};
        String[][] skillBag = new String[3][10]; // 최대 3명의 마법사, 각자 최대 10개의 스킬 보유
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("====== RPG CHARACTER MANAGER ======");
            System.out.println("1. 캐릭터 생성");
            System.out.println("2. 캐릭터 조회");
            System.out.println("3. 스킬 구매");
            System.out.println("4. 골드 사용");
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

                    System.out.print("마법 속성 입력(불, 얼음, 번개): ");
                    element[count] = sc.next();

                    System.out.print("레벨 입력: ");
                    level[count] = sc.nextInt();

                    mana[count] = 0;
                    money[count] = 1110;
/*
                    if (mana[count] < 0 || money[count] < 0) {
                        System.out.println("초기 마나, 골드는 음수가 될 수 없습니다.");
                        wizardName[count] = null;
                        element[count] = null;
                        level[count] = 0;
                        mana[count] = 0;
                        break;
                    }
*/
                    count++;
                    System.out.println("캐릭터 생성 완료!");
                    break;

                case 2: case 3: case 4: case 5: case 6:
                    System.out.print("캐릭터 이름 입력: ");
                    findName = sc.next();
                    System.out.print("직업 입력: ");
                    findJob = sc.next();

                    int found = -1;
                    for (int i = 0; i < wizardName.length; i++) {
                        if (findName.equals(wizardName[i]) && findJob.equals(element[i])) {
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
                            System.out.println("직업: " + element[found]);
                            System.out.println("레벨: " + level[found]);
                            System.out.println("마나: " + mana[found]);
                            System.out.println("마나: " + money[found]);
                            break;

                        case 3:
                            System.out.println("현재 내 돈: " + money[found]);
                            for(int i=0;i<skillList.length;i++) {
                            	System.out.print((i+1) + "." + skillList[i] + "(" + skillCost[i] + ")" + "\t");
                            }
                            System.out.println();
                            System.out.print("무슨 마력을 구매하시겠습니까?(번호 입력)");
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
                            for (int i=0; i<skillBag[found].length; i++) {
                            	slot = i;
                            	break;
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
                            System.out.print("사용할 골드 입력: ");
                            useMana = sc.nextDouble();
                            if (useMana < 0) {
                                System.out.println("음수는 사용할 수 없습니다.");
                                break;
                            }
                            if (mana[found] < useMana) {
                                System.out.println("골드가 부족합니다.");
                            } else {
                                mana[found] -= useMana;
                                System.out.println("골드 사용 완료! 현재 골드: " + mana[found]);
                            }
                            break;

                        case 5:
                        	System.out.println("구매할 스킬 번호 입력:");
                        	int skillChoice = sc.nextInt();
                        	
                        	
                        
                        case 6:
                            System.out.println("캐릭터를 삭제하시겠습니까? (Y/N)");
                            confirm = sc.next();
                            if (confirm.equals("Y")) {
                                wizardName[found] = null;
                                element[found] = null;
                                level[found] = 0;
                                mana[found] = 0;
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