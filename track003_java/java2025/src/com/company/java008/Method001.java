package com.company.java008;

public class Method001 {
	// (1) 마법상자 - 코드재사용
	public static void hello() {
		System.out.println("안녕");
	}
	public static void smile() {
		System.out.print(":)");
	}
	public static void line() {System.out.println();}
	///////////////////////////////////////////
	public static void main(String[] args) {
	// (2) 마법상자 사용
		smile();hello();line();hello();
	}
	///////////////////////////////////////////
}
