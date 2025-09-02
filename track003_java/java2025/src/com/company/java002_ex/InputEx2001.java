package com.company.java002_ex;
import java.util.Scanner;

public class InputEx2001 {
	public static void main(String[] args) {
		double pi;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("파이값을 입력하시오 >");
		pi = sc.nextDouble();
		
		System.out.println("파이값은 " + pi + "입니다.");
	}
}
