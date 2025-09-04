package com.company.java004_ex;
import java.util.Scanner;

public class IfEx007 {
	public static void main(String[] args) {
		int year; String result= "평년";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 년도를 입력해주세요> ");
		year = sc.nextInt();
		
		if(year%4==0 && year%100 != 0) result = "윤년";
		
		System.out.printf("%d는 %s입니다.", year, result);
		
	}
}
