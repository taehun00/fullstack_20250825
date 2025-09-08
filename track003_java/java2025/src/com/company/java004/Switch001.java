package com.company.java004;
import java.util.Scanner;

public class Switch001 {
	public static void main(String[] arg){
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 한개 입력 > ");
		a = sc.nextInt();
		
		if (a==1) {System.out.println("1이다");} // a==1이면 else부분 안봄
		else if (a==2) {System.out.println("2이다");}
		else if (a==3) {System.out.println("3이다");}
		
		switch(a) {
		case 1 : System.out.println("1이다"); break;
		case 2 : System.out.println("2이다"); break;
		case 3 : System.out.println("3이다"); break;
		}
	}
}
