package com.company.java015;

class RefClass{ void method(String str) { System.out.println(str);}}
interface InterUsing{ void inter(RefClass c, String str);}

public class Lambda003 {
	public static void main(String[] arg) {
		//#1. 익명클래스
		InterUsing a1 = new InterUsing() {

			@Override
			public void inter(RefClass c, String str) {
				// TODO Auto-generated method stub
				c.method(str);
			}
			
		};
		a1.inter( new RefClass(), "Hello :)");
		
		//#2. 람다 ()->{}
		InterUsing a2 = (RefClass c, String str) -> {
			c.method(str);
		};
		a2.inter(new RefClass(), "Hello2 :)");
		
		InterUsing a3 = (c, str) -> {
			c.method(str);
		};
		a3.inter(new RefClass(), "Hello3 :)");
		
		//#3. ::표현식(참조)
		InterUsing a4 = RefClass::method;
		a4.inter(new RefClass(), "Hello4 :)");
		
		//#4. interface InterBasic{ int method(int a, int b); }
		InterBasic basic = (int a, int b) -> { 
			return Math.max(a, b);
		};
		System.out.println(basic.method(10, 3));
		
		InterBasic basic2 = (a, b) -> Math.max(a, b);
		
		System.out.println(basic2.method(100, 3));
		
		InterBasic basic3 = Math::max;
		
		System.out.println(basic3.method(1000, 3));
		
		
		Ex1 ex1 = s -> s.length();
		System.out.println(ex1.getLength("hello"));
		
		Ex2 ex2 = System.out::println;
		ex2.print("lambda:)");
	}
}
interface Ex1 { int getLength(String s); }
interface Ex2 { void print(String s); }
interface InterBasic{ int method(int a, int b); }