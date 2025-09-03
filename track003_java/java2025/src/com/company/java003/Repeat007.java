package com.company.java003;
import java.util.Scanner;

public class Repeat007 {
	public static void main(String[] args) {
		int kor;
		int eng;
		int mat;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하시오. ");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력하시오. ");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하시오. ");
		mat = sc.nextInt();
		
		int total = kor + eng + mat;
		double avg = (double)total/3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
}
