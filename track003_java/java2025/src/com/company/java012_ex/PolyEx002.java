package com.company.java012_ex;

//Q1. 상속도를 그리시오. 

/*
Object
  ↑
TestA3 (int a, toString)
  ↑
TestB3 (int b, toString)
*/

class TestA3  extends Object{  
 int a=10;
 @Override public String toString() { return "TestA3 [a=" + a + "]"; }
}
class TestB3  extends TestA3{  
 int b=10;
 @Override public String toString() { return "TestB3 [b=" + b + "]"; }
} 


/////////////////////////////////////////////////
public class PolyEx002 {
 public static void main(String[] args) {
    TestB3  tb =  (TestB3) new TestA3();
    //Q2. TestB3  tb는 클래스의 무엇을 사용할수 있을까요? 코드의 의미
    
    // TestB3 의 ( int b, toString() ) ( int a, toString() ) 사용 가능
    
    //Q3. (TestB3) new TestA3() 클래스의 무엇을 사용할 수 있을까요?
    
    // TestA3 의 ( int a, toString() ) 사용 가능
    
    //Q4. 코드상에서는 문제가 없는데 코드를 실행하면 오류가 나는 이유는?
    
    // TestA3 의 ( int a, toString() )을 초기화 후 사용 가능한 상태로 만들었는데
    // tb는 TestB3 의 ( int b, toString() )만 사용 가능하기 때문에 오류가 발생한다.
 }
}

