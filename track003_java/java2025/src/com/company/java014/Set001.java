package com.company.java014;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Candy{
	String name;
	int price;
	public Candy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candy(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Candy [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candy other = (Candy) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
	
	
}

public class Set001 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<>();
		set1.add(new Integer(1));
		set1.add(1);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println(set1);
		
		Set<Candy> set2 = new HashSet<>();
		set2.add(new Candy("츕파츕스", 300));
		set2.add(new Candy("츕파츕스", 300));
		set2.add(new Candy("츕파츕스", 300));
		set2.add(new Candy("청포도", 1300));
		set2.add(new Candy("멘톨", 2300));
		
		System.out.println(set2);
	}
}
