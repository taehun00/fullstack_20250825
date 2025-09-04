package com.company.java004_ex;
import java.util.Scanner;

public class IfEx005 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한개를 입력하세요> ");
		num = sc.nextInt();
		
		if (num>=0) {System.out.println(num);}
		else {System.out.println(num * -1);}
	}
}
