package com.company.java007_ex;

public class Array2Ex004 {
	public static void main(String[] args) {
		int arr[][] = new int[2][3];
		
		
		char ch = 'A';
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = ch;
				System.out.print(ch + "\t");
				ch++;
			}
			ch-=2;
			System.out.println();
		}
	}
}
