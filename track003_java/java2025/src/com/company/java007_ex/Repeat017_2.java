package com.company.java007_ex;

public class Repeat017_2 {
	public static void main(String[] args) {
		char [][]arr = new char[2][3];
		char ch = 'A';
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(ch + "\t");
				ch++;
			}
			ch-=2;
			System.out.println();
		}
	}
}
