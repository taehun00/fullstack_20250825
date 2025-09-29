package com.company.java012;

/*
1. 클래스는 부품객체
2. 상속은 재활용
		Object			
		  ↑				 
		Animal			{ String name; int age; }
		  ↑
		 Cat			{ String number; void show() }
*/
/*
		Object			
		  ↑				 
		Animal			{ String name; int age; }
		  ↑
		Person			{ String jumin; void show() }
*/
class Animal{
	String name;
	int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Animal() { 			//Object() 컴파일러가 자동생성 X -> 오버로딩과 상속시
		super();
		// TODO Auto-generated constructor stub
	}
	public void show() {
		System.out.println("Animal");
	}
}

class Cat extends Animal{
	String number;
	public void show() {
		{System.out.println("Cat > " + super.name + "/" + super.age);}
	}
}

class Person extends Animal{
	String jumin;
	public void show() {
		{System.out.println("Person > " + super.name + "/" + super.age);}
	}
}

public class Poly005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		// 부모 = 자식 / 업캐스팅 / 타입캐스팅 x
		Animal []anis = { new Cat(), new Cat(), new Person(), new Person() };
		
		Animal controller = null;
		controller = anis[0];
		controller.show();
		controller = anis[1];
		controller.show();
		controller = anis[2];
		controller.show();
		controller = anis[3];
		controller.show();
	}

}
