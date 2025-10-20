package com.company.java007_ex;

public class Repeat017_1 {
	public static void main(String[] args) {
		int [][]arr = new int[2][3];
		int data = 101;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(data + "\t");
				data++;
			}
			System.out.println();
		}
	}
}
