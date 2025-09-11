package com.company.java006_ex;

public class ArrayEx004 {
	public static void main(String[] args) {
		char [] ch = {'B', 'a', 'n', 'a', 'n', 'a'};
		int a = 0;
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i] == 'a') {
				a++;
			}
		}
		
		System.out.println("a의 갯수는 " + a);
	}
}
