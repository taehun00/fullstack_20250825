package com.company.java006_ex;

public class Ex_4 {
	public static void main(String[] args) {
		int [] num = new int[3];
		int data = 10;
		
		for (int i=0; i<num.length; i++) {
			num[i] = data; data+=10;
			System.out.print(num[i] + " ");
		}
	}
}