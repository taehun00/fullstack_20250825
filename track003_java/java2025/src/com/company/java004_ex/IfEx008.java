package com.company.java004_ex;
import java.util.Scanner;

public class IfEx008 {
	public static void main(String[] args) {
		String studentId;
		int kor, math, eng;
		int total;
		double avg;
		String isPassed = " "; 		// 합격여부
		char level = ' '; 		 	// 레벨 ex> 수, 우	
		String isScholar = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학번 입력");
		studentId = sc.nextLine();
		System.out.print("국어점수 입력");
		kor = sc.nextInt();
		System.out.print("수학점수 입력");
		math = sc.nextInt();
		System.out.print("영어점수 입력");
		eng = sc.nextInt();
		
		total = kor + math + eng;
		
		avg = total/3.0;
		
		/*
		 if(avg >=60 && kor >=40 && math >=40 && eng >=40)
			{isPassed = "합격";}
		else {isPassed = "불합격";}
		
		if (avg >= 95) {isScholar = "장학생";}
		
		if (avg >= 90) {level = '수';}
		else if (avg >= 80) {level = '우';}
		else if (avg >= 70) {level = '미';}
		else if (avg >= 60) {level = '양';}
		else {level = '가';}
		 */
		
		isPassed = avg < 60 ? "불합격" : kor >= 40 && math >= 40 && eng >= 40 ? "합격" : " ";
		
		isScholar = (avg >= 95 ? "장학생" : " ");
		
		level = (avg >= 90) ? '수' :
				(avg >= 80) ? '우' :
				(avg >= 70) ? '미' :
				(avg >= 60) ? '양' : '가';
		
		
		System.out.println("============================");
		System.out.println("학번	국어	영어	수학	총점	평균	합격여부	레벨	장학생");
		System.out.println("============================");
		System.out.printf("%s %d %d %d %d %.2f %s %c %s",
				studentId, kor, math, eng, total, avg, isPassed, level, isScholar);
		
	}
}
