package com.company.java002_ex;
import java.util.Scanner;

public class InputEx003 {
	public static void main(String[] args) {
		//변수
		int num=0;
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("태어난 년도를 입력하세요. >");
		num = scanner.nextInt();
		//처리
		num = 2025 - num + 1;   //2025-2000
		//출력
		System.out.println("당신의 나이는 "+num+"살 입니다.");
	}
}