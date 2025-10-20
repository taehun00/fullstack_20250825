package com.company.java005_ex;
import java.util.Scanner;

public class Repeat013_1 {
	public static void main(String[] args) {
		char ch = ' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a,b,c 중 하나를 입력하세요 > ");
		ch = sc.next().charAt(0);
		
		if (ch =='a') {System.out.println("apple");}
		else if (ch == 'b') {System.out.println("banana");}
		else if (ch == 'c') {System.out.println("coconut");}
		else {System.out.println("a,b,c가 아니다");}
	}
}
