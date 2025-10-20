package com.company.java005_ex;

public class RepeatEx010 {
	public static void main(String[] args) {
		char i = ' ';
		for (i='A';i<='Z'; i++) {
			System.out.print(i);
			if(i%5 == 4) {
				System.out.print("\n");
			}
		}
		System.out.println("");
		
		i='A';
		while(i<='Z') {
			System.out.print(i);
			if(i%5 == 4) {
				System.out.print("\n");
			}
			i++;
		}
		System.out.println("");
		
		i='A';
		do {
			System.out.print(i);
			if(i%5 == 4) {
				System.out.print("\n");
			}
			i++;
		}while(i<='Z');
	}
}