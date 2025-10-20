package com.company.java008_ex;

public class MethodEx002 {
	public static void test1(int a) {System.out.println(a);}
	public static void test2(double b) {System.out.println(b);}
	public static void hap(int c, int d) {
		int result = 0;
		for(;c<=d;c++) {
			result += c;
		}
		System.out.print(result+"\n");
	}
	public static void disp(int e, char f) {
		for(int i=1;i<=e;i++) {
			System.out.print(f);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		test1(10);
		test2(1.2);
		hap(2,10);
		disp(7,'*');
	}
}
