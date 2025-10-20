package com.company.java010;

class Farm{
	String name;
	int age;
	static String FarmName="동물농장";
	static int FarmNum;
	static String FarmBoss;
	static{ FarmNum=2; FarmBoss="신동엽"; } // 초기화블록
	
	void show() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("회사 수 : " + Farm.FarmNum);
	}
	
	static void num_plus() { //클래스 메서드
		FarmNum++;								// static에서는 this 사용불가
		
	}
}

public class Static001 {
	public static void main(String[] args) {
		System.out.println("\n\n0. 동물농장");
		System.out.println(Farm.FarmName);
		System.out.println(Farm.FarmNum);
		System.out.println(Farm.FarmBoss);
		
		System.out.println("\n\n1. 동물농장식구-this-각각");
		
		Farm cat = new Farm();
		cat.name="hun"; cat.age=3;
		cat.show();
		Farm dog = new Farm();
		dog.name="tae"; dog.age=7;
		//dog.num_plus(); 
		Farm.num_plus();
		dog.show();
	}
}
