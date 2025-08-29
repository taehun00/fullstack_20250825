package com.company.java002_ex;
import java.util.Scanner;

public class InputEx002 {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("좋아하는 수(정수)를 입력하시오 > ");
		num = sc.nextInt();
		
		System.out.println("좋아하는 숫자는 " + num + "입니다.");
		*/
		
		/*Scanner sc = new Scanner(System.in);
		int year;
		int month;
		int day;
		
		System.out.println("태어난 년도 입력 > ");
		year = sc.nextInt();
		System.out.println("태어난 달 입력 > ");
		month = sc.nextInt();
		System.out.println("태어난 일 입력 > ");
		day = sc.nextInt();
		
		System.out.println("당신의 나이는 " + (2025 - year + 1) + "입니다.");
		*/
		
		Scanner sc = new Scanner(System.in);
		int like = 0;
		
		while(true) {
			System.out.println("정수(1,2,3)를 입력하세요 >" );
			if (sc.hasNextInt()) {
				like = sc.nextInt();
				if (like ==1 | like == 2 | like == 3) {
					break;
				}
				else {
					System.out.println("정수가 아닙니다.");
				}
			} else {
				System.out.println("숫자가 아닙니다.");
				sc.next();
			}
		}
		
		System.out.println("입력한 값은" + like + "입니다.");
		sc.close();
	}
}
