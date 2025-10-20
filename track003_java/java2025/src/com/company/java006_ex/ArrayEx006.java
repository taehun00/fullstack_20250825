package com.company.java006_ex;

public class ArrayEx006 {
	public static void main(String[] args) {
		double [] arr = new double[5];
		double data = 1;
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = data;
			data +=0.1;
			
			System.out.print(String.format("%.1f", data) + " ");
		}
		
	}
}
