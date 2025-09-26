package com.company.java011;

// 1. 상속? 클래스의 재사용
/*	실선 - 속이 빈 화살표
 	Object			3)			 {		Object()			} 4)
 	↑
 	A int a = 10	2)			 {a		A()			a=10	} 5)
 	↑
 	B int b = 20	1) new: 1번지 {b  -> B()			b=20	} 6)
 	
 	B b1 = new B(); b1.show();
 	1) extends 상속
 	2) is a : A는 Object이다. B도 Object
 	3) 생성자 호출 : B() -> A() -> Object    1 2 3
 	4) 객체 생성  : Object -> A -> B        4 5 6
 */
class A extends Object{
	int a;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
class B extends A{
	int b;

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void show() {
		System.out.println(a + "\t" + b);
	}

	
	
}
public class Extends001 {
	public static void main(String[] args) {
		
	}
}
