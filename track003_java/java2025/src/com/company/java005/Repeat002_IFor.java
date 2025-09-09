package com.company.java005;
import java.util.Scanner;

public class Repeat002_IFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 무한반복 for(;;){}
		for(;;) {
			System.out.println("숫자1을 입력하세요.");
			int a = sc.nextInt();
			if (a == 1) break;
		}
		
		//for - break
		for(int i=1; i<=10; i++) {
			if(i==3) break;
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		//for - continue
		for(int i=1; i<=10; i++) {
			if(i==3) continue;
			System.out.print(i + "\t");
		}
	}
}
