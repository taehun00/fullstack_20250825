package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx005 {
	
	public static void sc() {}
	public static int process_total(int kor, int eng, int math) {
		return kor+eng+math;
	}
	public static float process_avg(int total) {
		return (float)(total/3.0);
	}
	public static String process_pass(float avg, int kor, int eng, int math) {
		return avg<60 ? "불합격" : kor>=40 && eng>=40 && math>=40 ? "합격" : "합격";
	}
	public static String process_scholar(float avg) {
		return avg>=95 ? "장학생" : "";
	}
	public static String process_star(float avg) {
		
		return avg == 100 ? "**********" :
			   avg >= 90 ? "*********" :
			   avg >= 80 ? "********" :
			   avg >= 70 ? "*******" : "";
			   
	}
	
	public static void process_show(String name, int kor, int eng, int math, int total, float avg, String pass,
									String jang, String star) {
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균"
				 + "\t" + "합격여부" + "\t" + "장학생" + "\t" + "랭킹");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + 
						String.format("%.2f", avg) + "\t" + pass + "\t" + jang + "\t" + star);
		System.out.println("--------------------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		String name  = ""; 
	    int kor, eng, math, total ;
	    float avg = 0.0f; 
	    String pass = "";
	    String jang = "";
	    String star= ""; 
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("이름을 입력하세요 > ");
		name = sc.next();
		System.out.print("국어 점수를 입력하세요 > ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 > ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 > ");
		math = sc.nextInt();
	    
	    total = process_total(kor , eng, math);
	    avg = process_avg(total);
	    pass = process_pass(avg , kor, eng, math);
	    jang = process_scholar(avg);
	    star = process_star(avg);
	    process_show(name, kor, eng, math, total, avg, pass, jang, star);
	}
}
