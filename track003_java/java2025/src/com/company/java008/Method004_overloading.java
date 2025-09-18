package com.company.java008;

import java.util.Arrays;

public class Method004_overloading {
	public static void show() {System.out.println("마법상자");}
	
	public static void show(int a) {System.out.println("무조건 * 10 > " + a*10);}
	
	public static void show(int a, int b, int c) {
		System.out.println("무조건 * 100 > a: " + a*100);
		System.out.println("무조건 * 100 > b: " + b*100);
		System.out.println("무조건 * 100 > c: " + c*100);
	}
	
	
	
	public static void main(String[] args) {
		int [] arr= {1,2,3};
		
		show(); // public static void show(){}
		show(1); // public static void show( int a ){10베}
		show(arr[1]);
		show(1,2,3);
		show(arr[0],arr[1],arr[2]); // [값] show(1,2,3)
		show(arr); //public static void show( int []arr ){}
		System.out.println("main : " + System.identityHashCode(arr) + Arrays.toString(arr));
	}

	private static void show(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] *= 1000;
		}
		System.out.println("show 무조건 * 1000 > "  + Arrays.toString(arr));
	}
}
