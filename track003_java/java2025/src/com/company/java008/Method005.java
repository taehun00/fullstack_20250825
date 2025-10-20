package com.company.java008;

import java.util.Arrays;

public class Method005 {
	
	public static void call(int a) {
		System.out.println(a+10);
	}
	
	public static void call(int []arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]+=100;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int []arr = {10,20,30};
		
		call(10);					// +10을 해주는 마법상자
		call(arr[0]);
		
		System.out.println("main > " + System.identityHashCode(arr));
		System.out.println("main > " + Arrays.toString(arr) );
		
		call(arr);					// +100을 해주는 마법상자
		System.out.println("main > " + System.identityHashCode(arr));
		System.out.println("main > " + Arrays.toString(arr) );
	}
}
