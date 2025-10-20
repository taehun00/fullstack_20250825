package com.company.java007;

import java.util.Arrays;

public class Arr2_001 {
	public static void main(String[] args) {
		int [][] arr = {	{1,2,3}, //00 01 02
							{4,5,6} 	//10 11 12
						};
		System.out.println(arr);					  //[I@378fd1ac
		System.out.println(Arrays.toString(arr)); 	  // [I@49097b5d],[I@6e2c634b]
		System.out.println(Arrays.deepToString(arr)); // [1,2,3],[4,5,6]
		
		// 눈에 보이는대로
		System.out.print(arr[0][0]+"\t");System.out.print(arr[0][1]+"\t");System.out.print(arr[0][2]+"\t");
		System.out.println();
		System.out.print(arr[1][0]+"\t");System.out.print(arr[1][1]+"\t");System.out.print(arr[1][2]+"\t");
		System.out.println();
		
		// 칸정리
		for(int kan=0; kan<=arr.length; kan++) {System.out.print(arr[0][kan]+"\t");}
		System.out.println();
		for(int kan=0; kan<=arr.length; kan++) {System.out.print(arr[1][kan]+"\t");}
		System.out.println();
		
		// 총정리
		for (int ch=0; ch<=1; ch++) {
			for(int kan=0; kan<arr[ch].length; kan++) {System.out.print(arr[ch][kan]+"\t");}
			System.out.println();
		}
		
		
	}
}
