package com.company.java005_ex;

import java.util.Scanner;

public class Repeat014_3 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.print("숫자를 입력하세요 > ");
			num = sc.nextInt();
			
			if (num==7) {
				System.out.println("종료합니다!");
				break;
			}
		}
	}
}
