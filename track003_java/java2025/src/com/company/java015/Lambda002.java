package com.company.java015;

interface InterA2{ void hi(); }
interface InterB2{ void hi(String name); }
interface InterC2{ String hi(); }
interface InterD2{ String hi(int num, String name); }


public class Lambda002 {
	public static void main(String[] args) {
		//1-1. InterA2
		InterA2 a = new InterA2() {
			@Override
			public void hi() {
				// TODO Auto-generated method stub
				System.out.println("hi");
			}
		};
		a.hi();
		
		InterA2 a2 = () -> {
			System.out.println("hi2");
		};								// 처리할 일이 한 줄이면 {} 생략 가능
		a2.hi();
		
		
		//InterB2
		InterB2 b = new InterB2() {
			@Override
			public void hi(String name) {
				// TODO Auto-generated method stub
				System.out.println("hi! " + name);
			}
		};
		b.hi("taehun");
		
		InterB2 b2 = (String name) -> {
			System.out.println("hi2! " + name);
		};
		b2.hi("taehun");
		
		InterB2 b3 = (name) -> {
			System.out.println("hi3! " + name);
		};
		b3.hi("taehun");
		
		InterB2 b4 = name -> {
			System.out.println("hi4! " + name);
		};
		b4.hi("taehun");
		
		//InterC2
		InterC2 c = new InterC2() {
			@Override
			public String hi() {
				// TODO Auto-generated method stub
				return "Good Day";
			}
			
		};
		System.out.println(c.hi());
		
		InterC2 c2 = ()->{
			return "Good Day2";
		};
		System.out.println(c2.hi());
		
		InterC2 c3 = ()-> "Good Day3";
		System.out.println(c3.hi());
		
		//InterD2
		InterD2 d = new InterD2() {

			@Override
			public String hi(int num, String name) {
				// TODO Auto-generated method stub
				String result = "";
				for(int i=0; i<num; i++) {
					result += '★';
				}
				return "hi " + name + result;
			}
		};
		System.out.println(d.hi(1, "sally"));
		System.out.println(d.hi(2, "sally"));
		
		InterD2 d2 = (int num, String name) -> {
			String result = "";
			for(int i=0; i<num; i++) {
				result += '★';
			}
			return "hi " + name + result;
		}; 
		System.out.println(d2.hi(1, "taehun"));
		
		InterD2 d3 = (num, name) -> {
			String result = "";
			for(int i=0; i<num; i++) {
				result += '★';
			}
			return "hi " + name + result;
		};
		System.out.println(d3.hi(2, "taehun"));
	}
}
