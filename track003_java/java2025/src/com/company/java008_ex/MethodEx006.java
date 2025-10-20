package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx006 {
	
	public static int process_total(int attack, int defense, int speed) {
		return attack + defense + speed;
	}
	
	public static float process_avg(int total) {
		return (float)(total/3.0);
	}
	
	public static String process_grade(float avg) {
		return avg >= 90 ? "S" :
			   avg >= 80 ? "A" :
			   avg >= 70 ? "B" :
			   avg >= 60 ? "C" : "D";
	}
	
	public static String process_star(float avg) {
		String result = "";
		for (int i=0; i<(int)(avg/10); i++) {
			result += "*";
		}
		return result;
	}
	
	public static String process_quest(float avg) {
		if (avg>=90) return "전설의 용 퇴치";
		else if (avg>=80) return "용 퇴치";
		else if (avg>=70) return "병사 100마리 퇴치";
		else return "병사 10마리 퇴치";
	}
	
	public static String process_type(int attack, int defense, int speed) {
		if(attack>defense && attack>speed) {
			return "공격형";
		}
		else if(defense>attack && defense>speed) {
			return "방어형";
		}
		else if(speed>attack && speed>defense) {
			return "민첩형";
		}
		else if(attack==defense && attack>speed) {
			return "공격방어형";
		}
		else if(defense==speed && defense>attack) {
			return "방어민첩형";
		}
		else if(speed==attack && speed>defense) {
			return "공격방어형";
		}
		else if(attack==defense && attack==speed) {
			return "만능형";
		}
		return null;
	}
	
	public static void process_type(String name, int attack, int defense, int speed, int total, float avg, String grade, String star, 
									String quest, String type) {
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("캐릭터" + "\t" + "공격력" + "\t" + "방어력" + "\t" + "민첩성" + "\t" + "총합" + "\t" + "평균" + "\t" + 
							"등급" + "\t" + "랭킹" + "\t" + "추천퀘스트" + "\t" + "캐릭터타입");
		System.out.println("----------------------------------------------------------");
		System.out.println(name + "\t" + attack + "\t" + defense + "\t" + speed + "\t" + total + "\t" + String.format("%.2f", avg)
							+ "\t" + grade + "\t" + star + "\t" + quest + "\t" + type);
		System.out.println("----------------------------------------------------------");
	}
	
	public static int input_num(String subject) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(subject + "을 입력하세요(0~100) > ");
		return sc.nextInt();
		
	}
	
	public static void main(String[] args) {
		String name ;
		int attack , defense , speed ;
		int total;
		float avg;
		String grade, star, quest, type;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("캐릭터 이름을 입력하세요 > ");
		name = sc.next();
		
		attack = input_num("공격력");
		defense = input_num("방어력");
		speed = input_num("민첩성");
		
		total = process_total(attack, defense, speed);
		avg = process_avg(total);
		grade = process_grade(avg);
		star = process_star(avg);
		quest = process_quest(avg);
		type = process_type(attack, defense, speed);
		
		process_type(name, attack, defense, speed, total, avg, grade, star, quest, type);
	}
}
