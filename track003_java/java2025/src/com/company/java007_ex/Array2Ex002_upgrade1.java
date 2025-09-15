package com.company.java007_ex;

public class Array2Ex002_upgrade1 {
	public static void main(String[] args) {
		int[][] arr2 = {
			    {101, 102, 103},
			    {200, 201, 202},
			    {301, 302, 303}
			};
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				if(arr2[i][j]%2==0) {
					System.out.print("짝수 arr2[" + i + "][" + j + "] = " + arr2[i][j]);
					System.out.println();
				}
			}
		}
	}
}
