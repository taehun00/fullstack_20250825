package com.company.java003_ex;

public class CastingIntegerEx {
	public static void main(String[] args) {
		short sh1 = 1; // 2byte
		short sh2 = 2; // 2byte
		short result = (short)(sh1 + sh2); //1 (int) + 2 (int)
		int result2 = sh1 + sh2;
		
		System.out.println(result + result2);
	}
}
