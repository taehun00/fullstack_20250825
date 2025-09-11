package com.company.java006_ex;

public class ArrayEx005 {
	public static void main(String[] args) {
		char [] ch = {'B', 'a', 'n', 'a', 'n', 'a'};
		int A=0;
		int a=0;
		
		for (int i=0; i<ch.length; i++) {
			if(ch[i]>=65 && ch[i]<=90) {
				A++;
			}
			else if(ch[i]>=97 && ch[i]<=122){
				a++;
			}
		}
		
		System.out.println("대문자 갯수 > " + A);
		System.out.println("소문자 갯수 > " + a);
	}
}
