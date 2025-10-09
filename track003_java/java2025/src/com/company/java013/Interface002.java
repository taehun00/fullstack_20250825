package com.company.java013;
//1. 클래스는 단일상속



class Papa2{int brain;}
class Mama2{int brain;}


/*			{inter()}				{method()}				{method()}
 *		<<interface>>Inter20	<<interface>>Inter21	<<interface>>Inter22
 *						    			  ↑					↑(실선 + 속이빈화살표)
 *
 * 								<<interface>>Inter23	{method()}
 * 
 * 					⋯⋯⋯△					⋯⋯⋯△			
 * 		<<class>>Papa2
 * 					↑  
 * 					Using1
 * 					{@method()}
 * 					{@inter()}
 */

//2. 인터페이스는 다중상속
interface Inter20{void inter();}
interface Inter21{void method();}
interface Inter22{void method();}
interface Inter23 extends Inter21, Inter22{}

//3. 많이 쓰는 형식 	주요메인클래스 상속, 추가설계1, 추가설계2
class Using1 extends Papa2 implements Inter23 , Inter20 {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inter() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Interface002 {
	public static void main(String[] args) {
		Using1 using1 = new Using1();
		
		if(using1 instanceof Object) {
			System.out.println("1. Object");
		}
		if(using1 instanceof Papa2) {
			System.out.println("2. Papa");
		}
		/*
		 * if(using1 instanceof Mama) { System.out.println("3. Mama"); }
		 */
		if(using1 instanceof Inter20) {
			System.out.println("4. Inter20");
		}
		//Incompatible conditional operand types Using1 and Mama
	}
}
