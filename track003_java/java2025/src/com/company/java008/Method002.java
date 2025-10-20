package com.company.java008;

public class Method002 {
	//(1) 마법상자 정의
	//public static 리턴값 매서드명(파라미터){}
	public static void myint(int a) {
		System.out.println(a+3);
	}
	public static void ten(int b) {
		System.out.println(b*10);
	}
	public static void add(int money, int bitcoin) {
		System.out.println(money + bitcoin);
	}
	public static void main(String[] args) {
		myint(3);
		ten(3);
		add(10,20);
	}
}
