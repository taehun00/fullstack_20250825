package com.company.java006_ex;

public class Ex_3 {
	public static void main(String[] args) {
		int i;
		
		for(i=5;i>=1;i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		i=5;
		while(i>=1) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println();
		
		i=5;
		do {
			System.out.print(i + " ");
			i--;
		}while(i>=1);
	}
}
