package com.company.java012;

/*
 1. 클래스는 부품객체
 2. 상속은 재활용
 
		Object			Object
		  ↑				  ↑
		TestA1			TestB1
		(int a)			(int b)

 */
class TestA1 extends Object{
	int a;
}

class TestB1 extends Object{
	int b;
}

public class Poly001 {
	public static void main(String[] args) {
		TestA1 ta1 = new TestA1();
		
		//TestB1 tb1 = ta1;
		// Q 오류나는 이유는?
		//Type mismatch: cannot convert from TestA1 to TestB1
		// 클래스도 자료형 ( 틀 - object )
		
	}
}
