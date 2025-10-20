package com.company.java005_ex;
import java.util.Scanner;

public class Repeat013_3 {
	public static void main(String[] args) {
		int int1;
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("숫자를 입력하세요 > ");
			int1 = sc.nextInt();
			
			if (int1 == 1) {
				System.out.println("종료");
				System.exit(0);
			}
		}
	}
}
