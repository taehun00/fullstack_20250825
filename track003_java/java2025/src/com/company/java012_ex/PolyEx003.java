package com.company.java012_ex;

//Q1. 상속도를 그리시오. 

/*
Object
  ↑
TestA4 (int a, toString)
  ↑
TestB4 (int b, toString)
*/
class TestA4  extends Object{  
 int a=10;
 @Override public String toString() { return "TestA4 [a=" + a + "]"; }
}
class TestB4  extends TestA4{  
 int b=20;
 @Override public String toString() { return "TestB4 [b=" + b + "]"; }
}
/////////////////////////////////////////////////
public class PolyEx003 {
 public static void main(String[] args) {
    TestA4  ta = new TestA4();
    //Q2. TestA4  ta 사용할 수 있는범위는?
    
    // { int a, toString() }
    
    //Q3. new TestA4() 는  heap area 에서 호출되는 생성자의 순서와 객체가 만들어지는 순서는?
    
    //생성자의 순서 : int a, 객체가 만들어지는 순서 : int a, toString()
    
    TestB4  tb = new TestB4();  
    //Q4. TestB4  tb 사용할 수 있는범위는?
    
    // { int a, toString() }, { int b, toString() }
    
    //Q5. new TestB4() 는  heap area 에서 호출되는 생성자의 순서와 객체가 만들어지는 순서는?
    
    //생성자의 순서 : int b, 객체가 만들어지는 순서 : { int a, toString() }, { int b, toString() }
    
    ta = new TestB4();
    //Q6. ta가 사용할 수 있는 보장하는 변수와 메서드는?
    
    //변수 : int a, 메서드 : TestA4의 toString()
    
    //Q7.ta = new TestB4(); 에서 new TestB4() 에서 사용할 수 있는 범위는? 
    
    // { int a, toString() }, { int b, toString() }
    
    tb         = (TestB4) ta;
    //Q8. tb         = (TestB4) ta;   에서 tb가 사용할수 있는 범위는?
    
    // { int a, toString() }, { int b, toString() }
    
    //Q9. 컴피일러시  tb         = (TestB4) ta;  오류가 안나는 이유는?
    
    //ta는 { int a, toString() }만 사용가능했는데 (TestB4) 형변환을 하면서 { int b, toString() }까지 사용가능하게 돼서.
    
    System.out.println(tb);  //Q10. 출력내용과 그이유는? TestA4  vs  TestB4
    System.out.println(tb.b);//Q11. 출력내용?	20
    System.out.println(tb.a);//Q12. 출력내용? 10
 }
}