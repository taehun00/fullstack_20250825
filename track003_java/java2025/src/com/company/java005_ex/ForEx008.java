package com.company.java005_ex;

public class ForEx008 {
	public static void main(String[] args) {
		int i = 1;
		
		for (i =1; i<=5; i++) {System.out.print(i + "\t");}
		System.out.println("");
		
		i = 1;
		while (i<=5) {
			{System.out.print(i + "\t");}
			i++;
		}
		System.out.println("");
		
		i = 1;
		do {
			{System.out.print(i + "\t");}
			i++;
		}while(i<=5);
		System.out.println("");
		
		
		
		for (i =5; i>=1; i--) {System.out.print(i + "\t");}
		System.out.println("");
		
		i = 5;
		while(i>=1) {
			{System.out.print(i + "\t");}
			i--;
		}
		System.out.println("");
		
		i = 5;
		do {
			{System.out.print(i + "\t");}
			i--;
		}while(i>=1);
		System.out.println("");
		
		for (i =1; i<=3; i++) {System.out.print("JAVA" + i + "\t");}
		System.out.println("");
		
		i = 1;
		while(i<=3){
			{System.out.print("JAVA" + i + "\t");}
			i++;
		}
		System.out.println("");
		
		i = 1;
		do {
			{System.out.print("JAVA" + i + "\t");}
			i++;
		}while(i<=3);
	}
}
