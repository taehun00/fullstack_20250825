package com.company.java008_ex;

import java.util.Arrays;

public class ttt {
	public static void print(int []arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]+=10;
		}
	}
	
	public static void main(String[] args) {
	 	int []arr = {1,2,3};
		
		System.out.println(print(arr[1]));
		// print(arr);
		System.out.println(Arrays.toString(arr));
	}

}
