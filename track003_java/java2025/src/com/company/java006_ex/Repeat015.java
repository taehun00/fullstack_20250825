package com.company.java006_ex;

public class Repeat015 {
	public static void main(String[] args) {
		char []ch = new char[3];
		char data = ' ';
		
		data = 'a';
		for(int i=0; i<ch.length; i++) {
			ch[i]=data;
			data++;
			System.out.print(ch[i] + " ");
		}
	}
}