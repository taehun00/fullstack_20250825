package com.company.java006;

public class Arr001 {
	public static void main(String[] args) {
		//1. 변수 활용시
		int a=1; int b = 2; int c=3;
		
		
		//2. 배열
		// [같은타입]의 데이터를 [연속된 공간에 저장]하는 자료구조
		// 각 데이터의 저장위치 [인덱스]를 통해서 접근
		
		int [] arr = null; // 주소를 보관할 준비 완료 
		System.out.println(arr);
		
		int [] arr2 = {1,2,3};
		System.out.println(arr2);
		System.out.println("1 꺼내쓰기 > " + arr2[0]);
		System.out.println("2 꺼내쓰기 > " + arr2[1]);
		System.out.println("3 꺼내쓰기 > " + arr2[2]);
		
		//3. 배열 예시 : arr3    1 2 3 4 5
		int [] arr3 = {1,2,3,4,5};
		double [] arr4 = {1.1, 1.2, 1.3};
		char[] arr5 = {'a', 'b', 'c'};
		
		
		
	}
}
