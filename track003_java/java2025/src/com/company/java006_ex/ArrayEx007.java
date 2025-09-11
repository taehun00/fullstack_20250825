package com.company.java006_ex;

public class ArrayEx007 {
	public static void main(String[] args) {
		char []arr = new char[5];
		char data = 'A';
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=data;
			data +=1;
			
			System.out.print(arr[i] + " ");
		}
		
	}
}
