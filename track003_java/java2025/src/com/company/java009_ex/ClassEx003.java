package com.company.java009_ex;

class Coffee{
	String name = "아메리카노";
	int price = 2000;
	int num = 1;
	
	
	public Coffee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Coffee(String name, int price, int num) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
	}


	void show(){
		System.out.println("=====커피");
		System.out.print("커피명 : " + name);
		System.out.print("\n커피잔수 : " + num);
		System.out.print("\n커피가격 : " + price);
		System.out.println();
	}
}

public class ClassEx003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee a1 = new Coffee("까페라떼" ,8000 , 2); 
		a1.show();
		Coffee a2 = new Coffee();
		a2.show();
	}

}
