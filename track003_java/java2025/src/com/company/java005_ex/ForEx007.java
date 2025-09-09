package com.company.java005_ex;

import java.util.Scanner;

public class ForEx007 {
	public static void main(String[] args) {
		int kor= -1, eng=-1, math=-1;
		String auth;
		int total;
		double avg;
		String hab;
		String jang;
		char level;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학번 입력 > ");
		auth = sc.nextLine();
		
		for(;;) {
			if(!(kor>=0 && kor<=100)) {
				System.out.print("국어점수 입력 > ");
				kor = sc.nextInt();
			}
			else if(!(math>=0 && math<=100)) {
				System.out.print("수학점수 입력 > ");
				math = sc.nextInt();
			}
			else if(!(eng>=0 && eng<=100)) {
				System.out.print("영어점수 입력 > ");
				eng = sc.nextInt();
			}
			else break;
		}
		
		total = kor + math + eng;
		avg = total/3.0;
		
		hab = avg<60 ? "불합격" : (kor<40 || math<40 || eng<40 ? "불합격" : "합격");
		jang = avg>=95 ? "장학생" : "";
		level = avg >= 90 ? '수' :
				avg >= 80 ? '우' :
				avg >= 70 ? '미' :
				avg >= 60 ? '양' : '가';
		
		System.out.println("====================");
		System.out.println("학번   국어   영어   수학   총점   평균   합격여부   레벨   장학생");
		System.out.println("====================");
		System.out.print("" + auth + "   " + kor + "   " + eng +
				 "   " + math + "   " + total + "   " + String.format("%.2f", avg) +
				 "   " + hab + "   " + level + "   " + jang);
	}
}
