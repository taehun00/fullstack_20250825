package com.company.java009_ex;

import java.util.Scanner;

class AnimalCharacter{
	String name;
	String type;
	int baseSpeed;
	int specialBoost;
	double finalSpeed;
	public AnimalCharacter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AnimalCharacter(String name, String type, int baseSpeed, int specialBoost) {
		super();
		this.name = name;
		this.type = type;
		this.baseSpeed = baseSpeed;
		this.specialBoost = specialBoost;
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("동물 이름 > ");
		this.name = sc.next();
		System.out.print("동물 타입(육식/초식) > ");
		this.type = sc.next();
		System.out.print("기본 속도 > ");
		this.baseSpeed = sc.nextInt();
		System.out.print("특수 능력치 > ");
		this.specialBoost = sc.nextInt();
	}
	double calculateSpeed() {
		if(this.type.equals("육식")) {
			return this.baseSpeed + this.specialBoost*2/10.0;
			
		}
		else if(this.type.equals("초식")) {
			return this.baseSpeed + this.specialBoost*1/10.0;
		}
		else return 0;
	}
	
	void show() {
		System.out.println("동물 캐릭터: " + this.name);
		System.out.println("타입: " + this.type);
		if(calculateSpeed() == 0) {
			System.out.println("타입을 잘못입력했습니다.");
		}
		else {System.out.printf("최종 속도: %.2f\n", calculateSpeed());}
		System.out.println();
	}
	
}

public class ClassEx008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalCharacter a1 = new AnimalCharacter("치타", "육식", 100, 30);
        a1.show();

        AnimalCharacter a2 = new AnimalCharacter();
        a2.input();
        a2.show();
	}

}
