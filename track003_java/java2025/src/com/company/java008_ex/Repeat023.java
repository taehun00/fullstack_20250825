package com.company.java008_ex;

import java.util.Arrays;

public class Repeat023 {
	public static void main(String[] args) {
		int [][]arr = new int[2][3];
		char ch = 'A';
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(ch + "\t");
				ch++;
			}
			ch+=29;
			System.out.println();
		}
	}
}

/*
 	복습문제 2번  
int add(int x, int y) {return x+y;}         답 : c

a. int add(byte a, byte b) {return a+b;}
b. int add(short a, short b) {return a+b;}
c. long add(int a, int b) {return a+b;}   <--------------- 괄호 안의 매개변수 타입이 동일
d. long add(long a, long b) {return a+b;}

	복습문제 3번
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
1. 예상되는 결과 : 정답 적었다가 코드 입력해봤더니 틀려서 힌트 얻었습니다.
				메인안에 출력문 print(arr[1])는 int 타입인데 print함수의 매개변수는 int배열 타입이라 오류 발생
2. 예상되는 결과 : [1, 2, 3]

*/
