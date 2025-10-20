package com.company.java005_ex;

public class ForEx003 {
	public static void main(String[] args) {
		int result = 0;
		for (int i=1; i<=10; i++) {System.out.print(i);
			if (i<10) {System.out.print("+");}
			result += i;
		}

		System.out.print("=" + result);
	}
}
