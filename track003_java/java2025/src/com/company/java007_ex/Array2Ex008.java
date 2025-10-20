package com.company.java007_ex;

public class Array2Ex008 {
	public static void main(String[] args) {
		int[][] datas = {   {  10, 10, 10 ,10},      				// 00 01 02 03 04
	            			{  20, 20, 20 ,20},      				// 10 11 12 13 14
	            			{  30, 30, 30 ,30} 	};  // 3층 4칸   	// 20 21 22 23 24
		int[][] result = new int[datas.length+1][datas[0].length+1];// 30 31 32 33 34
		
		
		for(int i=0;i<datas.length;i++) {
			for(int j=0;j<datas[0].length;j++) {
				result[i][j] = datas[i][j];
				result[i][datas[0].length] += datas[i][j];
				result[datas.length][j] += datas[i][j];
				result[datas.length][datas[0].length] += datas[i][j];
			}
		}
		
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
