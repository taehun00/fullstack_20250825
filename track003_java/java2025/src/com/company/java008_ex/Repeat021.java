package com.company.java008_ex;

import java.util.Arrays;

public class Repeat021 {
	public static void main(String[] args) {
		int [][]arr = new int[2][3];
		int data = 100;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[0].length;j++) {
				data++;
				arr[i][j]=data;
				System.out.print(arr[i][j] + "\t");
			}
			data=100;
			data+=100;
			System.out.println();
		}
	}
}
