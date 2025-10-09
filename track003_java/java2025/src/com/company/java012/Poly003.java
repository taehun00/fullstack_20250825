package com.company.java012;

/*
1. 클래스는 부품객체
2. 상속은 재활용
		Object			
		  ↑				 
		TestA2 (int a, toString)
		  ↑
		TestB2 (int b, toString)
*/

class TestA3 extends Object{
	int a = 10;

	@Override
	public String toString() {
		return "TestA3 [a=" + a + "]";
	}
	
}

class TestB3 extends TestA3{
	int b = 20;

	@Override
	public String toString() {
		return "TestB3 [b=" + b + "]";
	}
	
}

public class Poly003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestB3 tb = new TestA3();
		
		// 자식 = 부모    다운캐스팅
		TestB3 tb = (TestB3) new TestA3();
		//1. TestB3 tb 범위 : TestB3(int b, toString) - TestA3(int a, toString)
		//2. TestA3()은 (int a, toString)만 처리
		//3. TestB3(int b, toString) 보장안됨.
		/*
		 Exception in thread "main" java.lang.ClassCastException: 
		 class com.company.java012.TestA3 cannot be cast to class com.company.java012.TestB3 
		 (com.company.java012.TestA3 and com.company.java012.TestB3 are in module java2025 of loader 'app') 
		 
		 */
	}

}
