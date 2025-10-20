package com.company.java005_ex;

public class ForEx004 {
	public static void main(String[] args) {
		int a = 0;
		
		System.out.print("3의배수 : ");
		for (int i=1; i<=10; i++) {
			if (i%3==0) {
				System.out.print((i==3? "":",") + i);
				a++;
				
			}
		}
		System.out.println("\n갯수 : " + a + "개");
	}

}
