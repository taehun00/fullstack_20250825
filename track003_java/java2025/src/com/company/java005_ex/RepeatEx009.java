package com.company.java005_ex;

public class RepeatEx009 {
	public static void main(String[] args) {
		int i; int a = 0;
		int result = 0;
		String b = "";
		for (i=1;i<=10;i++) {
			if(i % 3 == 0) {
				result += i; // i = 3 , 6 , 9

				if(b != "") {
					b += "+";
					b+=" ";
				}
				b+=i;
				b+=" ";
			}
		}
		System.out.println("1~10까지 3의 배수의 합 : " + b + "= " + result);
		
		i = 1; result = 0;
		while(i<=10){
			if (i % 3 == 0) {
				result += i;
			}
			i++;
		}
		System.out.println("1~10까지 3의 배수의 합 : " + result);
		
		i = 1; result = 0;
		do {
			if (i % 3 == 0) {
				result += i;
			}
			i++;
		}while(i<10);
		System.out.println("1~10까지 3의 배수의 합 : " + result);
	}
}
