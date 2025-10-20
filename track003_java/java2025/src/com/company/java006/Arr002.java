package com.company.java006;

import java.util.Arrays;

public class Arr002 {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3};
		int [] arr2 = new int[8];
		
		System.out.println(arr2); // arr2 주소
		System.out.println(Arrays.toString(arr2)); // [0,0,0]
		
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		
		int data = 10;
		arr2[3] = data; data+=10;
		arr2[4] = data; data+=10;
		arr2[5] = data;
		
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i] + " ");
		}
	}
}
