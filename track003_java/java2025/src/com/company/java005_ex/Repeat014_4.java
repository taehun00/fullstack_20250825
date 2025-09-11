package com.company.java005_ex;

public class Repeat014_4 {
	public static void main(String[] args) {
		int i;
		
		for(i=1;i<=5;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		i=1;
		while(i<=5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		i=1;
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=5);
		
	}
}
