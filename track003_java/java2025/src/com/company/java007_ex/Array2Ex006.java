package com.company.java007_ex;

public class Array2Ex006 {
	public static void main(String[] args) {
		int [][]arr = new int[5][5];
		/*
		int data = 1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = data;
				System.out.print(arr[i][j] + "\t");
				data++;
			}
			System.out.println();
		}
		*/
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = 1;
				System.out.print(arr[i][j] + "\t");
				arr[i][j]++;
			}
			System.out.println();
		}
	}
}
