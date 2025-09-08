package com.company.java004_ex;
import java.util.Scanner;
public class SwitchEx001 {
	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 한개를 입력하세요 > ");
		num1 = sc.nextInt();
		
		switch(num1) {
		case 3 : System.out.println("봄"); break;
		case 6 : System.out.println("여름"); break;
		case 9 : System.out.println("가을"); break;
		case 12 : System.out.println("겨울"); break;
		default : System.out.println("다른 숫자를 입력하세요.");
		}
	}
}
