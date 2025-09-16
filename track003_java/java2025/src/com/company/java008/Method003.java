package com.company.java008;

import java.util.Random;

public class Method003 {
	public static String sign() {
		return "♥ 전설";
	}
	public static String intro(String name, int level) {
		return "[" + name + "]님은 레벨[" + level +"]";
	}
	public static double spell(int level) {
		return level/2.0;
	}
	public static int luck() {
		Random rand = new Random();
		int result = rand.nextInt(100) + 1; // 0~100보다 작은 숫자 랜덤
		return result;
	}
	public static void main(String[] args) {
		
		System.out.println("1. 당신의 이름은?"+ sign());
		System.out.println("2. 당신 설명?" + intro("홍길동" , 9));
		System.out.println("2. 당신 설명?" + intro( sign() , 10));
		System.out.println("3. 반타작 저주> " + spell(9));
		System.out.println("4. 운세> " + luck());
	}
}
