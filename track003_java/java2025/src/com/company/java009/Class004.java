package com.company.java009;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
/*	Object			2) Object	{	}	3)
 * 	   ↑
 * 	Product			1) Product(){		4) Product p1 = new Product();
 */
class Product{
	String name;
	int price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
public class Class004 {
	public static void main(String[] args) {
		Product p1 = new Product();
		System.out.println(p1);
	}
}
