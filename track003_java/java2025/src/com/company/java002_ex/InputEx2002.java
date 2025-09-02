package com.company.java002_ex;
import java.util.Scanner;

public class InputEx2002 {
	public static void main(String[] args) {
		int kor;
		int eng;
		int math;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하시오. >");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하시오. >");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하시오. >");
		math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = (kor + eng + math)/3.0;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
}
