package com.company.java005_ex;
import java.util.Scanner;

public class Repeat012_1 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한개를 입력하세요(1,2,3) > ");
		num = sc.nextInt();
		
		if (num==1) {System.out.println("one");}
		else if (num==2) {System.out.println("two");}
		else if (num==3){System.out.println("three");}
		else {System.out.println("1,2,3이 아니다.");}
	}
}