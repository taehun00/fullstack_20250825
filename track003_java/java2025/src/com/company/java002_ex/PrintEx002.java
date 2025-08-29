package com.company.java002_ex;
import java.util.Scanner;

public class PrintEx002 {
	public static void main(String[] args) {
		System.out.println(10+"+"+3+"="+(10+3));
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요:");
		int age = sc.nextInt();
		System.out.println("당신의 나이는 "+age+" 입니다.");
		System.out.printf("당신의 나이는 %d 입니다.",age);
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("좋아하는 수(정수) 입력하시오 > ");
		int like = sc.nextInt();
		System.out.println("좋아하는 숫자는 " + like + " 입니다.");
		System.out.printf("좋아하는 숫자는 %d 입니다.", like);
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("파이값을 입력하시오 >");
		float a = sc.nextFloat();
		System.out.println("파이값은 " + a + "입니다.");
		System.out.printf("파이값은 %.6f입니다.\n", a);
		System.out.printf("파이값은 %.2f입니다.\n", a);
		System.out.printf("파이값은 %.3f입니다.", a);
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = sc.nextInt();
		float total = kor + eng + math;
		System.out.printf("총점 : %.0f\n", total);
		System.out.printf("평균 : %.2f", total/3);
		*/
		
		// System.out.println((int)1.5+(int)2.7);
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1 입력 >");
		int enum1 = sc.nextInt();
		System.out.println("숫자2 입력 >");
		int enum2 = sc.nextInt();
		System.out.println(enum1 + " / " + enum2 + " = " + ((float)enum1/enum2));
		*/
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		float avg = (float) 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수입력 :");
		kor = sc.nextInt();
		System.out.println("영어점수입력 :");
		eng = sc.nextInt();
		System.out.println("수학점수입력 :");
		math = sc.nextInt();
		total = kor + eng + math;
		avg = total/3;
		System.out.println("::::::::::::::::::::::");
		System.out.println("::  GREEN IT SCORE  ::");
		System.out.println("::::::::::::::::::::::");
		System.out.println("국어 영어 수학	총점	평균");
		System.out.println(kor+" "+eng+" "+math+" "+ total+" "+ String.format("%.6f", (float)total/3));
		
	}
}