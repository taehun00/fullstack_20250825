package com.company.java013_ex;

/*		Abstract ( is A )

 		   
 		   Object
 		     ↑
 		   Robot { abstract charge() , move() , speak() }
 		   ↑    ↑				↑
CleaningRobot  SecurityRobot CookingRobot { @charge() , @move() , @speak() }
 		   
 
 */

abstract class Robot{
	String model;
	int batteryLevel;
	void myrobot() { System.out.println("로봇입니다."); }
	abstract void charge();
	abstract void move();
	abstract void speak();
	public Robot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Robot(String model, int batteryLevel) {
		super();
		this.model = model;
		this.batteryLevel = batteryLevel;
	}
	
	
}

class CleaningRobot extends Robot{
	
	public CleaningRobot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CleaningRobot(String model, int batteryLevel) {
		super(model, batteryLevel);
		// TODO Auto-generated constructor stub
	}
	@Override
	void charge() {
		// TODO Auto-generated method stub
		System.out.print(super.model + " 충전 중... 배터리");
	}
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println(super.model + " 청소 중!");
	}
	@Override
	void speak() {
		// TODO Auto-generated method stub
		System.out.println(super.model + " 먼지를 제거합니다!");
	}
}
class SecurityRobot extends Robot{
	
	public SecurityRobot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SecurityRobot(String model, int batteryLevel) {
		super(model, batteryLevel);
		// TODO Auto-generated constructor stub
	}
	@Override
	void charge() {
		// TODO Auto-generated method stub
		System.out.print(this.model + " 태양광 충전 중... 배터리");
	}
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println(this.model + " 경비 중!");
	}
	@Override
	void speak() {
		// TODO Auto-generated method stub
		System.out.println(this.model + "이상 없음. 안전 확보!");
	}
}
class CookingRobot extends Robot{
	
	public CookingRobot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CookingRobot(String model, int batteryLevel) {
		super(model, batteryLevel);
		// TODO Auto-generated constructor stub
	}
	@Override
	void charge() {
		// TODO Auto-generated method stub
		System.out.print(super.model + " 인덕션 충전 중... 배터리");
	}
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println(super.model + " 요리만드는 중!");
	}
	@Override
	void speak() {
		// TODO Auto-generated method stub
		System.out.println(super.model + "오늘의 메뉴는 파스타입니다!");
	}
}



public class AbstractEx001 {
	public static void main(String[] args) {
		// Robot robot = new Robot();  Q1. 구현부 {}가 없어서.
		Robot []r = { new CleaningRobot("로봇1",50), new SecurityRobot("로봇2",70), new CookingRobot("로봇3",95) };
		
		int[] levels = { 50, 70, 95 };
		
		//Q2. 
		for(int i=0; i<r.length; i++) {
			/*
			 * r[i].model = "Robo" + (i+1); r[i].batteryLevel = levels[i];
			 */
			r[i].charge(); System.out.println(r[i].batteryLevel + "%");
			r[i].speak();
		}
		
		
	}
	
}
