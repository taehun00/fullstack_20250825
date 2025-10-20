package com.company.java005;

public class Repeat001_For {
	public static void main(String[] args) {
		//step1		System.out.print() 3번 사용해서 1	2  3
		System.out.println("step1");
		System.out.print(1 + "\t");
		System.out.print(2 + "\t");
		System.out.print("3");
		// for(시작; 종료; 변화)(구문)
		
		//step2
		System.out.println("\nstep2");
		for (int i=1; i<=3; i++) {
			System.out.print(i + "\t");
		}
		
		//step3
		System.out.println("\nstep3");
		for (int i=1; i<=3; i++) { System.out.print(i + "\t"); } // ctrl + alt + j 한줄로 모으기
		System.out.println();
		for (int i=1; i<=5; i=i+2) { System.out.print(i + "\t"); }
		System.out.println();
		for (int i=1; i<=3; i++) { System.out.print("Hello" + i + "\t"); }
	}
}
