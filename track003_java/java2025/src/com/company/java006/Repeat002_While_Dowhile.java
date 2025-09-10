package com.company.java006;

public class Repeat002_While_Dowhile {
	public static void main(String[] args) {
		// 1. for (반복횟수 알때)
		// 1 2 3
		System.out.println("1. for");
		for (int i=1; i<=3; i++) {System.out.print(i + "\t");}
		
		// 2. while (반복횟수 모를때 - 게시판)
		System.out.println("2. while");
		
		int i = 1;
		while (i<=3){ 	
			System.out.print(i + "\t");
			i++;
		}
		
		// 3. dowhile (무조건 1번은 실행해야할때)
		System.out.println("3. do while");
		i = 1;
		do{ 	
			System.out.print(i + "\t");
			i++;
		} while ( i<3 );
		
	}
}
