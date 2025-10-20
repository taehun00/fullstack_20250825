package com.company.java007;

public class Arr2_002 {
	public static void main(String[] args) {
		int [][]arr = new int[2][3];
		
		int data = 1;
		for(int ch=0; ch<arr.length; ch++) {
			for(int kan=0; kan<arr[ch].length; kan++) {
				arr[ch][kan]=data;
				System.out.print(arr[ch][kan] + "\t");
				data++;
			}
			System.out.println();
		}
		
		
	}
}
