package com.company.java009_ex;

import java.util.Scanner;

class Calc{
	int num1, num2;
	char op;
	
	
	public Calc() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Calc(int num1, int num2, char op) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}


	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1> ");
		num1 = sc.nextInt();
		System.out.print("숫자2> ");
		num2 = sc.nextInt();
		System.out.print("연산자> ");
		op = sc.next().charAt(0);
	}
	/*
	void opcalc() {
		
			if(op == '+') System.out.println(num1 + num2);
			else if(op == '-') System.out.println(num1 - num2);
			else if(op == '*') System.out.println(num1 * num2);
			else if(op == '/') System.out.println(String.format("%.2f", (double)num1/num2));
			
		
	}
	*/
	
	public int opcalc() {
		if(op == '+') return num1 + num2;
		else if(op == '-') return num1 - num2;
		else if(op == '*') return num1 * num2;
		else if(op == '/') return num1/num2;
		return 0;
	}
	
	/*
	void show() {
		System.out.print(num1 + "" + op + "" + num2 + "=");
		opcalc();
		
	}
	*/
	
	void show() {
		if(opcalc() == 0) {System.out.println("잘못입력");}
		else if(opcalc() == '/') {System.out.println(num1 + "" + op + "" + num2 + "=" + String.format("%.2f",opcalc()));}
		else System.out.println(num1 + "" + op + "" + num2 + "=" + opcalc());
		/*
		if(op == '/')
		System.out.println(num1 + "" + op + "" + num2 + "=" + String.format("%.2f",opcalc()));
		else System.out.println(num1 + "" + op + "" + num2 + "=" + opcalc());
		*/
	}
	
	
}

public class ClassEx007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc  c1= new Calc(10,3,'+');  
		c1.show();
		   
		Calc  c2= new Calc();  
		c2.input();   
		c2.show();
	}

}
