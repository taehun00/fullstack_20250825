package com.company.java007_ex;

public class Array2_upgrade3 {
	public static void main(String[] args) {
		int[][] datas = {
		    { 15, 22, 8, 19 },
		    { 33, 5, 17, 11 },
		    { 9, 27, 14, 6 }	};  // 3층 4칸

		int[][] result = new int[datas.length + 1][datas[0].length + 1];
		int max = 0;
		for(int i=0;i<datas.length;i++) {
			for(int j=0;j<datas[0].length;j++) {
				result[i][j] = datas[i][j];
				if (result[i][j] > max) {
					max = result[i][j];
					result[i][datas[0].length] = max;			
				}
			}
			max = 0;
		}
		
		for(int j=0;j<datas[0].length;j++) {
			for(int i=0;i<datas.length;i++) {
				if (result[i][j] > max) {
					max = result[i][j];
					result[datas.length][j] = max;			
				}
			}
			max = 0;
		}
		
		for(int i=0;i<datas.length;i++) {
			for(int j=0;j<datas[0].length;j++) {
				result[i][j] = datas[i][j];
				if (result[i][j] > max) {
					max = result[i][j];
					result[datas.length][datas[0].length] = max;
				}
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
