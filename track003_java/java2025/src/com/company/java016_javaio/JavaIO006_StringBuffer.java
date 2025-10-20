package com.company.java016_javaio;

public class JavaIO006_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1. String 문자열누적 - 새로운 주소 (변형 x)
		System.out.println("str주소");
		String str = "ABC";
		System.out.println(str + " " + System.identityHashCode(str));
		
		str += "D";
		System.out.println(str + " " + System.identityHashCode(str));
		//#2. StringBuffer 문자열누적 - 기존 주소 (변형 o)
		System.out.println("sb주소");
		StringBuffer sb = new StringBuffer();
		sb.append("ABC");
		System.out.println(sb + " " + System.identityHashCode(sb));
		
		sb.append("D");
		System.out.println(sb + " " + System.identityHashCode(sb));
	}

}
