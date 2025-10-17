package com.company.java015_ex;

interface InterC2{ String hi(); }

interface Ex2{ void print(String s); }

public class LambdaEx001 {
	public static void main(String[] args) {
		InterC2 c = new InterC2() {

			@Override
			public String hi() {
				// TODO Auto-generated method stub
				return "Good :Day";
			}
		};
		System.out.println(c.hi());
		
		InterC2 c2 = () -> "Good :Day";;
		System.out.println(c2.hi());
		
		Ex2 ex2 = System.out::print;
		ex2.print("Good :Day");
		
	}
}
