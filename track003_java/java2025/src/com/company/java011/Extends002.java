package com.company.java011;

/* 상속 : 클래스의 재사용
 	Object		(실선-속이 빈 화살표)	■3) Object{								■4) }
 	  ↑
 	Animal		■2) Animal() 	{ name, age / eat(), sleep(), poo()	}		■5)	}
 	↑    ↑		■1) Cat() 		{ animal_card / qukquk() }					■6) }
   Cat  Person 	■0) 1번지	
------------------------------------
Cat sally = new Cat();
------------------------------------
1) Cat은 Animal이다
2) 생성자호출 : Cat() -> Animal() -> Object()
3) 객체생성	: Object -> Animal -> Cat   
 */
class Animal{
	String name;
	int age;
	void eat() {System.out.println("먹고");}
	void sleep() {System.out.println("자고");}
	void poo() {System.out.println("배변");}
}
class Cat extends Animal{
	String animal_card;
	void qukquk() {System.out.println("꾹꾹이");}
}
class Person{
	
}

public class Extends002 {
	public static void main(String[] args) {
		Cat sally = new Cat();
		sally.name="kitty";
		sally.age =52;
		sally.animal_card="ani-1234";
		sally.eat();
		sally.sleep();
		sally.poo();
		sally.qukquk();
		
	}
}
