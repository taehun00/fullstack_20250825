package com.company.java009_ex;

import java.util.Scanner;

class MyPrice001{
	String name;
	int price;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품이름 입력 > ");
		this.name = sc.next();
		System.out.print("상품가격 입력 > ");
		this.price = sc.nextInt();
	}

	void show() {
		System.out.println("상품정보입니다");
		System.out.println("상품이름 : " + this.name + " / " + "상품가격 : " + this.price);
	}
}

public class ClassEx002 {
	public static void main(String[] args) {
		MyPrice001 p1 = new MyPrice001();
		p1.input();
		p1.show();
		
	}
}



