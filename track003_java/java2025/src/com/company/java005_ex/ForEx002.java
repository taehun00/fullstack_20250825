package com.company.java005_ex;
import java.util.Scanner;

public class ForEx002 {
	public static void main(String[] args) {
		int d;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력하세요 > ");
		d = sc.nextInt();
		
		for (int i=1; i<=9; i++) {System.out.print(d + "*" + i + "=" + d*i); 
		System.out.println(); }
	}
}
