package com.company.java010;

//1. final 변경하지마
//클래스는 부품객체
//클래스는 상태(멤버변수)와 행위(멤버함수)
// 상속x  상수		  override X
final class FinalEx{
	final static String gaecheon = "10-3";
	String name;
	final void show() {System.out.println( FinalEx.gaecheon + "\t" + name);}
}

class FinalSon extends FinalEx{

	public FinalSon() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}

public class FinalEx001 {
	public static void main(String[] args) {
		//FinalEx.gaecheon = "10-1"; //The final field FinalEx.gaecheon cannot be assigned
		//FinalEx.show();
		FinalEx saram = new FinalEx();
		saram.name = "hun";
		saram.show();
	}
}
