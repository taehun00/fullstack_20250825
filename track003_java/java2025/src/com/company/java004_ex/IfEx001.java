package com.company.java004_ex;
import java.util.Scanner;

public class IfEx001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int avg;
		
		System.out.print("평균을 입력하세요> ");
		avg = sc.nextInt();
		
		if (avg >= 60)
			{System.out.println("합격");}
		if (avg < 60){System.out.println("불합격");}
	}
}
