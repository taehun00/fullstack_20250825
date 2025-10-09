package com.company.java012_ex;


//Q1. 상속도를 그리시오.

/*
		Object
		  ↑
		TestA2 (int a, toString)
		  ↑
		TestB2 (int b, toString)
*/
class TestA2 extends Object{
	int a = 10;

	@Override
	public String toString() {
		return "TestA2 [a=" + a + "]";
	}
	
}

class TestB2 extends TestA2{
	int b = 20;

	@Override
	public String toString() {
		return "TestB2 [b=" + b + "]";
	}
	
}

public class PolyEx001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA2 ta = new TestB2();
		//Q2. 29번째줄에서 TestA2 ta 는 클래스의 무엇을 사용할 수 있는지 코드의 의미
		
		/*
		 int a, toString() 을 사용할 수 있다.
		 */
		
		//Q3. 29번째줄에서 TestB2() 는 클래스의 무엇을 사용할 수 있을까요?
		/*
		 int b, toString()와 int a, toString()을 사용할 수 있다.
		 하지만 오버라이딩된 toString()은 자식껄 사용하므로
		 int b, toString()와 int a, ---
		 */
		
		System.out.println(ta); //Q4. 출력내용과 이유?
		/*
		 오버라이딩된 toString()은 자식껄 사용하므로 출력 내용은 TestB2 [b= 20]
		 */
		
		//System.out.println(ta.a); //Q5.사용가능?
		
		// 사용가능 10
		
	    //System.out.println(ta.b); //Q6.사용가능?
		
		// 사용불가능 ta에 대한 형변환을 해줘야 사용 가능하다.
	}

}
