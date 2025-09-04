package com.company.java003_ex;
import java.util.Scanner;

public class CastingEx002 {
	public static void main(String[] args) {
		int kor;
		int eng;
		int math;
		int total;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수입력 : ");
		kor = sc.nextInt();
		System.out.print("영어점수입력 : ");
		eng = sc.nextInt();
		System.out.print("수학점수입력 : ");
		math = sc.nextInt();
		total = kor + eng + math;
		
		double avg = (double)total/3;
		int level = (int)avg/10;
		
		System.out.println("::::::::::::::::::::::");
		System.out.println("::  GOOD IT SCORE  ::");
		System.out.println("::::::::::::::::::::::");
		System.out.println("국어 영어 수학 총점 평균 레벨");
		System.out.println(kor+" "+eng+" "+math+" "+ total+" "+ String.format("%.2f", avg)+" "+level);
		System.out.printf("%d %d %d %d %.2f %d\n", kor, eng, math, total, avg, level);
	}
}
